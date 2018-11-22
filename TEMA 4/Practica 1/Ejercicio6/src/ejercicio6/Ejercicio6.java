/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio6 {

    /**
     * Se trata de hacer un "calendario" con las faltas de los alumnos
     * 
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        int[] diaArray = new int[5];
        int[] codigoArray = new int[5];
        int[] faltaArray = new int[5];

        cogerDatos(diaArray, codigoArray, faltaArray);

        String valor = datosSalida(diaArray, codigoArray, faltaArray);

        JOptionPane.showMessageDialog(null, valor);

    }

    /**
     * 
     * 
     * @param diaArray El dia en el que el alumnado ha faltado
     * @param codigoArray El codigo del alumnado
     * @param faltasArray Faltas totales del alumno
     * 
     * @throws FormatException para cuando falla la conversion de numeros
     * @throws Exception Generica
     */
    public static void cogerDatos(int[] diaArray, int[] codigoArray, int[] faltasArray) {

        String codigo;
        int dia, faltas, continuar;

        do {
            try {
                for (int x = 0; x < diaArray.length; x++) {
                    codigo = JOptionPane.showInputDialog(null, "Introduce un codigo de alumno");
                    dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un día"));
                    faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de faltas"));

                    if (!Arrays.toString(codigoArray).contains(codigo)) {
                        codigoArray[x] = Integer.parseInt(codigo);
                        diaArray[x] = dia;
                        faltasArray[x] = faltas;
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en la combersion de numeros" + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }

            continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");
        } while (continuar == 0);

    }

    /**
     * Almacenamos los datos que vamos a mostrar por pantalla cuando el
     * usuario quiera finalizar
     * 
     * @param diaArray El dia en el que el alumnado ha faltado
     * @param codigoArray El codigo del alumnado
     * @param faltasArray Faltas totales del alumno
     * @return valor 
     * 
     */
    public static String datosSalida(int[] diaArray, int[] codigoArray, int[] faltasArray) {
        String valor = "";
        for (int x = 0; x < codigoArray.length; x++) {
            valor += "Alumno: " + codigoArray[x] + "  Dia: " + diaArray[x] + "  Faltas: " + faltasArray[x] + "\n";
        }
        return valor;
    }

}

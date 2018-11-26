/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     *
     * Recoger la informacion con la que vamos a trabajar
     *
     * @param matriz array bidimensional
     * @param suma suma de los valores
     * @param fila fila
     * @param columna columna de la fila selecciona
     * @param valores valor asignado a la posicion
     * @param continuar si el usuario desea seguir introduciendo datos
     *
     *
     * @throws FormatException para cuando falla la conversion de numeros
     * @throws Exception Generica
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int matriz[][] = new int[10][10];
        int suma[] = new int[10];
        int fila = 0, columna = 0, valores = 0;

        int continuar;

        do {
            try {
                fila = Integer.parseInt(JOptionPane.showInputDialog(null, "fila"));
                columna = Integer.parseInt(JOptionPane.showInputDialog(null, "columna"));
                valores = Integer.parseInt(JOptionPane.showInputDialog(null, "valor"));
                
                matriz[fila - 1][columna - 1] = valores;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en la combersion de numeros" + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }

            

            continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");
        } while (continuar == 0);

        mostrarDatos(matriz, suma);

    }

    /**
     * Matriz.lenght es la longitud del primer array mientras que matriz[x] es
     * el representante del segundo array asi a suma se le ira sumando
     * sucesivamente los valores de cada fila
     *
     * @param matriz
     * @param suma
     */
    public static void sumar(int matriz[][], int suma[]) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                suma[x] += matriz[x][y];
            }
        }
    }

    /**
     * Valores utilizados para mostrar los datos por pantalla
     *
     * @param matriz
     * @param suma
     */
    public static void mostrarDatos(int matriz[][], int suma[]) {
        sumar(matriz, suma);

        JOptionPane.showMessageDialog(null, "1: " + suma[0] + "\n"
                + "2: " + suma[1] + "\n"
                + "3: " + suma[2] + "\n"
                + "4: " + suma[3] + "\n"
                + "5: " + suma[4] + "\n"
                + "6: " + suma[5] + "\n"
                + "7: " + suma[6] + "\n"
                + "8: " + suma[7] + "\n"
                + "9: " + suma[8] + "\n"
                + "10: " + suma[9]);
    }
}

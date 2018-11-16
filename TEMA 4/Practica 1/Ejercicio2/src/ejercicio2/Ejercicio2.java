/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Excepciones.NombreVacio;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nmes = new String[12];
        String mes = "";
        int contador = 0;

        nmes[0] = "Enero";
        nmes[1] = "Febrero";
        nmes[2] = "Marzo";
        nmes[3] = "Abril";
        nmes[4] = "Mayo";
        nmes[5] = "Junio";
        nmes[6] = "Julio";
        nmes[7] = "Agosto";
        nmes[8] = "Septiembre";
        nmes[9] = "Octubre";
        nmes[10] = "Noviembre";
        nmes[11] = "Diciembre";

        try {
            mes = JOptionPane.showInputDialog("Introduce un mes con letras");

            if (mes.isEmpty()) {
                throw new NombreVacio();
            }

            for (int x = 0; x < 12; x++) {
                if (mes.equalsIgnoreCase(nmes[x])) {

                    contador++;
                }

            }

        } catch (NombreVacio e) {
            JOptionPane.showMessageDialog(null, "El nombre esta vacio ");            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

        if (contador >= 1) {
            JOptionPane.showMessageDialog(null, mes + " es correcto");

        } else {
            JOptionPane.showMessageDialog(null, mes + " es incorrecto");
        }

    }

}

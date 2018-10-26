/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_13;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1_13 {

    /**
     * @param args the command line arguments
     */
    static int numero;
    static int dm, um, c, d, u;
    static boolean capicua = false;

    public static void main(String[] args) {
        // TODO code application logic here
        int respuesta = 0;

        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 99999, sin decimales"));
                if (numero > 99999 || numero < 0) {
                    JOptionPane.showMessageDialog(null, "El numero " + numero + " es incorrecto");
                } else {
                    capicua();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto: " + e.getMessage());
            }
            respuesta = JOptionPane.showConfirmDialog(null, "Quieres introducir otro numero?");
        } while (respuesta == 0);

    }

    public static void capicua() {
        u = numero % 10;
        numero = numero / 10;

        d = numero % 10;
        numero = numero / 10;

        c = numero % 10;
        numero = numero / 10;

        um = numero % 10;
        numero = numero / 10;

        dm = numero;

        //5 cifras
        if (dm == u && um == d) {
            capicua = true;
        }
        //4 cifras
        if (dm == 0 && um == u && c == d) {
            capicua = true;
        }

        //3 cifras
        if (dm == 0 && um == 0 && c == u) {
            capicua = true;
        }

        //2 cifras
        if (dm == 0 && um == 0 && c == 0 && d == u) {
            capicua = true;
        }

        if (capicua) {
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es capicua");
        }

    }
}

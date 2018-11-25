/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int abc[];
        abc = new int[25];
        String texto = "", datos = "";
        char letra = 'a';
        int y = 0;

        for (int x = 0; x < abc.length; x++) {
            abc[x] = 0;
        }
        texto = JOptionPane.showInputDialog(null, "Introduce el texto");
        while (y < 25) {
            for (int x = 0; x < texto.length(); x++) {
                if (texto.charAt(x) == letra) {
                    abc[y]++;
                }
            }
            letra++;
            y++;

        }

        letra = 'a';
        for (int x = 0; x < abc.length; x++) {
            if (abc[x] != 0) {
                datos += letra + " = " + abc[x] + "\n";
            }

            letra++;
        }

        JOptionPane.showMessageDialog(null, datos);

    }
}

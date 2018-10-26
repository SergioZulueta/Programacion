/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

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
        String frase;

        frase = JOptionPane.showInputDialog("Introduce una frase");
        String frasealreves = "";

        for (int x = frase.length() - 1; x >= 0; x--) {
            frasealreves = frasealreves + frase.charAt(x);
        }

        JOptionPane.showMessageDialog(null, "Frase dada la vuelta : " + frase + " : " + frasealreves);

    }

}

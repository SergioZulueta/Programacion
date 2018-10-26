/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_6;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2;
        int respuesta = 0;

        do {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

            if (n1 % n2 == 0) {
                JOptionPane.showMessageDialog(null, "Si son multiplos");
            } else {
                JOptionPane.showMessageDialog(null, "No son multiplos");
            }
            respuesta = JOptionPane.showConfirmDialog(null, "Quieres continuar?");

        } while (respuesta == 0);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        double divisor = 0;
        double resto = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        divisor = numero;
        
        do {
            divisor = divisor - 1;
            resto = numero % divisor;
        } while (resto != 0 && divisor > 2);

        if (resto == 0) {
            JOptionPane.showMessageDialog(null, "El numero tecleado NO es primo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero tecleado SI es primo");
        }

    }

}

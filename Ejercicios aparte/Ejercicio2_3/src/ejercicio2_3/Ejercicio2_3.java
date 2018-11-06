/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int resto;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero, cuando introduzcas 0 el programa se cerrara"));

                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El numero es par");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero introducido es impar");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getClass());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getClass());
            }

        } while (numero != 0);

    }

}

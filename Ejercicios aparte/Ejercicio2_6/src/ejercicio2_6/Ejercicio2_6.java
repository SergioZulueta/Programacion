/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int suma = 0;

        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero, la suma parara cuando pongas el 0"));
                suma = suma + numero;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getClass());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getClass());
            }
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, suma);

    }

}

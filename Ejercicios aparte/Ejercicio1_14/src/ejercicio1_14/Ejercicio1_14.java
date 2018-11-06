/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_14;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota = 0;

        try {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de datos " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de datos " + e.getMessage());
        }

        switch (nota) {
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "Muy insuficiente");
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Suficiente");
                break;
            case 6:
            case 7:
                JOptionPane.showMessageDialog(null, "Bien");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Notable");
                break;
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "Soblesaliente");

        }

    }

}

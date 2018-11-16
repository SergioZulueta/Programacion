/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float[] nota = new float[10];
        float numeroMin = 10;
        float numeroMax = 0;

        try {
            for (int x = 0; x < 10; x++) {
                nota[x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del alumno"));

                if (nota[x] < numeroMin) {
                    numeroMin = nota[x];
                } else {
                    if (nota[x] > numeroMax) {
                        numeroMax = nota[x];
                    }
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en la conversion de numeros " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

        JOptionPane.showMessageDialog(null, "El numero alto es " + numeroMax + " Y el mas bajo es " + numeroMin);

    }

}

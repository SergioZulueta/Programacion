/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import UML.*;
import java.text.DecimalFormat;
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

        double radio = 0;
        DecimalFormat df = new DecimalFormat("#.00");

        try {

            radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la circunferencia"));

            Circunferencia c1 = new Circunferencia();
            c1.setRadio(radio);

            JOptionPane.showMessageDialog(null, "La longitud es: " + df.format(c1.Longitud()) + "\n"
                    + "El area es: " + df.format(c1.Area()) + "\n"
                    + "El volumen es: " + df.format(c1.Volumen()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Eggog en la conversion" + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Egog" + e.getMessage());
        }

    }

}

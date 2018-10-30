/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Excepciones.AptoNoAptoExcepcion;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    static String visual;
    static String cobol;
    static String sql;
    static String java;

    public static void main(String[] args) {
        int respuesta;

        // TODO code application logic here
        do {
            try {
                visual = JOptionPane.showInputDialog("Introduce la nota que has sacado en visual");
                cobol = JOptionPane.showInputDialog("Introduce la nota que has sacado en cobol");
                sql = JOptionPane.showInputDialog("Introduce la nota que has sacado en sql");
                java = JOptionPane.showInputDialog("Introduce la nota que has sacado en java");

                //throw new AptoNoAptoExcepcion();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            calcularNota();

            respuesta = JOptionPane.showConfirmDialog(null, "Quieres comprobar mas notas?");

        } while (respuesta == 0);

    }

    public static void calcularNota() {
        if ("apto".equals(sql) && "apto".equals(cobol) && "apto".equals(java) && "apto".equals(visual)) {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }

        if ("apto".equals(sql) && "apto".equals(cobol) && "no apto".equals(java) && "no apto".equals(visual)) {
            JOptionPane.showMessageDialog(null, "Bien");
        }
        if ("apto".equals(sql) && "apto".equals(cobol) && "apto".equals(java) && "no apto".equals(visual)) {
            JOptionPane.showMessageDialog(null, "Notable");
        }
        if ("apto".equals(sql) && "apto".equals(cobol) && "apto".equals(visual) && "no apto".equals(java)) {
            JOptionPane.showMessageDialog(null, "Notable");
        }

        if ("apto".equals(sql) && "apto".equals(visual) && "no apto".equals(java) && "no apto".equals(cobol)) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        if ("apto".equals(sql) && "apto".equals(java) && "no apto".equals(java) && "no apto".equals(visual)) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }

        if ("apto".equals(cobol) && "apto".equals(visual) && "no apto".equals(java) && "no apto".equals(sql)) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        if ("apto".equals(cobol) && "apto".equals(java) && "no apto".equals(visual) && "no apto".equals(sql)) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }

        if ("no apto".equals(sql) && "no apto".equals(cobol)) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }

    }

}

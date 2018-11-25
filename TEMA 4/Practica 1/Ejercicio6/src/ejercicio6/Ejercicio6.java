/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio6 {

    /**
     * Se trata de hacer un "calendario" con las faltas de los alumnos
     *
     * @param args the command line arguments
     *
     */
    private static int dias[] = new int[5];
    private static int alumnos[] = new int[5];

    public static void main(String[] args) {
        
        int continuar = 0;
        do {
            try {
                llenarArrays();
                entradaDatos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
            continuar = JOptionPane.showConfirmDialog(null,"Quieres continuar");
        } while (continuar == 0);

    }

    public static void llenarArrays() throws Exception {
        Arrays.fill(dias, 0);
        Arrays.fill(alumnos, 0);
    }

    public static void entradaDatos() throws Exception {
        boolean ok;
        String cadena = "";
        int x = 0;
        do {
            int faltas = 0;
            ok = false;
            while (ok == false) {
                try {
                    alumnos[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del alumno numero: " + (x + 1)));
                    ok = true;
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Introduce el codigo en un formato correcto");
                }
            }
            for (int y = 0; y < dias.length; y++) {
                ok = false;
                while (ok == false) {
                    try {
                        dias[y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de faltas del alumno " + (x + 1) + " el dia: " + (y + 1)));
                        ok = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Introduce el numero de faltas en un formato correcto");
                    }
                }
                faltas += dias[y];
            }
            if (faltas != 0) {
                cadena += "El alumno con el codigo " + alumnos[x] + " tiene " + faltas + " faltas" + "\n";
                x++;
            }
        } while (x < alumnos.length);
        JOptionPane.showMessageDialog(null, cadena);
    }
}

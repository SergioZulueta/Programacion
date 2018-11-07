/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    final private static int numeroAsignaturas = 6;
    private static int alumnos;
    private static float totalNotas;

    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno: ");
        
        while (nombre.compareToIgnoreCase("fin") != 0) {

            int totalNotasAlumno = solicitarNotas();
            int medioAlumno = totalNotasAlumno / numeroAsignaturas;
            JOptionPane.showMessageDialog(null, nombre + " tiene  " + medioAlumno + " de media");

            calculosMediaAlumnos(medioAlumno);

            nombre = JOptionPane.showInputDialog("Introduce el nombre: ");

        }
        JOptionPane.showMessageDialog(null, "La nota media de todos es: " + (totalNotas / alumnos));

    }

    public static int solicitarNotas() {
        int totalNotasAlumno = 0;
        for (int x = 0; x < numeroAsignaturas; x++) {
            int nota = 0;
            boolean correcto;
            do {
                try {
                    nota = Integer.parseInt(JOptionPane.showInputDialog("Teclear la nota de asignatura " + (x + 1)));
                    
                    correcto = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, " La nota tiene que ser un número");
                    correcto = false;
                }
            } while (correcto == false);
            totalNotasAlumno += nota;
        }
        return totalNotasAlumno;
    }

    public static void calculosMediaAlumnos(float mediaAlumno) {
        totalNotas += mediaAlumno;
        alumnos++;
    }

}

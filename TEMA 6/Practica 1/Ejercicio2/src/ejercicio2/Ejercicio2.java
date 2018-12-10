/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import UML.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    static Alumno alumno;

    public static void main(String[] args) {
        // TODO code application logic here
        int codigo;
        ArrayList<Alumno> agenda = new ArrayList();

        do {

            alumno = new Alumno();
            alumno.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Codigo")));
            alumno.setNombre(JOptionPane.showInputDialog("Introduce el Nombre"));
            alumno.setDomicilio(JOptionPane.showInputDialog("Introduce el Domicilio"));
            alumno.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Telelefono")));

            agenda.add(alumno);

        } while (JOptionPane.showConfirmDialog(null, "Queres contiar") == 0);

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Codigo"));

        int x;
        for (x = 0; x < agenda.size() && agenda.get(x).getCodigo() != codigo; x++) {

        }

        if (agenda.get(x).getCodigo() == codigo) {
            JOptionPane.showMessageDialog(null, "Este es el alumno:\n " + "Codigo: " + agenda.get(x).getCodigo() + "\n"
                    + "Nombre: " + agenda.get(x).getNombre() + "\n"
                    + "Domicilio: " + agenda.get(x).getDomicilio() + "\n"
                    + "Telefono: " + agenda.get(x).getTelefono());
        }
    }
}
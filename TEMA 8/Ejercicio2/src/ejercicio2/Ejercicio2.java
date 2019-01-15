/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import UML.*;
import Vistas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    public static Ventana v;
    public static Ventana2 v2;
    public static ArrayList<Persona> personas = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        inicializarVentanas();
    }

    public static void inicializarVentanas() {
        v = new Ventana();
        v.setVisible(true);

        v2 = new Ventana2();
    }

    public static void añadirPersona(String nombre, String apellidos, String dni) {

        Persona persona = new Persona(nombre, apellidos, dni);

        personas.add(persona);
        JOptionPane.showMessageDialog(null,"Dada de alta correctamente");

    }

    public static void mostrarVentana2() {
        v.setVisible(false);

        v2.setVisible(true);
        String lista = "";
        for (int x = 0; x < personas.size(); x++) {
            lista += "Nombre: " + personas.get(x).getNombre() + " |Apellidos: " + personas.get(x).getApellidos() + " |DNI: " + personas.get(x).getDni() + "\n";
        }

        v2.mostrar(lista);
    }

    public static void salir() {
        System.exit(0);
    }

}

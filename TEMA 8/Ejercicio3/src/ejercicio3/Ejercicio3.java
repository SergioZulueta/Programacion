/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Vistas.Ventana;

/**
 *
 * @author hp_pc
 */
public class Ejercicio3 {

    public static Ventana v;

    public static void main(String[] args) {
        // TODO code application logic here
        inicializarVentanas();
    }

    public static void inicializarVentanas() {
        v = new Ventana();
        v.setVisible(true);

    }

    public static void salir() {
        System.exit(0);
    }

}

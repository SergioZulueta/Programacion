/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Vistas.Ventana;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    private static Ventana v;
    public static void main(String[] args) {
        // TODO code application logic here
        llamarVentana();
        
    }
    
    public static void llamarVentana(){
        Ventana v = new Ventana();
        v.setVisible(true);
    }    
}

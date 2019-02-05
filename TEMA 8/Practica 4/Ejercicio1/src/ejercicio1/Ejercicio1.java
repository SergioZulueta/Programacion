/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import UML.*;
import Vistas.*;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1 {

    public static Sesion s;
    public static VPrincipal vp;
    public static VSecundaria vs;
    public static Usuario usuario;

    public static void main(String[] args) {
        inicializarVentanas();

    }

    public static void inicializarVentanas() {
        s = new Sesion();
        s.setVisible(true);

        vp = new VPrincipal();
        vs = new VSecundaria();
    }

    public static void cerrarPrograma() {
        System.exit(0);
    }

    public static void crearUsuario() {
        usuario = new Usuario("admin", "admin");
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import UML.*;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula p = new Pelicula("El retorno del rey", 2003 , 201, "Accion");
        
        Estudio e = new Estudio();
        
        p.añadirPelicula(e);
        p.añadirPelicula(e);
        
    }
    
}

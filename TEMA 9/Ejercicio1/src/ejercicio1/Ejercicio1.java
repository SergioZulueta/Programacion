/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import GUI.*;
import UML.*;
import java.sql.Connection;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1 {

    private static Connection con;
    private static PersonaDAO oPersonaDAO;
    private static BaseDatos bd;
    private static VPrincipal vp;

    public static void main(String[] args) {
        // Opcion uno
        bd = new BaseDatos();
        con = bd.conectar();
        if (con == null) {
            System.out.println("Problemas con la base de datos");
            System.exit(-1);
        }
        //oPersonaDAO = new PersonaDAO(con);

        // Opcion dos(static)
        /*con = BaseDatos.conectar();
       if (con == null)
       {
           System.out.println("Problemas con la base de datos");
           System.exit(-1);
       }*/
        vp = new VPrincipal();
        vp.setVisible(true);
    }

    /*public static void darAlta(String nombre, int edad, String profesion, int numero) {
        Persona p = new Persona(nombre, nro);
        //insertar
        oPersonaDAO.darAlta(p);
    }

    public static String consultar(String nombre) {
        return oPersonaDAO.consultar(nombre);
    }
     */
    public static void salir() {
        bd.cerrar();
        System.exit(0);
    }

}

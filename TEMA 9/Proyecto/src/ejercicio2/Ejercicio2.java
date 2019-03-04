/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import GUI.*;
import UMLDB.*;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    private static DBConnection con;
    private static VPrincipal vp;
    private static ProyectoDAO oProyectoDAO;

    public static void main(String[] args) {

        try {
            con = new DBConnection();
            con.conectar();

            vp = new VPrincipal();
            vp.setVisible(true);

            oProyectoDAO = new ProyectoDAO(con.getConnection());

        } catch (Exception e) {
            System.out.println("Error en el main");
        }

    }

}

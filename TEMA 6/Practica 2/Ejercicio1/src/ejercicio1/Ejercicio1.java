/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import UML.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1 {

    private static Estudio[] listaEstudios = new Estudio[4];
    private static ArrayList<Pelicula> listaPeliculas = new ArrayList();

    public static void main(String[] args) {
        try {
            crearEstudio();
            crearPelicula();
            buscarPeliculaMasLarga();
            buscarEstudioConMasPeliculas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    public static void crearEstudio() throws ParseException {

        //Estudio 1
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<String> telefono = new ArrayList();
        telefono.add("111111111");
        telefono.add("111111112");
        listaEstudios[0] = new Estudio("Producciones Sergio", "Vitoria", "c/ a", "www.proser.com", sdf.parse("22/12/1996"), "España", telefono);

        ArrayList<String> telefono2 = new ArrayList();
        telefono.add("222222222");
        telefono.add("222222223");
        listaEstudios[0] = new Estudio("DC", "Imaginolandia", "c/ b", "www.dc.com", sdf.parse("22/12/1997"), "El mundo", telefono2);

        ArrayList<String> telefono3 = new ArrayList();
        telefono.add("333333334");
        telefono.add("444444445");
        listaEstudios[0] = new Estudio("Son Goku", "Su casa", "c/ c", "www.gokua.com", sdf.parse("22/12/1998"), "Vegeta", telefono3);

        ArrayList<String> telefono4 = new ArrayList();
        telefono.add("555555555");
        telefono.add("555555556");
        listaEstudios[0] = new Estudio("Sanson", "Un cuento", "c/ d", "www.sanson.com", sdf.parse("22/12/1999"), "No expecificia", telefono4);
   
    }

    public static void crearPelicula() {

    }

    public static void buscarPeliculaMasLarga() {

    }

    public static void buscarEstudioConMasPeliculas() {

    }

}

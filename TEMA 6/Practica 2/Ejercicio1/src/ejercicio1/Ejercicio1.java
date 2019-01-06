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
        listaEstudios[1] = new Estudio("DC", "Imaginolandia", "c/ b", "www.dc.com", sdf.parse("22/12/1997"), "El mundo", telefono2);

        ArrayList<String> telefono3 = new ArrayList();
        telefono.add("333333334");
        telefono.add("444444445");
        listaEstudios[2] = new Estudio("Son Goku", "Su casa", "c/ c", "www.gokua.com", sdf.parse("22/12/1998"), "Vegeta", telefono3);

        ArrayList<String> telefono4 = new ArrayList();
        telefono.add("555555555");
        telefono.add("555555556");
        listaEstudios[3] = new Estudio("Sanson", "Un cuento", "c/ d", "www.sanson.com", sdf.parse("22/12/1999"), "No expecificia", telefono4);

    }

    public static void crearPelicula() {

        ArrayList<Estudio> lista = new ArrayList();
        lista.add(listaEstudios[1]);
        char[] año = new char[4];
        año[0] = '2';
        año[1] = '0';
        año[2] = '0';
        año[3] = '1';
        Pelicula p = new Pelicula("La comunidad del anillo", año, 197f, "Accion", lista);
        listaPeliculas.add(p);

        ArrayList<Estudio> lista2 = new ArrayList();
        lista2.add(listaEstudios[0]);
        lista2.add(listaEstudios[3]);
        char[] año2 = new char[4];
        año[0] = '2';
        año[1] = '0';
        año[2] = '0';
        año[3] = '2';
        Pelicula p2 = new Pelicula("Las dos torres", año2, 200f, "Accion", lista2);
        listaPeliculas.add(p2);

        ArrayList<Estudio> lista3 = new ArrayList();
        lista3.add(listaEstudios[3]);
        char[] año3 = new char[4];
        año[0] = '2';
        año[1] = '0';
        año[2] = '0';
        año[3] = '3';
        Pelicula p3 = new Pelicula("El retorno del rey", año3, 203f, "Accion", lista3);
        listaPeliculas.add(p3);

        ArrayList<Estudio> lista4 = new ArrayList();
        lista4.add(listaEstudios[2]);
        char[] año4 = new char[4];
        año[0] = '2';
        año[1] = '0';
        año[2] = '1';
        año[3] = '4';
        Pelicula p4 = new Pelicula("El hobbit", año4, 150f, "Accion", lista4);
        listaPeliculas.add(p4);

        ArrayList<Estudio> lista5 = new ArrayList();
        lista5.add(listaEstudios[0]);
        lista5.add(listaEstudios[1]);
        lista5.add(listaEstudios[2]);
        lista5.add(listaEstudios[3]);
        char[] año5 = new char[4];
        año[0] = '2';
        año[1] = '0';
        año[2] = '2';
        año[3] = '0';
        Pelicula p5 = new Pelicula("Inventada", año5, 1000f, "No se sabe", lista5);
        listaPeliculas.add(p5);

    }

    public static void buscarPeliculaMasLarga() {
        String cadena = "";
        int max = 0;
        Pelicula masLarga = null;

        for (Pelicula p : listaPeliculas) {
            if (p.getDuracion() > max) {
                masLarga = p;
                max = (int) masLarga.getDuracion();
            }
        }
        for (int x = 0; x < masLarga.getListaEstudios().size(); x++){
            cadena =  cadena + " "  + masLarga.getListaEstudios().get(x).getNombre();
        }

        JOptionPane.showMessageDialog(null, "La pelicula mas larga es: " + masLarga.getTitulo() + " \n"+ "Producidad por:" + cadena.toString());

    }

    public static void buscarEstudioConMasPeliculas() {

    }

}

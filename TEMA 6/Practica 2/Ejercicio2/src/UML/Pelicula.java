/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author hp_pc
 */
public class Pelicula {

    private String titulo;
    private char año = 0000;
    private float duracion;
    private String tipo;
    private ArrayList<Estudio> listaEstudios;

    public Pelicula(String titulo, float duracion, String tipo, ArrayList<Estudio> listaEstudios) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.tipo = tipo;
        this.listaEstudios = listaEstudios;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getAño() {
        return año;
    }

    public void setAño(char año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(ArrayList<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }

    public void modificarPelicula() {

    }

    public void eliminarPelicula() {

    }

    public void desplieguePelicula() {

    }

}

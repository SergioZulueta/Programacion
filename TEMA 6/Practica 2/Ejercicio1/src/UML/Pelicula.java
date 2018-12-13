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
    private int año = 0000;
    private int duracion;
    private String tipo;
    private Estudio pelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, int año, int duracion, String tipo, Estudio pelicula) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.pelicula = pelicula;
    }

    public Pelicula(String el_retorno_del_rey, int i, int i0, String accion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void PeliculaMasLarga(){
        for (int x = 0; x > duracion; x ++){
            
        }
        
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(char año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Estudio getPelicula() {
        return pelicula;
    }

    public void setPelicula(Estudio pelicula) {
        this.pelicula = pelicula;
    }

    public void añadirPelicula(Estudio e) {
       
    }

}

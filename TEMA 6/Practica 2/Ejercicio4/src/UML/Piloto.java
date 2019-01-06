/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author steel
 */
public class Piloto {

    private String codigoPiloto, nombre, apellido;
    private Integer numeroLicencia;

    private ArrayList<Vuelo> vuelos;

    public Piloto(String codigoPiloto, String nombre, String apellido, Integer numeroLicencia) {
        this.codigoPiloto = codigoPiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroLicencia = numeroLicencia;
    }

    public String getCodigoPiloto() {
        return codigoPiloto;
    }

    public void setCodigoPiloto(String codigoPiloto) {
        this.codigoPiloto = codigoPiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(Integer numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void agregar_nuevo() {
    }

    public void asignar_vuelo() {
    }

    public void cancelar_vuelo() {
    }

    public void modificar() {
    }

    public Piloto buscar(Piloto p) {
        return p;
    }
}

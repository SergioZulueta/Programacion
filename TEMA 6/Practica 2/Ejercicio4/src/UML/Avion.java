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
public class Avion {

    private String aerolineas, codigoAvion, compartimentos;
    private int numeroAsientos;

    private ArrayList<Vuelo> vuelos;

    public Avion(String aerolineas, String codigoAvion, String compartimentos, int numeroAsientos) {
        this.aerolineas = aerolineas;
        this.codigoAvion = codigoAvion;
        this.compartimentos = compartimentos;
        this.numeroAsientos = numeroAsientos;
    }

    public String getAerolineas() {
        return aerolineas;
    }

    public void setAerolineas(String aerolineas) {
        this.aerolineas = aerolineas;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void asignar_vuelo() {
    }

    public void cancelar_vuelo() {
    }

    public Avion obtener(Avion a) {
        return a;
    }

}

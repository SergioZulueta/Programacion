/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author steel
 */
public class Vuelo {

    private int NumeroDeVuelo;
    private String horaSalida, horaLlegada, lugarOrigen, lugarDestino, tipodeVuelo;
    private Date fechaSalida, fechaRegreso;

    private ArrayList<Asiento> asientos;
    private ArrayList<Pasajero> pasajeros;
    private Ciudad ciudad;
    private Avion avion;
    private Piloto piloto;

    public Vuelo(int NumeroDeVuelo, String horaSalida, String horaLlegada, String lugarOrigen, String lugarDestino, String tipodeVuelo, Date fechaSalida, Date fechaRegreso, ArrayList<Asiento> asientos, ArrayList<Pasajero> pasajeros, Ciudad ciudad, Avion avion, Piloto piloto) {
        this.NumeroDeVuelo = NumeroDeVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.tipodeVuelo = tipodeVuelo;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.asientos = asientos;
        this.pasajeros = pasajeros;
        this.ciudad = ciudad;
        this.avion = avion;
        this.piloto = piloto;
    }
    
    

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    
    
    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroDeVuelo() {
        return NumeroDeVuelo;
    }

    public void setNumeroDeVuelo(int NumeroDeVuelo) {
        this.NumeroDeVuelo = NumeroDeVuelo;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getTipodeVuelo() {
        return tipodeVuelo;
    }

    public void setTipodeVuelo(String tipodeVuelo) {
        this.tipodeVuelo = tipodeVuelo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void reservar() {
    }

    public void modificar() {
    }

    public void eliminar() {
    }

    public Vuelo buscar(Vuelo v) {
        return v;
    }
}

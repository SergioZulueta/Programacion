/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author hp_pc
 */
public class acontecimiento {

    private int cod;
    private String nombre, lugar;
    private Date fecha;
    private Time hora_i;
    private Time hora_f;
    private int aforo;

    public acontecimiento() {
    }

    public acontecimiento(int cod, String nombre, String lugar, Date fecha, Time hora_i, Time hora_f, int aforo) {
        
        this.cod = cod;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora_i = hora_i;
        this.hora_f = hora_f;
        this.aforo = aforo;
    }

    @Override
    public String toString() {
        return cod + " " + nombre + " " + lugar + " " + fecha + " " + hora_i + " " + hora_f + " " + aforo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora_i() {
        return hora_i;
    }

    public void setHora_i(Time hora_i) {
        this.hora_i = hora_i;
    }

    public Time getHora_f() {
        return hora_f;
    }

    public void setHora_f(Time hora_f) {
        this.hora_f = hora_f;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

}

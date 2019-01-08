/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author steel
 */
public class Pasajero {

    private String cedula, nombre, apellido, sexo;
    private int edad;
    private Asiento a;
    private Vuelo vuelo;

    public Pasajero(String cedula, String nombre, String apellido, String sexo, int edad, Asiento a, Vuelo vuelo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.a = a;
        this.vuelo = vuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Asiento getA() {
        return a;
    }

    public void setA(Asiento a) {
        this.a = a;
    }

    public void agregar_nuevo() {
    }

    public void modificar() {
    }

    public void asignar_nuevo() {
    }

    public Pasajero buscar(Pasajero p) {
        return p;
    }
}

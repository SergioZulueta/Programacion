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
public class Cliente extends Persona{
    private String tlfo;

    public Cliente(){}

    public Cliente(String tlfo, String nombre, int edad) {
        super(nombre, edad);
        this.tlfo = tlfo;
    }
    

    public String getTlfo() {
        return tlfo;
    }

    public void setTlfo(String tlfo) {
        this.tlfo = tlfo;
    }

    @Override
    public String mostrar() {
        return this.getNombre()+"\n"+ this.getEdad()+"\n"+tlfo;
    }
    
    
}

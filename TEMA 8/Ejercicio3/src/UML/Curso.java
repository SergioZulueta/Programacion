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
public class Curso {
    private String clase;
    private ArrayList <Persona> personas;

    public Curso() {
    }

    public Curso(String clase, ArrayList<Persona> personas) {
        this.clase = clase;
        this.personas = personas;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    
}

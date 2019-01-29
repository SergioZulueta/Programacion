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
public class SocioFamiliar extends Socio{
    private ArrayList<Nene> hijos;

    public SocioFamiliar(ArrayList<Nene> hijos, String nombre, String apellidos, String email, int telefono) {
        super(nombre, apellidos, email, telefono);
        this.hijos = hijos;
    }

    public SocioFamiliar() {
    }
    
    
    public ArrayList<Nene> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nene> hijos) {
        this.hijos = hijos;
    }
    
    
    
}

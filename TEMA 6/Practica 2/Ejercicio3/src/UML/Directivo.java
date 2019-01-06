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
public class Directivo extends Empleado{
    private String categoria;
    private ArrayList<Empleado>listaemple;

    public Directivo(String categoria) {
        this.categoria = categoria;
    }

    public Directivo(String categoria, double sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaemple() {
        return listaemple;
    }

    public void setListaemple(ArrayList<Empleado> listaemple) {
        this.listaemple = listaemple;
    }
    
    public void setListaemple(Empleado x){
        if(listaemple==null)
            listaemple=new ArrayList();
        this.listaemple.add(x);
    }

    @Override
    public String mostrar() {
        return this.getNombre()+"\n"+ this.getEdad()+"\n"+this.getSueldo()+"\n"+categoria;
    }
    
    
}

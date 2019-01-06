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
public class Empresa {
    private String nombre;
    
    private ArrayList <Empleado> listaemple;
    private ArrayList <Cliente> listacliente;

    public Empresa(){}

    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public ArrayList<Cliente> getListacliente() {
        return listacliente;
    }

    public void setListacliente(ArrayList<Cliente> listacliente) {
        this.listacliente = listacliente;
    }
       
    public void setListacliente(Cliente y){
        if(listacliente==null)
            listacliente=new ArrayList();
        this.listacliente.add(y);
    }

    public String mostrar() {
        return nombre;
    }
    
}

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
public class Asiento {
    private int numeroAsiento;
    private boolean estado;
    private String compartimiento;
    private Pasajero p;

    public Asiento(int numeroAsiento, boolean estado, String compartimiento) {
        this.numeroAsiento = numeroAsiento;
        this.estado = estado;
        this.compartimiento = compartimiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCompartimiento() {
        return compartimiento;
    }

    public void setCompartimiento(String compartimiento) {
        this.compartimiento = compartimiento;
    }

    public Pasajero getP() {
        return p;
    }

    public void setP(Pasajero p) {
        this.p = p;
    }
    
    public void reservar(){}
    
    public void comprar(){}
    
    public void desbloquear(){}
    
    public boolean mostrar_disponivilidad(boolean b){
        return b;
    }
}

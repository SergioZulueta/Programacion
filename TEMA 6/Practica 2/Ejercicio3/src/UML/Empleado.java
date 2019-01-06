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
public class Empleado extends Persona{
    private double sueldo;

    public Empleado(){}

    public Empleado(double sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String mostrar() {
        return this.getNombre()+"\n"+ this.getEdad()+"\n"+sueldo;
    }
    
    public void calcular_salario_bruto(){}
}

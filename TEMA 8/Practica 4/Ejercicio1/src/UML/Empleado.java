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
public class Empleado {

    String dni, nss, nombreyape, direccion, telefono, sexo, estadoc, nempleado;
    ArrayList<Contrato> contrato;
    ArrayList<Departamento> departamento;

    public Empleado(String dni, String nss, String nombreyape, String direccion, String telefono, String sexo, String estadoc, String nempleado, ArrayList<Contrato> contrato, ArrayList<Departamento> departamento) {
        this.dni = dni;
        this.nss = nss;
        this.nombreyape = nombreyape;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoc = estadoc;
        this.nempleado = nempleado;
        this.contrato = contrato;
        this.departamento = departamento;
    }

    public Empleado() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombreyape() {
        return nombreyape;
    }

    public void setNombreyape(String nombreyape) {
        this.nombreyape = nombreyape;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

    public String getNempleado() {
        return nempleado;
    }

    public void setNempleado(String nempleado) {
        this.nempleado = nempleado;
    }

    public ArrayList<Contrato> getContrato() {
        return contrato;
    }

    public void setContrato(ArrayList<Contrato> contrato) {
        this.contrato = contrato;
    }

    public ArrayList<Departamento> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(ArrayList<Departamento> departamento) {
        this.departamento = departamento;
    }

}

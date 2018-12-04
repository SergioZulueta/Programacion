/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double Area() {
        double area = Math.PI * this.radio * this.radio;
        return area;
    }

    public double Longitud() {
        double longitud = 2 * Math.PI * this.radio;
        return longitud;
    }

    public double Volumen() {
        double volumen = 4 * Math.PI * this.radio * this.radio * this.radio / 3;
        return volumen;
    }

}

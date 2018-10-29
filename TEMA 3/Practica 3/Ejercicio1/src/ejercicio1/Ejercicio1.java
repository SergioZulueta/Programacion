/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int horas;
        String estado;
        String estudios;
        int sueldo;

        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));
        estado = JOptionPane.showInputDialog("Introduce el estado civil");
        estudios = JOptionPane.showInputDialog("Introduce los estudios");

    }

    public static void hoasPagadas(int horas, int sueldo) {
        if(horas <= 40){
            sueldo = horas * 10;
        }
    }

}

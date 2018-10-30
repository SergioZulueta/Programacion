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

    static int horas = 0;
    static char estado;
    static char estudios;
    static int sueldo = 0;
    static int horasExtra = 0;
    static int horasNormales = 0;
    static int respuesta;

    public static void main(String[] args) {
        // TODO code application logic here

        do {
            try {
                horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.exit(horas);
            }

            try {
                estado = JOptionPane.showInputDialog("Introduce el estado civil").charAt(0);
                estudios = JOptionPane.showInputDialog("Introduce los estudios").charAt(0);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + e.getClass());
            }

            horasPagadas();
            estadoCivilYEstudios();
            
            JOptionPane.showMessageDialog(null, sueldo);

            respuesta = JOptionPane.showConfirmDialog(null, "Quieres continuar?");
            
        } while (respuesta == 0);

        

    }

    public static int horasPagadas() {
        if (horas <= 40) {
            sueldo = horas * 10;
        } else {
            horasExtra = (horas - 40) * 15;
            horasNormales = 40 * 10;
            sueldo = horasNormales + horasExtra;
        }
        return sueldo;
    }

    public static int estadoCivilYEstudios() {
        if (estado == 'S' && estudios == 'P') {
            sueldo = sueldo + 100;
        }
        if (estado == 'S' && estudios == 'M') {
            sueldo = sueldo + 100;
        }
        if (estado == 'S' && estudios == 'S') {
            sueldo = sueldo + 100;
        }
        if (estado == 'C' && estudios == 'S') {
            sueldo = sueldo + 100;
        }
        if (estado == 'V' && estudios == 'S') {
            sueldo = sueldo + 100;
        }
        if (estado == 'V' && estudios == 'P') {
            sueldo = sueldo + 100;
        }
        if (estado == 'D' && estudios == 'S') {
            sueldo = sueldo + 100;
        }

        return sueldo;
    }

}

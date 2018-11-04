/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Que operacion deseas hacer"));

        switch (opcion) {
            case 1:
                sumarNumero();
                break;

            case 2:
                restarNumero();
                break;

            case 3:
                tablaMultiplicacion();
                break;

            case 4:
                cocienteYResto();
                break;

            case 5:
                salirPrograma();
                break;
        }

    }

    public static void sumarNumero() {
        int numero1;
        int numero2;
        int suma;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, suma);

    }

    public static void restarNumero() {
        int numero1;
        int numero2;
        int resta;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));

        resta = numero1 - numero2;

        JOptionPane.showMessageDialog(null, resta);

    }

    public static void tablaMultiplicacion() {
        int numero;
        String resultado = null;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));

        for (int i = 1; i <= 10; i++) {
            resultado = resultado + "\n" + numero + " x " + i + " = " + numero * i;
        }
        JOptionPane.showMessageDialog(null, "Tabla del " + numero + "\n" + resultado);

    }

    public static void cocienteYResto() {

    }

    public static void salirPrograma() {
        System.exit(0);
    }

}

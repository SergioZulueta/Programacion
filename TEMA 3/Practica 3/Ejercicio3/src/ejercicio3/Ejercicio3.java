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
        Menu();

    }

    public static void Menu() {
        int opcion = 0;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Que operacion deseas hacer: " + "\n"
                        + "1.- Sumar un numero " + "\n"
                        + "2.- Restar un numero " + "\n"
                        + "3.- Tabla de multiplicacion " + "\n"
                        + "4.- Cociente y Resto " + "\n"
                        + "5.- Salir del programa " + "\n"));

                if (opcion > 5) {
                    JOptionPane.showMessageDialog(null, "Error, numero no valido");
                    System.exit(opcion);
                }

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
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Valor no valido");
                System.exit(opcion);

            }
        } while (opcion != 5);
    }

    public static void sumarNumero() {
        int numero1 = 0;
        int numero2 = 0;
        int suma;

        try {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Valor no valido");
        }
        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "La suma es: " + suma);

    }

    public static void restarNumero() {
        int numero1 = 0;
        int numero2 = 0;
        int resta;

        try {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Valor no valido");
        }
        resta = numero1 - numero2;

        JOptionPane.showMessageDialog(null, "La resta es: " + resta);

    }

    public static void tablaMultiplicacion() {
        int numero = 0;
        String resultado = "";

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Valor no valido");
        }
        for (int x = 1; x <= 10; x++) {
            resultado = resultado + "\n" + numero + " x " + x + " = " + numero * x;
        }
        JOptionPane.showMessageDialog(null, "Tabla del " + numero + "\n" + resultado);

    }

    public static void cocienteYResto() {
        int numero = 0;
        int divisor = 0;
        int cociente;
        int resto;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            divisor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Valor no valido");
        }
        cociente = numero / divisor;
        resto = numero % divisor;

        JOptionPane.showMessageDialog(null, "El cociente de la division es " + cociente + " y " + resto + " es el resto");

    }

    public static void salirPrograma() {
        System.exit(0);
    }

}

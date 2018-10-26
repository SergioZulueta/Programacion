/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    static int ultimoNumero;
    static int resto = 0;
    static int numero = 0;
    static int divisor = 0;

    public static void main(String[] args) {
        // TODO code application logic here

        ultimoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        numero = 1;
        do {
            funcionPrimo();
            numero = numero + 1;
        } while (numero <= ultimoNumero);
    }

    public static void funcionPrimo() {
        if (numero < 4) {
            System.out.print("El numero " + numero + " si es primo" + "\n");
        } else {
            divisor = numero;

            do {
                divisor = divisor - 1;
                resto = numero % divisor;
            } while (resto != 0 && divisor > 2);

            if (resto == 0) {
                System.out.print( "El numero " + numero + " no es primo" + "\n");
            } else {
                System.out.print( "El numero " + numero + " si es primo" + "\n");
            }
        }

    }

}

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

        String frase = JOptionPane.showInputDialog("Introduce una frase que contenga solo una vocal");
        char caracter = JOptionPane.showInputDialog("Introduce la letra a contar").charAt(0);

        int veces = buscar(frase, caracter);
        /*
        %c character
        %d numeros
        %s String
         */
        String mensaje = String.format("El %c aparece %d veces en la cadena %s", caracter, veces, frase);
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static int buscar(String frase, char c) {
        int contador = 0;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.charAt(x) == c) {
                contador++;
            }
        }
        return contador;
    }

}

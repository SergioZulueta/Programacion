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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        int contador = 0;

        frase = JOptionPane.showInputDialog("Introduce un mensaje");

        for (int x = 0; x < frase.length(); x++) {
            if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o') || (frase.charAt(x) == 'u')) {
                contador++;
            }
        }

        /*for (int x = 0; x < frase.length(); x++){
            switch (frase.charAt(x))
        {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            contador = contador +1;
            break;
        }
        
        }
         */
        JOptionPane.showMessageDialog(null, contador + " vocales");
    }

}

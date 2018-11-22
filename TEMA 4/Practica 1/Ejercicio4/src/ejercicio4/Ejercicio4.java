/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int abc[];
        abc = new int[25];
        String texto = "", datos = "";
        char letra = 'a';
        int y = 0;

        for (int x = 0; x < abc.length; x++) {
            abc[x] = 0;
        }
        texto = JOptionPane.showInputDialog(null, "Introduce el texto");
        while (y < 25) {
            for (int x = 0; x < texto.length(); x++) {
                if (texto.charAt(x) == letra) {
                    abc[y]++;
                }
            }
            letra++;
            y++;

        }

        letra = 'a';
        for (int x = 0; x < abc.length; x++) {
            if (abc[x] != 0) {
                datos += letra + " = " + abc[x] + "\n";
            }

            letra++;
        }

        JOptionPane.showMessageDialog(null, datos);

        /*
    
     char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String texto = JOptionPane.showInputDialog("Introduce un texto");
        char [] valorLetra = createArray(abecedario, texto);
        
        JOptionPane.showMessageDialog(null, "a: " + valorLetra[0] + "\n" 
                                            + "b: " + valorLetra[1] + "\n"
                                            + "c: " + valorLetra[2] + "\n"
                                            + "d: " + valorLetra[3] + "\n"
                                            + "e: " + valorLetra[4] + "\n"
                                            + "f: " + valorLetra[5] + "\n"
                                            + "g: " + valorLetra[6] + "\n"
                                            + "h: " + valorLetra[7] + "\n"
                                            + "i: " + valorLetra[8] + "\n"
                                            + "j: " + valorLetra[9] + "\n"
                                            + "k: " + valorLetra[10] + "\n"
                                            + "l: " + valorLetra[11] + "\n"
                                            + "m: " + valorLetra[12] + "\n"
                                            + "n: " + valorLetra[13] + "\n"
                                            + "ñ: " + valorLetra[14] + "\n"
                                            + "o: " + valorLetra[15] + "\n"
                                            + "p: " + valorLetra[16] + "\n"
                                            + "q: " + valorLetra[17] + "\n"
                                            + "r: " + valorLetra[18] + "\n"
                                            + "s: " + valorLetra[19] + "\n"
                                            + "t: " + valorLetra[20] + "\n"
                                            + "u: " + valorLetra[21] + "\n"
                                            + "w: " + valorLetra[22] + "\n"
                                            + "x: " + valorLetra[23] + "\n"
                                            + "y: " + valorLetra[24] + "\n"
                                            + "z: " + valorLetra[25] + "\n");  
    }

    public static char[] createArray(char[] abecedario, String texto) {
        char[] s;
        s = new char[26];
        for (int x = 0; x < 26; x++) {
            s[x] = (char) ('a' + x);
        }
        return s;
    }
         */
    }
}

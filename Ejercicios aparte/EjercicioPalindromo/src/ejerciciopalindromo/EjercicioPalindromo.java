/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopalindromo;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class EjercicioPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean palindromo = true;
        String frase;

        frase = JOptionPane.showInputDialog("Teclea una frase");
        palindromo = fPalindromo(frase, palindromo);
        if (palindromo) {
            JOptionPane.showMessageDialog(null, "La frase " + frase + " si es palindromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La frase " + frase + " no es palindromo.");
        }

    }

    public static boolean fPalindromo(String frase, boolean palindromo) {
        int contador = 0;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.substring(x, x + 1).equals(frase.substring(contador - 1, contador)) == false) {
                palindromo = false;
                break;
            }
            contador--;
        }
        return palindromo;
    }
}

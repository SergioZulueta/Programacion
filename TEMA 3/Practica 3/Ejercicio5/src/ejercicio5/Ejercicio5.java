/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            String numero = generarNumero();
            jugar(numero);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas en el main");
        }
    }

    public static String generarNumero() {
        
        String numero;
        boolean error;
        do {
            error = false;
            Integer n1 = (int) (Math.random() * 999) + 1;

            numero = String.valueOf(n1);
            if (numero.charAt(0) == numero.charAt(1) || numero.charAt(0) == numero.charAt(2) || numero.charAt(1) == numero.charAt(2)) {
                error = true;
            }
        } while (error == true);

        System.out.println(numero);
        return numero;
    }

    public static String entrada() {
        boolean correcto;
        String numero = "";
        do {
            correcto = true;
            try {
                numero = JOptionPane.showInputDialog(null, "Introduce el numero de 3 cifras");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                correcto = false;
            }
        } while (correcto == false);
        return numero;
    }

    public static void jugar(String numero){
        JOptionPane.showMessageDialog(null, "Que comience el duelo");
        boolean continuar = true;
        do {
            String nro = entrada();

            if (nro.equals(numero)) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "EASY");
            } else {
                String mensaje = buscarMuertos(nro, numero) + buscarHeridos(nro, numero);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } while (continuar == true);
    }

    public static String buscarMuertos(String nro, String numero) {
        int contador = 0;
        for (int x = 0; x < numero.length(); x++) {
            if (nro.charAt(x) == numero.charAt(x)) {
                contador = contador + 1;
            }
        }
        return " Hay " + contador + " muertos \n";
    }

    public static String buscarHeridos(String nro, String numero) {
        int contador = 0;
        for(int x=0; x < numero.length();x++)
        {
            int y;
            for(y=0; y < nro.length() && nro.charAt(y)!= numero.charAt(x) ;y++){}
            if (y != nro.length() && x != y)
                contador = contador + 1;
            
        }
        return " Hay " + contador + " heridos";
    }
}

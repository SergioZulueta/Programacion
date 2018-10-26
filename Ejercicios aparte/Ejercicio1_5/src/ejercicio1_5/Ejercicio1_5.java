/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_5;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int respuesta = 0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero introducido es positivo");
            }else{
                JOptionPane.showMessageDialog(null, "El numero introducido es negativo");
            }
            respuesta = JOptionPane.showConfirmDialog(null, "Quieres introducir otro numero?");
        }while(respuesta == 0);
        
    }
    
}

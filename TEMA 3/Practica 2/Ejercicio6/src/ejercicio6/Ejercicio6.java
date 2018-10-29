/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final LocalDate primavera = LocalDate.of(2018,3,21);
        final LocalDate verano = LocalDate.of(2018,6,21);
        final LocalDate otoño = LocalDate.of(2018,9,21);
        final LocalDate invierno = LocalDate.of(2018,12,21);
        int dia = 0;
        
        
        do{
            try{
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mes"));
                int dias = 0;
                LocalDate fecha = LocalDate.of(2018, mes, dias);
                
                
            }catch(Exception e){
                
            }
            
        }while(dia ==0);
        
        
    }
    
}

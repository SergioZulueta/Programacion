/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import UML.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int codigo;
        ArrayList <Alumno> agenda = new ArrayList();
        Alumno alumno = new Alumno(); 
        
        
        do{            
            
            alumno.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Codigo")));
            alumno.setNombre(JOptionPane.showInputDialog("Introduce el Nombre"));
            alumno.setDomicilio(JOptionPane.showInputDialog("Introduce el Domicilio"));
            alumno.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Telelefono")));
            
            agenda.add(alumno);
            
        }while(JOptionPane.showConfirmDialog(null, "Queres contiare")==0);
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Codigo"));
        if(alumno.getCodigo() == codigo){
            JOptionPane.showMessageDialog(null, alumno.setNombre(nombre));
        }
        
        
        
    }
    
}

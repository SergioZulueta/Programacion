/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     * @param alumnos array bidimensional con matrizes en las que guardamos las
     * posiciones asignadas de tres filas y cuatro columnas
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int[][]  alumnos = {{6,12,11,13},{2,17,2,7},{4,1,8,19}};
        /*
        no se me ocurre que hacer exactamente en este ejercicio, leo el enunciado 
        y solo se me ocurre el array alumnos para elegir la posicion en la que meteremos los datos
        pero mas haya de de eso se me ocurriria crear uno llamado alumno 
        en la que tenemos los titulos de la tabla, validar que sean correctos los idiomas y 
        los niveles y encajar en la posicion correcta el valor que coincida entre esos dos datos
         */
        // tablaCompleta[][] = {{"ingles", "frances", "aleman", "ruso"}, {"basico", "medio", "perfeccionamiento"}};
        //String [] idioma ={"ingles", "frances", "aleman", "ruso"};
        //String [] nivel ={"basico", "medio", "perfeccionamiento"};
        int[][] tabla = new int[4][3];
        int continuar = 0, nivel, idioma, alumnos;

        /*tabla[0][0] = 6;
        tabla[0][1] = 12;

        tabla[0][2] = 11;
        tabla[0][3] = 13;

        tabla[1][0] = 2;
        tabla[1][1] = 17;

        tabla[1][2] = 2;
        tabla[1][3] = 7;

        tabla[2][0] = 4;
        tabla[2][1] = 1;

        tabla[2][2] = 8;
        tabla[2][3] = 19;
         */
        
        do{
            idioma = Integer.parseInt(JOptionPane.showInputDialog("Introduce el idioma"));
            nivel = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel"));
            alumnos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumnos"));
            
            tabla[idioma][nivel] = alumnos;  
            
            continuar = JOptionPane.showConfirmDialog(null, "Quieres continuar");
        }while(continuar ==0);
        
        
    }

}

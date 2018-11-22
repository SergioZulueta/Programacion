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
        
        int[][] alumnos = new int[3][4];

        alumnos[0][0] = 6;
        alumnos[0][1] = 12;

        alumnos[0][2] = 11;
        alumnos[0][3] = 13;

        alumnos[1][0] = 2;
        alumnos[1][1] = 17;

        alumnos[1][2] = 2;
        alumnos[1][3] = 7;

        alumnos[2][0] = 4;
        alumnos[2][1] = 1;

        alumnos[2][2] = 8;
        alumnos[2][3] = 19;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import UML.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio3 {

    static Empresa[] empresas;
    static ArrayList<Directivo> listadirect;

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            entrada();
            buscarMax();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + e.getCause());
        }
    }

    public static void entrada() throws Exception {

        empresas = new Empresa[1];
        empresas[0] = new Empresa("Serzulupresa");
        empresas[0].setListacliente(clientes());
        empresas[0].setListaemple(empleados());
        System.out.println("");
    }

    public static ArrayList<Cliente> clientes() {

        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente("666666666", "Sergio", 22));
        clientes.add(new Cliente("7777777777", "Eric", 22));
        clientes.add(new Cliente("888888888", "Mikel", 19));
        return clientes;
    }

    public static ArrayList<Empleado> empleados() {

        listadirect = new ArrayList();
        ArrayList<Empleado> empleados = new ArrayList();
        Empleado e1 = new Empleado(1234, "Sergio", 22);
        empleados.add(e1);
        Empleado e2 = new Empleado(12344, "Adrian", 24);
        empleados.add(e2);
        Empleado e3 = new Empleado(123444, "Jorge", 22);
        empleados.add(e3);
        Empleado e4 = new Empleado(1234444, "Unai", 19);
        empleados.add(e4);

        //Directivos
        Directivo d1 = new Directivo("Lider", 1111.11, "Sergio", 22);
        empleados.add(d1);
        Directivo d2 = new Directivo("2do Lider", 2222.22, "Tamara", 24);
        empleados.add(d2);
        Directivo d3 = new Directivo("3er Lider", 3333.33, "Joel", 22);
        empleados.add(d3);
        Directivo d4 = new Directivo("4to Lider", 4444.44, "Aitor", 22);
        empleados.add(d4);

        d1.setListaemple(e1);

        d2.setListaemple(e2);
        d2.setListaemple(e4);

        d3.setListaemple(e3);

        d4.setListaemple(e2);

        return empleados;
    }

    public static void buscarMax() throws Exception {
        int max = -1;
        Directivo dmax = null;
        for (int x = 0; x < empresas.length; x++) {
            for (int y = 0; y < empresas[x].getListaemple().size(); y++) {
                if (empresas[x].getListaemple().get(y) instanceof Directivo) {
                    Directivo diO = (Directivo) empresas[x].getListaemple().get(y);
                    if (diO.getListaemple().size() > max) {
                        max = diO.getListaemple().size();
                        dmax = diO;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Directivo max\n" + dmax.mostrar());
    }
}

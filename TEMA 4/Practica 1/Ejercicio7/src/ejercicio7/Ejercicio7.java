/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     *
     * @param productoCod codigos del producto definidos de serie
     * @param productoOrdenadoPorCod Ordenar los productos por el codigo
     * @param cantidad 10 productos
     * @param cantidadOrdenada cantidades vendidas de menor a mayor
     *
     */
    public static int[] productoCod = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
    public static int[] productoOrdenadoPorCod;
    public static int[] cantidad = new int[10];
    public static int[] cantidadOrdenada;

    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Pedir datos y llamar al resto de funciones
         *
         * @param continuar para preguntarle al usuario si quiere seguir
         * introduciendo datos
         * @param numero el numero de productos vendidos
         * @param cod el codigo del producto
         *
         * @throws FormatException para cuando falla la conversion de numeros
         * @throws Exception Generica
         */
        int continuar;
        int numero, cod;

        do {
            try {

                cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del producto"));

                /*
                if (cod =! productoCod){
                    
                } */
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de productos vendidos"));

                int posicion = Arrays.binarySearch(productoCod, cod);
                cantidad[posicion] = numero;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en la combersion de numeros" + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }

            continuar = JOptionPane.showConfirmDialog(null, "Quieres continuar introduciendo datos?");
        } while (continuar == 0);

        Ordenar();
        objetoYProducto();
        String datosSalida = Salida();

        JOptionPane.showMessageDialog(null, datosSalida);
    }

    /**
     * Ordenar de menor a mayor los productos vendidos a lo largo del dia
     *
     * @throws Exception Generica
     */
    public static void Ordenar() {
        try {
            cantidadOrdenada = cantidad.clone();
            productoOrdenadoPorCod = productoCod.clone();
            Arrays.sort(cantidadOrdenada);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }

    }

    /**
     * Relacionar los objetos con los productos
     *
     * @throws ArrayIndexOutOfBoundsException para cuando falla el indice del
     * array
     * @throws Exception Generica
     *
     */
    public static void objetoYProducto() {

        try {
            for (int x = 0; x < productoCod.length; x++) {
                if (cantidad[x] != cantidadOrdenada[x] && cantidad[x] != 0) {
                    int positionAfter = Arrays.binarySearch(cantidadOrdenada, cantidad[x]);
                    productoOrdenadoPorCod[positionAfter] = productoCod[x];
                    productoOrdenadoPorCod[x] = productoCod[positionAfter];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error en el indice del array" + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }

    }

    /**
     * Menu de datos de salida
     *
     * @return salida datos a mostrar
     */
    public static String Salida() {

        String salida = "";
        for (int x = 0; x < productoCod.length; x++) {
            salida += "Ventas: " + cantidadOrdenada[x] + "  Productos: " + productoOrdenadoPorCod[x] + "\n";
        }
        return salida;
    }
}

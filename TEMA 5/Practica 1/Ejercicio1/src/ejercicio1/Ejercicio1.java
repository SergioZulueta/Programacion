/*
Crear un arraylist para guardar valores de tipo real (Float o Double) que iremos
introduciendo por teclado hasta finalizar (mientras quiera continuar).
Posteriormente muestra un menu para que el usuario pueda realizar las ´
siguientes operaciones:
1. Visualizar el valor maximo y el minimo.
2. Solicitar un numero y buscarlo. Posteriormente muestra un mensaje indicando si lo has encontrado o no.
3. Solicitar un numero y buscarlo. Si se encuentra borrarlo, sino mostrar un mensaje de error.
4. Convertir el arrayList en un array.
5. Si no esta vacio, mostrar el numero de elementos que contiene. 
6. Insertar un nuevo elemento por el final.
7. Insertar un nuevo elemento en la posicion que te indique el usuario. ´
8. Borrar un elemento de una posicion concreta. ´
9. Calcular la suma y la media aritmetica de los valores contenidos. ´
10. Finalizar.
 */
package ejercicio1;

import Excepciones.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Double> numeros;

    public static void main(String[] args) {
        // TODO code application logic here
        llenarArrayList();
        Menu();

    }

    public static void llenarArrayList() {
        numeros = new ArrayList();
        double numero;
        int continuar = 0;

        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce numeros"));
                numeros.add(numero);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, " Error en la conversion de datos" + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Error" + e.getMessage());
            }

            continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir otro numero?");
        } while (continuar == 0);

    }

    public static void Menu() {
        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre el 1 y 10" + "\n"
                        + "1.-Visualizar el valor maximo y el minimo." + "\n"
                        + "2.-Solicitar un numero y buscarlo. Posteriormente muestra un mensaje indicando si lo has encontrado o no." + "\n"
                        + "3.-Solicitar un numero y buscarlo. Si se encuentra borrarlo, sino mostrar un mensaje de error." + "\n"
                        + "4.-Convertir el arrayList en un array." + "\n"
                        + "5.-Si no esta vacio, mostrar el numero de elementos que contiene. " + "\n"
                        + "6.-Insertar un nuevo elemento por el final." + "\n"
                        + "7.-Insertar un nuevo elemento en la posicion que te indique el usuario." + "\n"
                        + "8.-Borrar un elemento de una posicion concreta." + "\n"
                        + "9.-Calcular la suma y la media aritmetica de los valores contenidos." + "\n"
                        + "10.-Finalizar." + "\n"));

                if (opcion < 1 || opcion > 10) {
                    throw new NumeroNoValido();
                }

            } catch (NumeroNoValido e) {
                JOptionPane.showMessageDialog(null, " Numero incorrecto, pon del 1 al 10");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, " Error en la conversion de datos" + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Error" + e.getMessage());
            }

            switch (opcion) {

                case 1:
                    maximoYMinimo();
                    break;
                case 2:
                    encontrarNumero();
                    break;
                case 3:
                    borrarNumero();
                    break;
                case 4:
                    convertirArray();
                    break;
                case 5:
                    mostrarNumeros();
                    break;
                case 6:
                    insertarNumeroFinal();
                    break;
                case 7:
                    insertarNumeroAGusto();
                    break;
                case 8:
                    borrarNumeroPosCon();
                    break;
                case 9:
                    calcularSumYMedia();
                    break;
                case 10:
                    Finalizar();
                    break;
            }

        } while (opcion != 10);

    }

    public static double solicitarNumero() {
        double numero = 0;

        try {
            numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Introdice un numero"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduce el importe en un formato correcto");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio");
        }

        return numero;
    }

    public static void maximoYMinimo() {
        int minimo = numeros.size();
        Collections.sort(numeros);
        JOptionPane.showMessageDialog(null, "El numero introducido mas bajo es el: " + numeros.get(0) + "\n" + " y el mas alto es: " + numeros.get(minimo - 1));
    }

    public static void encontrarNumero() {
        double numero = solicitarNumero();

        if (numeros.contains(numero)) {
            JOptionPane.showMessageDialog(null, "Si que contiene el numero: " + numero);
        } else {
            JOptionPane.showMessageDialog(null, "No contiene el numero: " + numero);
        }

        /*String cadena = "El numero especificado existe en la lista";
        int x = 0;
        do {
            x++;
        } while (numeros.contains(numero) == true && x < numeros.size());
        JOptionPane.showMessageDialog(null, cadena + " Y aparece: " + x + " veces.");
         */
    }

    public static void borrarNumero() {

    }

    public static void convertirArray() {

    }

    public static void mostrarNumeros() {
        JOptionPane.showMessageDialog(null, "Los numeros introducidos son: " + numeros);

    }

    public static void insertarNumeroFinal() {

    }

    public static void insertarNumeroAGusto() {

    }

    public static void borrarNumeroPosCon() {

    }

    public static void calcularSumYMedia() {

    }

    public static void Finalizar() {
        System.exit(0);
    }
    /*
    1. Visualizar el valor maximo y el minimo.
2. Solicitar un numero y buscarlo. Posteriormente muestra un mensaje indicando si lo has encontrado o no.
3. Solicitar un numero y buscarlo. Si se encuentra borrarlo, sino mostrar un mensaje de error.
4. Convertir el arrayList en un array.
5. Si no esta vacio, mostrar el numero de elementos que contiene. 
6. Insertar un nuevo elemento por el final.
7. Insertar un nuevo elemento en la posicion que te indique el usuario. ´
8. Borrar un elemento de una posicion concreta. ´
9. Calcular la suma y la media aritmetica de los valores contenidos. ´
10. Finalizar.
     */

}

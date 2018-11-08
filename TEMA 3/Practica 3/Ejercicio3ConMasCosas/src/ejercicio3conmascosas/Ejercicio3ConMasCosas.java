/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3conmascosas;

import Excepciones.*;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author steel
 */
public class Ejercicio3ConMasCosas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }

    public static void Menu() {

        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la opcion que quieras hacer" + "\n" + " ni mas ni menos: " + "\n"
                        + "1.- Sumar un numero " + "\n"
                        + "2.- Restar un numero " + "\n"
                        + "3.- Tabla de multiplicacion " + "\n"
                        + "4.- Cociente y Resto " + "\n"
                        + "5.- Diferencia entre dos fechas " + "\n"
                        + "6.- Sumar 100 dias a una fecha " + "\n"
                        + "7.- Nombre de la estacion de la fecha " + "\n"
                        + "8.- X domingos entre dos fechas " + "\n"
                        + "9.- Fecha actual" + "\n"
                        + "10.- Salir del programa"));

                if (opcion > 10 || opcion < 1) {
                    throw new numeroMayorOMenor();
                }

                switch (opcion) {
                    case 1:
                        sumarNumero();
                        break;
                    case 2:
                        restarNumero();
                        break;
                    case 3:
                        tablaMultiplicacion();
                        break;
                    case 4:
                        cocienteYResto();
                        break;
                    case 5:
                        diferenciaFechas();
                        break;
                    case 6:
                        sumarXDias();
                        break;
                    case 7:
                        nombreEstacionFechas();
                        break;
                    case 8:
                        domingosEntreFechas();
                        break;
                    case 9:
                        fechaActual();
                        break;
                    case 10:
                        cerrarPrograma();
                        break;
                    default:
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de numeros");
            } catch (numeroMayorOMenor e) {
                JOptionPane.showMessageDialog(null, "Numero incorrecto, prueba otra vez");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Error ");
            }

        } while (opcion != 9);
    }

    public static void sumarNumero() {
        int numero1, numero2, suma = 0;

        try {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

            suma = numero1 + numero2;

            if (numero1 < 0 || numero2 < 0) {
                throw new numeroNegativoNoValido();
            }

        } catch (numeroNegativoNoValido e) {
            JOptionPane.showMessageDialog(null, "Numeros negativos no validos");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de numeros");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

        JOptionPane.showMessageDialog(null, "La suma de los dos numeros da: " + suma);

    }

    public static void restarNumero() {
        int numero1, numero2, resta = 0;

        try {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

            resta = numero1 - numero2;

            if (numero1 < 1 || numero2 < 1) {
                throw new numeroNegativoNoValido();
            }

        } catch (numeroNegativoNoValido e) {
            JOptionPane.showMessageDialog(null, "Numeros negativos no validos");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de numeros");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

        JOptionPane.showMessageDialog(null, "La resta de los dos numeros da: " + resta);

    }

    public static void tablaMultiplicacion() {
        int numero = 0, respuesta = 0;
        String resultado = "";

        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del que quieres saber la tabla"));

                for (int x = 0; x <= 10; x++) {
                    resultado = resultado + "\n" + numero + " x " + x + " = " + (numero * x);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de numeros");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
            }

            JOptionPane.showMessageDialog(null, "Tabla " + numero + "\n" + resultado);

            respuesta = JOptionPane.showConfirmDialog(null, "Quieres introducir otro numero a multiplicar?");

        } while (respuesta != 1);

    }

    public static void cocienteYResto() {
        int numero = 0;
        int divisor = 0;
        int cociente = 0;
        int resto = 0;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
            divisor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));

            cociente = numero / divisor;
            resto = numero % divisor;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de numeros");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

        JOptionPane.showMessageDialog(null, "el cociente y el resto de " + numero + " es: " + " cociente " + cociente + " resto " + resto);

    }

    public static void diferenciaFechas() {
        String fechaIntroducida1;
        String fechaIntroducida2;
        int dias = 0;

        try {

            fechaIntroducida1 = JOptionPane.showInputDialog("Introduce una fecha en formato dd/MM/yyyy");
            SimpleDateFormat fechaNuevoFormato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaTotal1 = fechaNuevoFormato.parse(fechaIntroducida1);

            fechaIntroducida2 = JOptionPane.showInputDialog("Introduce la 2 fecha en el formato dd/MM/yyyy");
            SimpleDateFormat fechaNuevoFormato2 = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaTotal2 = fechaNuevoFormato2.parse(fechaIntroducida2);

            dias = (int) ((fechaTotal1.getTime() - fechaTotal2.getTime()) / 86400000);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de fechas");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

        JOptionPane.showMessageDialog(null, "Hay " + dias + " dias de diferencia");

    }

    public static void sumarXDias() {
        String fechaIntroducida;

        try {
            fechaIntroducida = JOptionPane.showInputDialog("Introduce una fecha con el formato dd/MM/yyyy");
            SimpleDateFormat FechaConFormato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = FechaConFormato.parse(fechaIntroducida);
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fecha1);
            calendario.add(Calendar.DATE, +100);

            JOptionPane.showMessageDialog(null, calendario.getTime());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de fechas");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public static void nombreEstacionFechas() {

        LocalDate PRIMAVERA = LocalDate.of(2018, 3, 21);
        LocalDate VERANO = LocalDate.of(2018, 6, 21);
        LocalDate OTOÑO = LocalDate.of(2018, 9, 21);
        LocalDate INVIERNO = LocalDate.of(2018, 12, 21);

        boolean error = false;
        do {
            try {
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
                LocalDate fecha = LocalDate.of(2018, mes, dia);

                if (fecha.isBefore(PRIMAVERA)) {
                    JOptionPane.showMessageDialog(null, "Invierno");
                } else if (fecha.isBefore(VERANO)) {
                    JOptionPane.showMessageDialog(null, "Primavera");
                } else if (fecha.isBefore(OTOÑO)) {
                    JOptionPane.showMessageDialog(null, "Verano");
                } else {
                    JOptionPane.showMessageDialog(null, "Otoño");
                }
                error = false;
            } catch (DateTimeException e) {
                JOptionPane.showMessageDialog(null, " Error en las fechas");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (error == true);

    }

    public static void domingosEntreFechas() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
        LocalDate fechaUno = LocalDate.parse(fechaString, formatter);

        fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
        LocalDate fechaDos = LocalDate.parse(fechaString, formatter);
        try {
            int contador = 0;
            while (fechaUno.isBefore(fechaDos)) {
                if (fechaUno.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    contador++;
                }
                fechaUno = fechaUno.plusDays(1);
            }
            JOptionPane.showMessageDialog(null, "Hay " + contador + " domingos");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Error en el parseo de fechas");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

    }

    public static void fechaActual() {
        Date fechaHoy = null;

        try {

            fechaHoy = new Date();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }

        JOptionPane.showMessageDialog(null, fechaHoy);

        Menu();
    }

    public static void cerrarPrograma() {
        System.exit(0);

    }

}

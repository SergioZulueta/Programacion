/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] mes = new int[12][31];
        int[] litros = new int[12];
        litros = datos(mes, litros);

        JOptionPane.showMessageDialog(null, "Enero : " + litros[1] + " litros" + "\n"
                + "Febrero : " + litros[1] + " litros" + "\n"
                + "Marzo : " + litros[2] + " litros" + "\n"
                + "Abril : " + litros[3] + " litros" + "\n"
                + "Mayo : " + litros[4] + " litros" + "\n"
                + "Junio : " + litros[5] + " litros" + "\n"
                + "Julio : " + litros[6] + " litros" + "\n"
                + "Agosto : " + litros[7] + " litros" + "\n"
                + "Septiembre : " + litros[8] + " litros" + "\n"
                + "Octubre : " + litros[9] + " litros" + "\n"
                + "Noviembre : " + litros[10] + " litros" + "\n"
                + "Diciembre : " + litros[11] + " litros" + "\n");

    }

    public static int[] calculoDeLitros(int[][] meses, int[] litros) {

        for (int x = 0; x < meses.length; x++) {
            for (int y = 0; y < meses[x].length; ++y) {
                litros[x] += meses[x][y];
            }
        }
        return litros;
    }

    public static int[] datos(int[][] meses, int[] litrosTotales) {
        int continuar;
        int dia, mes, litros;

        do {
            try {
                dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce un día del mes"));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mes"));
                litros = Integer.parseInt(JOptionPane.showInputDialog("Introduce los litros llovidos"));

                meses[mes - 1][dia - 1] = litros;

                litrosTotales = calculoDeLitros(meses, litrosTotales);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en la combersion de numeros" + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }

            continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");
        } while (continuar == 0);

        return litrosTotales;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    static double billetes[] = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    static int cont[] = new int[14];

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Arrays.fill(cont, 0);
            entradaDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }

    public static void entradaDatos() throws Exception {
        double importe = 0;
        double pago = 0;
        boolean ok = false;
        while (ok == false) {
            try {
                importe = Double.parseDouble(JOptionPane.showInputDialog(null, "Introdice el importe de la venta"));
                ok = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce el importe en un formato correcto");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio");
            }
        }
        ok = false;
        while (ok == false) {
            try {
                pago = Double.parseDouble(JOptionPane.showInputDialog(null, "Introdice el la cantidad pagada por el comprador"));
                ok = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce el pago en un formato correcto");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio");
            }
        }
        operaciones(importe, pago);
    }

    public static void operaciones(double importe, double pago) throws Exception {
        if (pago - importe != 0f) {
            cambio(importe, pago);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad a devolver es 0");
        }
    }

    public static void cambio(double importe, double pago) throws Exception {
        String res = "";
        String bilmon = "";
        double cambio = pago - importe;
        cambio = Math.rint(cambio * 100d) / 100;
        for (int x = 0; x < billetes.length; x++) {
            if (cambio >= billetes[x]) {
                do {
                    cambio = cambio - billetes[x];
                    cont[x]++;
                } while (cambio >= billetes[x]);
                if (x < 6) {
                    bilmon = "billete(s) de ";
                } else {
                    bilmon = "moneda(s) de ";
                }
                res = res + "El cambio serian: " + cont[x] + " " + bilmon + billetes[x] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, res);
    }
}

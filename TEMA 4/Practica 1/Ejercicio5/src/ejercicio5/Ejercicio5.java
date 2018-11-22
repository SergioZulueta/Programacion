/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //QUERIA HACER DE UNA FORMA SIMILAR LA CAJA DE CAMBIOS PERO NO SE EN QUE ME LIE, LO HE CAMBIADO MIL VECES
        //AÑADIENDO Y QUITANDO COSAS Y AL FINAL ME LIE Y NO HE SIDO CAPAZ DE SOLUCIONARLO

        double cambio[] = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
        double pago = 0;
        double vuelta = 0;

        pago = Double.parseDouble(JOptionPane.showInputDialog("Introduce el pago de la venta "));
        vuelta = Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe de la venta "));

        for (int x = 0; x < pago; x++) {

            if (vuelta >= cambio[x]) {
                JOptionPane.showMessageDialog(null, "El dinero devuelto es : " + cambio[x]);
            }

        }

    }

}

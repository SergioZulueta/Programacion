/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        String fechaIntroducida;
        Date fecha;
        Calendar calendario;

        try {
            fechaIntroducida = JOptionPane.showInputDialog("Introduce una fecha en formato dd/MM/yyyy");
            SimpleDateFormat fecha1 = new SimpleDateFormat("dd/MM/yyyy");
            fecha = fecha1.parse(fechaIntroducida);
            calendario = Calendar.getInstance();
            calendario.setTime(fecha);
            calendario.add(Calendar.SECOND, +8640000);

            JOptionPane.showMessageDialog(null, calendario.getTime());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}

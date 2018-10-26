/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hp_pc
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here       

        String fechaIntroducida;
        String fechaIntroducida2;

        try {
            fechaIntroducida = JOptionPane.showInputDialog("Teclea la fecha formato dd/mm/yyyy");
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = dateFormat1.parse(fechaIntroducida);

            fechaIntroducida2 = JOptionPane.showInputDialog("Teclea la segunda fecha dd/mm/yyyy");
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha2 = dateFormat2.parse(fechaIntroducida2);

            int dias = (int) ((fecha1.getTime() - fecha2.getTime()) / 86400000);
            
            String mensaje = String.format("Hay %d dias de diferencia", dias);
            JOptionPane.showMessageDialog(null, mensaje);
            
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de fechas jaja xd " + e.getMessage());
        }
    }
}

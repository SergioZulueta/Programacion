package GUI;

import Excepciones.*;
import ejercicio2.*;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp_pc
 */
public class Interfaz extends javax.swing.JFrame {
    static int cod;
    static boolean error,error2,modifi;
    static String CadenaError;
    static String nombre,html;

    public Interfaz() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    public Interfaz(int codigo,boolean modif) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);      
        if(!modif)
            tfCodigo.setText(Integer.toString(codigo));
        else{
            tfCodigo.setEnabled(true);
        }
        cod=codigo;
        modifi=modif;
        
        bA.setEnabled(true);
        //Errores
        ErrNombre.setVisible(false);
        ErrLugar.setVisible(false);
        ErrFecha.setVisible(false);
        ErrHorai.setVisible(false);
        ErrAforo.setVisible(false);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfLugar = new javax.swing.JTextField();
        tfFecha = new javax.swing.JTextField();
        tfHorai = new javax.swing.JTextField();
        tfHoraf = new javax.swing.JTextField();
        tfAforo = new javax.swing.JTextField();
        bA = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        ErrNombre = new javax.swing.JLabel();
        ErrLugar = new javax.swing.JLabel();
        ErrFecha = new javax.swing.JLabel();
        ErrHorai = new javax.swing.JLabel();
        ErrAforo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Lugar");

        jLabel3.setText("Fecha");

        jLabel4.setText("Hora de inicio");

        jLabel5.setText("Hora de fin");

        jLabel7.setText("Aforo");

        tfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaActionPerformed(evt);
            }
        });

        tfHorai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraiActionPerformed(evt);
            }
        });

        bA.setText("Aceptar");
        bA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        jLabel8.setText("Codigo");

        tfCodigo.setEnabled(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        ErrNombre.setForeground(new java.awt.Color(255, 0, 0));
        ErrNombre.setText("**Requerido**");

        ErrLugar.setForeground(new java.awt.Color(255, 0, 0));
        ErrLugar.setText("**Requerido**");

        ErrFecha.setForeground(new java.awt.Color(255, 0, 0));
        ErrFecha.setText("**Requerido**");

        ErrHorai.setForeground(new java.awt.Color(255, 0, 0));
        ErrHorai.setText("**Requerido**");

        ErrAforo.setForeground(new java.awt.Color(255, 0, 0));
        ErrAforo.setText("**Requerido**");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombre)
                            .addComponent(tfLugar)
                            .addComponent(tfFecha)
                            .addComponent(tfHorai)
                            .addComponent(tfHoraf)
                            .addComponent(tfAforo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ErrLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ErrFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ErrHorai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ErrAforo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(bA)
                        .addGap(118, 118, 118)
                        .addComponent(jButton2)
                        .addGap(0, 227, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrLugar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfHorai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrHorai))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfHoraf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrAforo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bA)
                    .addComponent(jButton2))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAActionPerformed
        // TODO add your handling code here:
        try{                           
            if(validar()&&!modifi){                    
                Ejercicio2.nuevoAcontecimiento(tfNombre.getText(),tfLugar.getText(),tfFecha.getText(),tfHorai.getText(),tfHoraf.getText(),Integer.parseInt(tfAforo.getText()),false);
                Ejercicio2.guardado();
            }
            else
                if(validar()&&modifi){
                    Ejercicio2.nuevoAcontecimiento(tfNombre.getText(),tfLugar.getText(),tfFecha.getText(),tfHorai.getText(),tfHoraf.getText(),Integer.parseInt(tfAforo.getText()),true);
                    Ejercicio2.modif(this);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error"+e.getCause());
        }
    }//GEN-LAST:event_bAActionPerformed

    private void tfHoraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraiActionPerformed

    private void tfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
        llenarModif();
    }//GEN-LAST:event_tfCodigoActionPerformed

    public boolean validar(){
        boolean ret=true;
        CadenaError="Los siguientes elementos estan en un formato incorrecto\n";
        error2=false;
        try{
            if(!validation(tfNombre.getText(),"^[A-Za-z]*$",ErrNombre))
                ret=false;
            if(error){
                CadenaError+="-Nombre\n";
                error2=true;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error nombre");
        } 
        finally{
            try{
                if(!validation(tfLugar.getText(),"^[A-Za-z]*$",ErrLugar))
                    ret=false;
                if(error){
                    CadenaError+="-Lugar\n";
                    error2=true;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error lugar");
            } 
            finally{
                try{
                    if(!validation(tfFecha.getText(),"^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$",ErrFecha)) {
                        ret=false;
                    } else {
                    }
                    if(error){
                        CadenaError+="-Fecha\n";
                        error2=true;
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Error fecha");
                } 
                finally{
                    try{
                        if(!validation(tfHorai.getText(),"^.*$",ErrHorai))//Aqui
                            ret=false;
                        if(error){
                            CadenaError+="-Hora inicio\n";
                            error2=true;
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Error hora");        
                    }
                    finally{
                        try{
                        if(!validation(tfAforo.getText(),"^.*$",ErrAforo))
                            ret=false;
                        if(error){
                            CadenaError+="-Aforo\n";
                            error2=true;
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Error aforo");        
                        }
                        finally{
                            if(error2)
                                JOptionPane.showMessageDialog(this, CadenaError);
                        }
                    }
                }   
            }
        }  
        return ret;
    }
    public boolean validation(String campo,String regex, javax.swing.JLabel err){
        try{
            if(campo.isEmpty())
                throw new DatoVacio();
            else
                err.setVisible(false);
            if(!pattern(campo,regex))
                throw new DatoNoValido();
        }catch (DatoVacio e){            
            err.setVisible(true);
            return false;
        }catch (DatoNoValido e){
            error=true;
            return false;                   
        }
        error=false;
        return true;
    }
    public boolean pattern(String dato, String regex){
        Pattern pat=Pattern.compile(regex);
        Matcher m=pat.matcher(dato);
        return m.matches();
    } 
    public void llenarModif(){
        try{
            if(Ejercicio2.buscarModif(Integer.parseInt(tfCodigo.getText()))){
                tfNombre.setText(Ejercicio2.sNombre());
                tfLugar.setText(Ejercicio2.sLugar());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                tfFecha.setText(sdf.format(Ejercicio2.sFecha()));
                SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm");
                tfHorai.setText(sdf2.format(Ejercicio2.sHoraI()));
                tfHoraf.setText(sdf2.format(Ejercicio2.sHoraF()));
                tfAforo.setText(Integer.toString(Ejercicio2.sAforo()));
                tfCodigo.setEnabled(false);
                bA.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "No existe ese codigo en la base de datos\n los codigos disponibles son: " + Ejercicio2.allCodigos());
            }
        }catch(Exception e){
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrAforo;
    private javax.swing.JLabel ErrFecha;
    private javax.swing.JLabel ErrHorai;
    private javax.swing.JLabel ErrLugar;
    private javax.swing.JLabel ErrNombre;
    private javax.swing.JButton bA;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfAforo;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfHoraf;
    private javax.swing.JTextField tfHorai;
    private javax.swing.JTextField tfLugar;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}

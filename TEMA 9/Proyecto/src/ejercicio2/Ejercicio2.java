/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;


import GUI.*;
import UML.*;
import UMLDB.*;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author hp_pc
 */
public class Ejercicio2 {

    private static Conexion con;
    private static Menu vp;
    private static AcontecimientoBD oProyectoDAO;
    static int codigo;
    private static ArrayList<acontecimiento> acts;
    private static AcontecimientoBD miAcontecimiento;
    private static acontecimiento acont;
    private static Interfaz i;

    public static void main(String[] args) {

        try {
            con = new Conexion();
            con.getConnection();

            vp = new Menu();
            vp.setVisible(true);

            oProyectoDAO = new AcontecimientoBD(con.getConnection());

        } catch (Exception e) {
            System.out.println("Error en el main");
        }

    }

    public static void ventanas(boolean a) throws Exception {
        vp.setVisible(false);
        i = new Interfaz(codigo, a);
    }

    public static void nuevoAcontecimiento(int cod, String nombre, String lugar, String fecha, String horaI, String horaF, int aforo, boolean modif) throws Exception {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date f = fmt.parse(fecha);
        java.sql.Date fech = new java.sql.Date(f.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        long ms1 = sdf.parse(horaI).getTime();
        Time horainit = new Time(ms1);

        long ms2 = sdf.parse(horaF).getTime();
        Time horafin = new Time(ms2);

        if (horaF.isEmpty()) {
            horafin = null;
        }
        acontecimiento ac = new acontecimiento(cod, nombre, lugar, fech, horainit, horafin, aforo);
        if (!modif) {
            miAcontecimiento.nuevoAcontecimiento(ac);
        } else {
            miAcontecimiento.modificar(ac);
        }
    }

    public static boolean listaActs(String nombre) throws Exception {
        AcontecimientoBD ac = new AcontecimientoBD();
        acts = ac.consultarAcontecimientos(nombre);
        if (acts.size() == 0) {
            return false;
        }
        return true;
    }

    public static String lista() {
        String cadena = "<html><body><table><tr><td>Codigo</td><td>Nombre</td><td>Lugar</td><td>Fecha</td><td>Horai</td><td>Horaf</td><td>Aforo</td></tr>";
        for (acontecimiento act : acts) {
            cadena += "<tr><td>" + act.getCod() + "</td><td>" + act.getNombre() + "</td><td>" + act.getLugar() + "</td><td>" + act.getFecha() + "</td><td>" + act.getHora_i() + "</td><td>" + act.getHora_f() + "</td><td>" + act.getAforo() + "</td></tr>";
        }
        cadena += "</table></body></html>";
        return cadena;
    }

    public static int codigo() throws Exception {
        AcontecimientoBD a = new AcontecimientoBD();
        return a.obtenerCodigo();
    }

    public static void guardado() throws Exception {
        i.dispose();
        i = new Interfaz(codigo(), false);
    }

    public static void modif(javax.swing.JFrame v) {
        v.dispose();
        vp = new Menu();
    }

    public static void eliminar(int cod) throws Exception {
        AcontecimientoBD ac = new AcontecimientoBD();

        ac.eliminar(cod);
    }

    public static boolean buscarModif(int cod) throws Exception {
        acts = miAcontecimiento.consultarTodo();
        int x;
        for (x = 0; x < acts.size() && acts.get(x).getCod() != cod; x++) {
        }
        if (x == acts.size()) {
            return false;
        }
        acont = miAcontecimiento.objCodigo(cod);
        return true;
    }

    public static String allCodigos() throws Exception {
        return miAcontecimiento.allCodigos();
    }

    public static String sNombre() {
        return acont.getNombre();
    }

    public static String sLugar() {
        return acont.getLugar();
    }

    public static Date sFecha() {
        return acont.getFecha();
    }

    public static Time sHoraI() {
        return acont.getHora_i();
    }

    public static Time sHoraF() {
        return acont.getHora_f();
    }

    public static int sAforo() {
        return acont.getAforo();
    }

    public static void modificar() {

    }

    public static void salir() {
        System.exit(0);
    }

}

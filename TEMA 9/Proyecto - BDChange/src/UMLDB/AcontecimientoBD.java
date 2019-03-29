/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMLDB;

import UML.acontecimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hp_pc
 */
public class AcontecimientoBD {

    private Connection con;
    private int codigo;

    public AcontecimientoBD(Connection con) {
        this.con = con;
    }

    public AcontecimientoBD() {

    }

    public int obtenerCodigo() throws Exception {
        Conexion con = new Conexion();
        Statement sentencia = con.getConnection().createStatement();
        ResultSet res = sentencia.executeQuery("select max(id_a)as id_a from proyecto");
        if (res.next()) {
            codigo = res.getInt("id_a") + 1;
        } else {
            codigo = 1;
        }
        return codigo;
    }

    public void nuevoAcontecimiento(acontecimiento a) throws Exception {
        /*Conexion con = new Conexion();

        Statement sentencia = con.getConnection().createStatement();

        sentencia.executeUpdate("INSERT INTO proyecto VALUES( '" + a.getNombre() 
                + "','" + a.getLugar() 
                + "','" + a.getFecha() 
                + "','" + a.getHora_i() 
                + "','" + a.getHora_f() 
                + "','" + a.getAforo() + "')");*/

        String plantilla = "INSERT INTO proyecto VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, a.getNombre());
        ps.setString(2, a.getLugar());
        ps.setDate(3, a.getFecha());
        ps.setTime(4, a.getHora_i());
        ps.setTime(5, a.getHora_f());
        ps.setInt(6, a.getAforo());
        

        int n = ps.executeUpdate();
        ps.close();
        if (n != 1) {
            throw new Exception("El número de filas actualizadas no es uno");
        }

    }

    public void eliminar(int cod) throws Exception {
        Conexion con = new Conexion();
        Statement sentencia = con.getConnection().createStatement();

        sentencia.executeUpdate("delete from proyecto where id_a=" + cod);
        
        sentencia.close();
        con.desconectar();
    }

    public ArrayList<acontecimiento> consultarAcontecimientos(String nombre) throws Exception {
        ArrayList<acontecimiento> listaPersonas = new ArrayList();
        Conexion con = new Conexion();

        PreparedStatement sentencia = con.getConnection().prepareStatement("SELECT * FROM proyecto WHERE UPPER(nombre)=?");
        sentencia.setString(1, nombre);
        ResultSet res = sentencia.executeQuery();

        while (res.next()) {
            acontecimiento a = new acontecimiento();
            a.setCod(res.getInt("id_a"));
            a.setNombre(res.getString("nombre"));
            a.setLugar(res.getString("lugar"));
            a.setFecha(res.getDate("fecha"));
            a.setHora_i(res.getTime("hora_inicio"));
            a.setHora_f(res.getTime("hora_fin"));
            a.setAforo(res.getInt("aforo"));
            listaPersonas.add(a);
        }
        sentencia.close();
        res.close();
        con.desconectar();
        return listaPersonas;
    }

    public ArrayList<acontecimiento> consultarTodo() throws Exception {
        ArrayList<acontecimiento> listaPersonas = new ArrayList();
        Conexion con = new Conexion();

        Statement sentencia = con.getConnection().createStatement();
        ResultSet res = sentencia.executeQuery("SELECT * FROM proyecto");

        while (res.next()) {
            acontecimiento a = new acontecimiento();
            a.setCod(res.getInt("id_a"));
            a.setNombre(res.getString("nombre"));
            a.setLugar(res.getString("lugar"));
            a.setFecha(res.getDate("fecha"));
            a.setHora_i(res.getTime("hora_inicio"));
            a.setHora_f(res.getTime("hora_fin"));
            a.setAforo(res.getInt("aforo"));
            listaPersonas.add(a);
        }
        sentencia.close();
        res.close();
        con.desconectar();
        return listaPersonas;
    }

    public String allCodigos() throws Exception {
        String cadena = "";
        Conexion con = new Conexion();

        Statement sentencia = con.getConnection().createStatement();
        ResultSet res = sentencia.executeQuery("SELECT id_a FROM proyecto");

        while (res.next()) {
            cadena += res.getInt("id_a") + ", ";
        }
        sentencia.close();
        res.close();
        con.desconectar();
        return cadena;
    }

    public acontecimiento objCodigo(int cod) throws Exception {
        acontecimiento a = null;
        Conexion con = new Conexion();

        PreparedStatement sentencia = con.getConnection().prepareStatement("SELECT * FROM proyecto WHERE id_a=?");
        sentencia.setString(1, Integer.toString(cod));
        ResultSet res = sentencia.executeQuery();

        while (res.next()) {
            a = new acontecimiento();
            a.setCod(cod);
            a.setNombre(res.getString("nombre"));
            a.setLugar(res.getString("lugar"));
            a.setFecha(res.getDate("fecha"));
            a.setHora_i(res.getTime("hora_inicio"));
            a.setHora_f(res.getTime("hora_fin"));
            a.setAforo(res.getInt("aforo"));
        }
        sentencia.close();
        res.close();
        con.desconectar();
        return a;
    }

    public void modificar(acontecimiento ac) throws Exception {
        Conexion con = new Conexion();
        PreparedStatement sentencia = con.getConnection().prepareStatement("update proyecto set nombre=?,lugar=?,fecha=?,hora_inicio=?,hora_fin=?,aforo=? where id_a=?");
        sentencia.setString(1, ac.getNombre());
        sentencia.setString(2, ac.getLugar());
        sentencia.setDate(3, ac.getFecha());
        sentencia.setTime(4, ac.getHora_i());
        sentencia.setTime(5, ac.getHora_f());
        sentencia.setInt(6, ac.getAforo());
        sentencia.setInt(7, ac.getCod());
        sentencia.executeUpdate();
        sentencia.close();
        con.desconectar();
    }

}

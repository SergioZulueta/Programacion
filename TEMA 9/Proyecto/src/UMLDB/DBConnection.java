/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMLDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp_pc
 */
public class DBConnection {

    private String bd = "ejercicio2";
    private String login = "root";
    private String password = "usbw";
    private String url = "jdbc:mysql://localhost:3307/" + bd;

    private Connection con;

    public DBConnection() {
    }

    public void conectar() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, login, password);

        if (con == null) {
            throw new Exception("Problemas con la conexión");
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void desconectar() throws Exception {
        con.close();
    }
}

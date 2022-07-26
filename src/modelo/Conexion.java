/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/usuarios?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "saramaria2007";
    
    public Connection getConnection(){
        Connection conexion=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
                conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
                JOptionPane.showMessageDialog(null,"Conexion Existosa");
        } catch (Exception e) {
            System.err.println("Error "+e);
        }
        return conexion;
     }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Jonathan
 */
public class SQLUsuario {
    public boolean registrar(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        
        try {
            Connection conexion = con.getConnection();   
            
            ps = (PreparedStatement) conexion.prepareStatement("insert into usuario (nombreUsuario,contraseña,nombre,correo,idTipo_usuario) values (?,?,?,?,?)");
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getCorreo());
            ps.setInt(5, usuario.getIdTipo_usuario());
            
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
     public int vereficarUsuario(String usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Connection conexion = con.getConnection();   
            
            ps = (PreparedStatement) conexion.prepareStatement("select count(id) from usuario where nombreUsuario=?");
            ps.setString(1, usuario);
                    
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (Exception e) {
            return 1;
        }
    }
     
     public boolean comprobarEmail(String correo){
            // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        
        return mather.find();
     }
     
      public boolean iniciarSesion(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Connection conexion = con.getConnection();   
            
            ps = (PreparedStatement) conexion.prepareStatement("select u.id,u.nombreUsuario,u.contraseña,u.nombre,u.idTipo_usuario,t.nombre from usuario as u inner join tipo_usuario as t on u.idTipo_usuario = t.id where nombreUsuario=?");
            ps.setString(1, usuario.getNombreUsuario());
                    
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (usuario.getContraseña().equals(rs.getString("contraseña"))) {
                    
                    ps = (PreparedStatement) conexion.prepareStatement("update usuario set ultima_sesion=? where id=?");
                    ps.setString(1, usuario.getUltima_sesion());
                    ps.setInt(2, rs.getInt("id"));
                    ps.executeUpdate();
                    
                    usuario.setId(rs.getInt("u.id"));
                    usuario.setNombre(rs.getString("u.nombre"));
                    usuario.setIdTipo_usuario(rs.getInt("u.idTipo_usuario"));
                    usuario.setNombreRol(rs.getString("t.nombre"));
                    return true;
                }
                else {
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}

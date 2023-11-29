/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.model.dao;

import cl.duoc.pgy2121.model.conexion.Conexion;
import cl.duoc.pgy2121.model.entidades.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CETECOM
 */
public class UsuarioDAO implements IGenericDAO{
    
    @Override 
    public int insert(Object object){
        int retorno = 0;   
        Usuario user = (Usuario) object;
       
        try{
            
            String insert = " insert into usuario (usuario, password, correo) "
                         + " values (?, ?, ?)";
            Conexion conexion = new Conexion();
      // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conexion.obtenerConexion().prepareStatement(insert);
           
            preparedStmt.setString(1, user.getUsuario());
            preparedStmt.setString(2, user.getPassword());
            preparedStmt.setString(3, user.getCorreo());
            
           // execute the preparedstatement
            preparedStmt.execute();

            conexion.obtenerConexion().close();
            retorno = 1;
        } catch(SQLException sqle){
            System.out.println("Error al insertar el registro. ");
        }
        
        return retorno;
    }
    
    @Override
    public List<Usuario> selectAll(){
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            String query = "SELECT usuario, password, correo " +
                           "FROM usuario";
             Conexion conexion = new Conexion();
             Statement stmt  = conexion.obtenerConexion().createStatement();
             ResultSet rs    = stmt.executeQuery(query);
           
            // loop through the result set
            while (rs.next()) {
                String username = rs.getString("usuario");
                String password = rs.getString("password");
                String correo   = rs.getString("correo");
               
                Usuario usuario = new Usuario();
                usuario.setUsuario(username);
                usuario.setPassword(password);
                usuario.setCorreo(correo);
                
                listaUsuarios.add(usuario);
            }
            
            conexion.obtenerConexion().close();
        } catch(SQLException sqle){
            System.out.println("Error al insertar el registro. ");
        }
          return listaUsuarios;   
    }

    @Override
    public int update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}

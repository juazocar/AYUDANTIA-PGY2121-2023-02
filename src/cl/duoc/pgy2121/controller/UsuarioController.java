/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.controller;

import cl.duoc.pgy2121.model.dao.UsuarioDAO;
import cl.duoc.pgy2121.model.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Plaza Vespucio
 */
public class UsuarioController {
    
    private Usuario usuario;
    private UsuarioDAO usuarioDao;
    
    public UsuarioController() {
       usuarioDao = new UsuarioDAO();
    }
 
    public int insert(Usuario usuario){
        return usuarioDao.insert(usuario);
    }
    
     public List<Usuario> selectAll(){
         return usuarioDao.selectAll();
     }
    
}

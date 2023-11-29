/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.model.entidades;

/**
 *
 * @author Juan Azocar Malverde
 * @version 1.0.0
 */
public class Usuario {
    
    private int    id;
    private String usuario;
    private String password;
    private String correo;

    public Usuario() {
    }

    /**
     * Constructor con parametros de la clase Usuario.
     * 
     * @param id
     * @param usuario
     * @param password
     * @param correo 
     */
    public Usuario(int id, String usuario, String password, String correo) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
    }

    /**
     * Metodo getter del atributo id
     * @return (int) id
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario + ", password=" + password + ", correo=" + correo + '}';
    }
       
}

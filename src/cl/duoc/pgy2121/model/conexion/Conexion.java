package cl.duoc.pgy2121.model.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author administrador
 */
public class Conexion {
    
    public Connection obtenerConexion() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pgy2121", 
                                                     "root", 
                                                     "Informatica.23");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión" + e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return connection;
    }
}
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Raquel
 */
public class Aplicacion_Banco {

    /**
     * @param args the command line arguments
     */
    public Connection ingresar() {
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("DRIVER Java a la Bd cargado!!");

        } catch (ClassNotFoundException ex) {
            System.out.println("Error: no se encuentra el Driver" + ex);
        }

        try {
            String urlbd = "jdbc:derby://localhost:1527/Banco ";
            conexion = DriverManager.getConnection(urlbd, "cuenta", "cuenta");
            System.out.println("Conexion establecida  a la BD");
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo establecer  conexion a la BD !!" + ex);
        }
        return conexion;
    }

}

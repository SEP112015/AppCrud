package empleadoscrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author erlin
 */




public class ConexionMYSQL {

   
    String url = "jdbc:mysql://localhost:3306/empleados";
    String user = "root";
    String password = "Pp332244,.z";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    private static Connection conexion;
    
    public Connection conectar() {
        try {
            Class.forName(driver);
            cx =  DriverManager.getConnection(url, user, password);
            System.out.println("Estamos conectados con exito.");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en la conexion :" + ex);
            Logger.getLogger(ConexionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
 
        }
}   }


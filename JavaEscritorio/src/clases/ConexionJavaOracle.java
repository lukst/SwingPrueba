package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionJavaOracle {

    private static Connection Conexion;

    public void conectarDB() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            System.out.println("Connecting to the database...");
            String myDB = "jdbc:oracle:thin:@localhost:1521:XE";
            String usuario = "system";
            String password = "manager";
            Conexion = DriverManager.getConnection(myDB, usuario, password);
            JOptionPane.showMessageDialog(null, "Se ha iniciado sesión en la BBDD");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void closeConnection() {
        try {
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha finalizado la sesión con la BBDD.");
        } catch (Exception e) {
            System.out.println("Error...");
        }
    }
}

package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionJavaOracle {

    private static Connection Conexion;

    public void conectarDB() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            //System.out.println("Connecting to the database...");
            String myDB = "jdbc:oracle:thin:@localhost:1521:XE";
            String usuario = "system";
            String password = "manager";
            Conexion = DriverManager.getConnection(myDB, usuario, password);
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

    public String obtenerValoresPorCampo(String table_name, String campo) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while(resultSet.next()){
                String c = resultSet.getString(campo);
                return c;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
        return null;
    }
}

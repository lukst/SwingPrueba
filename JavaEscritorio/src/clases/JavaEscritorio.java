package clases;

import formularios.frmLogin;

public class JavaEscritorio {

    public static void main(String[] args) {
        frmLogin miLogin = new frmLogin();
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
        ConexionJavaOracle conectar = new ConexionJavaOracle();
        conectar.conectarDB();
        conectar.closeConnection();
    }

}

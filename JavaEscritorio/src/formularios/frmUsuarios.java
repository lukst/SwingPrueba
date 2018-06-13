/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author lukstyle
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmUsuarios
     */
    public frmUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDUsuario = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        lblIDUsuario1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblIDUsuario2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblIDUsuario3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblIDUsuario4 = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        lblIDUsuario5 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        btnPrimero = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");
        setAutoscrolls(true);

        lblIDUsuario.setText("ID Usuario:");

        txtIdUsuario.setEnabled(false);

        lblIDUsuario1.setText("Nombres:");

        txtNombres.setEnabled(false);

        lblIDUsuario2.setText("Apellidos:");

        txtApellidos.setEnabled(false);

        lblIDUsuario3.setText("Password:");

        txtPass.setEnabled(false);

        lblIDUsuario4.setText("Confirmación:");

        txtConfirmacion.setEnabled(false);

        lblIDUsuario5.setText("Confirmación:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un perfil", "Administrador", "Empleado" }));
        cmbPerfil.setEnabled(false);

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/primero.png"))); // NOI18N
        btnPrimero.setToolTipText("Va al primer registro");

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("Va al último registro");

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras.png"))); // NOI18N
        btnAtras.setToolTipText("Va al anterior registro");

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/siguiente.png"))); // NOI18N
        btnSiguiente.setToolTipText("Va al siguiente registro");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        btnEditar.setToolTipText("Modifica el registro actual");

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btnBorrar.setToolTipText("Borra el registro actual");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guarda los cambios");
        btnGuardar.setEnabled(false);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Busca el registro");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        btnAdd.setToolTipText("Crea un nuevo registro");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIDUsuario1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIDUsuario2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIDUsuario3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIDUsuario4)
                                    .addComponent(lblIDUsuario5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConfirmacion)
                                    .addComponent(cmbPerfil, 0, 128, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtNombres)
                    .addComponent(txtApellidos))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDUsuario)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDUsuario5)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDUsuario1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDUsuario2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDUsuario3)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDUsuario4)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrimero)
                    .addComponent(btnUltimo)
                    .addComponent(btnAtras)
                    .addComponent(btnSiguiente)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnAdd))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel lblIDUsuario;
    private javax.swing.JLabel lblIDUsuario1;
    private javax.swing.JLabel lblIDUsuario2;
    private javax.swing.JLabel lblIDUsuario3;
    private javax.swing.JLabel lblIDUsuario4;
    private javax.swing.JLabel lblIDUsuario5;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
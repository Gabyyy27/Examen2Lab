package examenlab2.lourdesamador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author porti
 */
public class Frame extends javax.swing.JFrame {

    private PSNUsers psnUsers;

    /**
     * Creates new form Frame
     */
    public Frame() throws IOException {
        initComponents();
        psnUsers = new PSNUsers("psn.dat");
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CREAT = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        USERNAME = new javax.swing.JTextField();
        CREAR = new javax.swing.JButton();
        DEACTIVE = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        USERNAMEDS = new javax.swing.JTextField();
        DESACTIVAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CREARUSUARIO = new javax.swing.JButton();
        addTrophy = new javax.swing.JButton();
        DesActivarUser = new javax.swing.JButton();
        SearchUser = new javax.swing.JButton();
        BUSCADOR = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setText("INGRESE UN USERNAME:");

        CREAR.setText("CREAR");
        CREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(CREAR))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(CREAR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CREATLayout = new javax.swing.GroupLayout(CREAT.getContentPane());
        CREAT.getContentPane().setLayout(CREATLayout);
        CREATLayout.setHorizontalGroup(
            CREATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(CREATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CREATLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
        );
        CREATLayout.setVerticalGroup(
            CREATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(CREATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CREATLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel1.setText("INGRESE UN USERNAME:");

        DESACTIVAR.setText("DESACTIVAR");
        DESACTIVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESACTIVARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(USERNAMEDS, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(DESACTIVAR))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(USERNAMEDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(DESACTIVAR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DEACTIVELayout = new javax.swing.GroupLayout(DEACTIVE.getContentPane());
        DEACTIVE.getContentPane().setLayout(DEACTIVELayout);
        DEACTIVELayout.setHorizontalGroup(
            DEACTIVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DEACTIVELayout.setVerticalGroup(
            DEACTIVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DEACTIVELayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(151, 151, 151))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CREARUSUARIO.setBackground(new java.awt.Color(255, 255, 255));
        CREARUSUARIO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CREARUSUARIO.setText("CREAR USUARIO");
        CREARUSUARIO.setActionCommand(null);
        CREARUSUARIO.setAutoscrolls(true);
        CREARUSUARIO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREARUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREARUSUARIOActionPerformed(evt);
            }
        });

        addTrophy.setBackground(new java.awt.Color(255, 255, 255));
        addTrophy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addTrophy.setText("AGREGAR TROFEO");
        addTrophy.setActionCommand(null);
        addTrophy.setAutoscrolls(true);
        addTrophy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addTrophy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrophyActionPerformed(evt);
            }
        });

        DesActivarUser.setBackground(new java.awt.Color(255, 255, 255));
        DesActivarUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DesActivarUser.setText("DESACTIVAR USUARIO");
        DesActivarUser.setActionCommand(null);
        DesActivarUser.setAutoscrolls(true);
        DesActivarUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DesActivarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesActivarUserActionPerformed(evt);
            }
        });

        SearchUser.setBackground(new java.awt.Color(0, 51, 204));
        SearchUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examenlab2/lourdesamador/buscaricono.png"))); // NOI18N
        SearchUser.setBorder(null);
        SearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUserActionPerformed(evt);
            }
        });

        BUSCADOR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BUSCADOR.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CREARUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BUSCADOR)
                        .addGap(18, 18, 18)
                        .addComponent(SearchUser)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DesActivarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(addTrophy, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(102, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BUSCADOR))
                .addGap(49, 49, 49)
                .addComponent(CREARUSUARIO)
                .addGap(44, 44, 44)
                .addComponent(DesActivarUser)
                .addGap(45, 45, 45)
                .addComponent(addTrophy)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CREARUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREARUSUARIOActionPerformed
        this.CREAT.setVisible(true);
        CREAT.setSize(320, 200);
        CREAT.setLocationRelativeTo(null);

    }//GEN-LAST:event_CREARUSUARIOActionPerformed

    private void DesActivarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesActivarUserActionPerformed
        this.DEACTIVE.setVisible(true);
        DEACTIVE.setSize(320, 200);
        DEACTIVE.setLocationRelativeTo(null);
    }//GEN-LAST:event_DesActivarUserActionPerformed

    private void SearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUserActionPerformed
        // TODO add your handling code here:
        String username = BUSCADOR.getText();
        if (username != null && !username.isEmpty()) {
            try {
                long pos = psnUsers.users.search(username);
                if (pos != -1) {
                    psnUsers.playerInfo(username);
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al buscar la informacion del usuarion", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario no válido", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_SearchUserActionPerformed

    private void addTrophyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrophyActionPerformed
        String username = JOptionPane.showInputDialog(null, "Ingrese un username: ", "AGREGAR TROFEO", JOptionPane.QUESTION_MESSAGE);
        if (username != null && !username.isEmpty()) {
            try {
                long pos = psnUsers.users.search(username);
                if (pos != -1) {
                    String trophyGame = JOptionPane.showInputDialog(null, "Ingrese el nombre del juego del trofeo: ", "AGREGAR TROFEO", JOptionPane.QUESTION_MESSAGE);
                    String trophyName = JOptionPane.showInputDialog(null, "Ingrese el nombre del trofeo: ", "AGREGAR TROFEO", JOptionPane.QUESTION_MESSAGE);
                    Trophy type = selectTrophyType();

                    psnUsers.addTrophieTo(username, trophyGame, trophyName, type);
                    JOptionPane.showMessageDialog(null, "Trofeo agregado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al agregar el trofeo", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addTrophyActionPerformed

    private void DESACTIVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESACTIVARActionPerformed
        String username = USERNAMEDS.getText();
        if (username != null && !username.isEmpty()) {
            try {

                long pos = psnUsers.users.search(username);

                if (pos != -1) {

                    psnUsers.deactiveUser(username);
                    JOptionPane.showMessageDialog(null, "Usuario desactivado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al desactivar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DESACTIVARActionPerformed

    private void CREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREARActionPerformed
          String username = USERNAME.getText();
        try {
            if (username != null && !username.isEmpty()) {
                psnUsers.addUser(username);
                JOptionPane.showMessageDialog(null, "Usuario creado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nombre de usuario no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CREARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BUSCADOR;
    private javax.swing.JButton CREAR;
    private javax.swing.JButton CREARUSUARIO;
    private javax.swing.JDialog CREAT;
    private javax.swing.JDialog DEACTIVE;
    private javax.swing.JButton DESACTIVAR;
    private javax.swing.JButton DesActivarUser;
    private javax.swing.JButton SearchUser;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JTextField USERNAMEDS;
    private javax.swing.JButton addTrophy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private Trophy selectTrophyType() {
        String[] options = {" PLATINO", "ORO", "PLATA", "BRONCE"};
        int choice = JOptionPane.showOptionDialog(null, "Seleccione el tipo de trofeo:", "Tipo de Trofeo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (choice) {
            case 0:
                return Trophy.PLATINO;
            case 1:
                return Trophy.ORO;
            case 2:
                return Trophy.PLATA;
            case 3:
                return Trophy.BRONCE;
            default:
                return Trophy.BRONCE;

        }
    }
}

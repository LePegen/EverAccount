package view;

/**
 *
 * @author Gene Garcia
 */
public class LoginView  extends javax.swing.JFrame implements View{

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblAccountUsername = new javax.swing.JLabel();
        btnEye = new javax.swing.JLabel();
        pwfAccountPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 120));

        lblAccountUsername.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblAccountUsername.setText("Account Username");
        getContentPane().add(lblAccountUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        btnEye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEye.setText("O");
        getContentPane().add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 30, 30));

        pwfAccountPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfAccountPassword.setText("jPasswordField1");
        getContentPane().add(pwfAccountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 260, 30));

        btnLogin.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEye;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblAccountUsername;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField pwfAccountPassword;
    // End of variables declaration//GEN-END:variables

}

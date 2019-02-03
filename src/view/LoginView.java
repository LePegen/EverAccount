package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.action.ActionHandler;
import view.action.LoginViewAction;

/**
 *
 * @author Gene Garcia
 */
public class LoginView extends View {

    private ActionHandler handler;
    //private JTextField tfUsername;

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        btnEye = new javax.swing.JLabel();
        pwfAccountPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblForgotAccount = new javax.swing.JLabel();
        lblCreateAccount = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Everaccount - Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setModalExclusionType(null);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 120));

        tfUsername.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        tfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsername.setText("Gene");
        tfUsername.setBorder(null);
        tfUsername.setOpaque(false);
        getContentPane().add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, -1));

        btnEye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open eye.png"))); // NOI18N
        btnEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEyeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEyeMouseReleased(evt);
            }
        });
        getContentPane().add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 40, 30));

        pwfAccountPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfAccountPassword.setText("12345");
        pwfAccountPassword.setBorder(null);
        pwfAccountPassword.setEchoChar('\u2022');
        pwfAccountPassword.setOpaque(false);
        getContentPane().add(pwfAccountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 260, 30));

        btnLogin.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 240, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 260, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 260, 20));

        lblForgotAccount.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblForgotAccount.setText("Forgot account?");
        lblForgotAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblForgotAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblForgotAccountMouseExited(evt);
            }
        });
        getContentPane().add(lblForgotAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 390, 110, -1));

        lblCreateAccount.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblCreateAccount.setText("Create account");
        lblCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateAccountMouseExited(evt);
            }
        });
        getContentPane().add(lblCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginViewAction loginHandler = (LoginViewAction) handler;
        loginHandler.loginPressAction();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMousePressed
        System.out.println("closed eye");
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide eye.png"))); // NOI18N

        char echo = pwfAccountPassword.getEchoChar();

        switch (echo) {
            case '•':
                pwfAccountPassword.setEchoChar((char) 0);
                break;
            default:
                pwfAccountPassword.setEchoChar('•');
        }

    }//GEN-LAST:event_btnEyeMousePressed

    private void btnEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMouseReleased
        System.out.println("opened eye");
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open eye.png"))); // NOI18N

        char echo = pwfAccountPassword.getEchoChar();

        switch (echo) {
            case '•':
                pwfAccountPassword.setEchoChar((char) 0);
                break;
            default:
                pwfAccountPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_btnEyeMouseReleased

    private void lblCreateAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccountMouseEntered
        System.out.println("hovered");
        lblCreateAccount.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_lblCreateAccountMouseEntered

    private void lblCreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccountMouseExited
        System.out.println("exit");
        lblCreateAccount.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCreateAccountMouseExited

    private void lblForgotAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotAccountMouseEntered
        System.out.println("hovered");
        lblForgotAccount.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_lblForgotAccountMouseEntered

    private void lblForgotAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotAccountMouseExited
        System.out.println("exit");
        lblForgotAccount.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblForgotAccountMouseExited

    private void lblCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccountMouseClicked
        System.out.println("enter");
    }//GEN-LAST:event_lblCreateAccountMouseClicked

    private void lblForgotAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotAccountMouseClicked
        System.out.println("enter");
    }//GEN-LAST:event_lblForgotAccountMouseClicked

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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblForgotAccount;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField pwfAccountPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

    public JTextField getTfUsername() {
        return tfUsername;
    }

    public JPasswordField getPwfAccountPassword() {
        return pwfAccountPassword;
    }

}

package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.action.ActionHandler;
import view.action.LoginViewAction;

/**
 *
 * @author Lezned
 */
public class LoginView extends View {

    private ActionHandler handler;

    public LoginView() {
        initComponents();

        tfUsername.setForeground(Color.LIGHT_GRAY);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Logo icon.png")));
        setPositionOnScreen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblError1 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        pwfAccountPassword = new javax.swing.JPasswordField();
        btnEye = new javax.swing.JLabel();
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
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 120));

        lblError1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblError1.setForeground(new java.awt.Color(255, 255, 255));
        lblError1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError1.setText("!");
        getContentPane().add(lblError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 20, 40));

        tfUsername.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(153, 153, 153));
        tfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsername.setText("Enter username");
        tfUsername.setBorder(null);
        tfUsername.setOpaque(false);
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, -1));

        lblError.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("!");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 20, 40));

        pwfAccountPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfAccountPassword.setToolTipText("");
        pwfAccountPassword.setBorder(null);
        pwfAccountPassword.setOpaque(false);
        getContentPane().add(pwfAccountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 260, 30));

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
        lblForgotAccount.setText("Forgot Password?");
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
        LoginViewAction action = (LoginViewAction) handler;

        if (action.checkFieldText()) {
            action.loginPressAction();
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMousePressed
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide eye.png")));

        pwfAccountPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_btnEyeMousePressed

    private void btnEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMouseReleased
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open eye.png"))); // NOI18N

        pwfAccountPassword.setEchoChar('•');
    }//GEN-LAST:event_btnEyeMouseReleased

    private void lblCreateAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccountMouseEntered
        lblCreateAccount.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_lblCreateAccountMouseEntered

    private void lblCreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccountMouseExited
        lblCreateAccount.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCreateAccountMouseExited

    private void lblForgotAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotAccountMouseEntered
        lblForgotAccount.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_lblForgotAccountMouseEntered

    private void lblForgotAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotAccountMouseExited
        lblForgotAccount.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblForgotAccountMouseExited

    private void lblCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccountMouseClicked
        LoginViewAction action = (LoginViewAction) handler;
        action.changeView(action.ADD_ACCOUNT);
    }//GEN-LAST:event_lblCreateAccountMouseClicked

    private void lblForgotAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotAccountMouseClicked
        LoginViewAction action = (LoginViewAction) handler;
        action.changeView(action.CHANGE_PASSWORD);
    }//GEN-LAST:event_lblForgotAccountMouseClicked

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        if (tfUsername.getText().equals("Enter username")) {
            tfUsername.setText("");
        }

        tfUsername.setForeground(Color.BLACK);
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        LoginViewAction action = (LoginViewAction) handler;
        action.defaultText();
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEye;
    private javax.swing.JButton btnLogin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblError1;
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

    public void setPwfAccountPassword(String passwordText) {
        this.pwfAccountPassword.setText(passwordText);
    }

    public void setTfUsername(String username) {
        this.tfUsername.setText(username);
    }

    public JLabel getLblError() {
        return lblError;
    }

    public void setLblError(JLabel lblError) {
        this.lblError = lblError;
    }

    public JLabel getLblError1() {
        return lblError1;
    }

    public void setLblError1(JLabel lblError1) {
        this.lblError1 = lblError1;
    }

}

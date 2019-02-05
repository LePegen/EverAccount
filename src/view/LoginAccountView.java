package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.action.ActionHandler;
import view.action.LoginAccountViewAction;
import view.action.LoginViewAction;

/**
 *
 * @author Gene Garcia
 */
public class LoginAccountView extends View {

    private ActionHandler handler;

    public LoginAccountView() {
        initComponents();

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Logo icon.png")));
        setPositionOnScreen();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEye = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        pwfOldAccountPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        pwfNewPassword = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        pwfVerificationPassword = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        lblVerificationPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblOldPassword = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Everaccount - Register and Modify");
        setMinimumSize(new java.awt.Dimension(500, 380));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 40, 30));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 120));

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
        getContentPane().add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 340, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 340, 20));

        pwfOldAccountPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfOldAccountPassword.setBorder(null);
        pwfOldAccountPassword.setOpaque(false);
        getContentPane().add(pwfOldAccountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 230, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 230, 20));

        btnExit.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 60, 40));

        btnChangePass.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnChangePass.setText("Change Password");
        btnChangePass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 240, 40));

        btnCreateAccount.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 240, 40));

        pwfNewPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfNewPassword.setBorder(null);
        pwfNewPassword.setOpaque(false);
        getContentPane().add(pwfNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 230, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 230, 20));

        pwfVerificationPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfVerificationPassword.setBorder(null);
        pwfVerificationPassword.setOpaque(false);
        getContentPane().add(pwfVerificationPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 230, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 230, 20));

        lblVerificationPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblVerificationPassword.setText("Verfify password");
        getContentPane().add(lblVerificationPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 30));

        lblNewPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblNewPassword.setText("New Password");
        getContentPane().add(lblNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 30));

        lblOldPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblOldPassword.setText("Old password");
        getContentPane().add(lblOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMousePressed
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide eye.png"))); // NOI18N

        pwfOldAccountPassword.setEchoChar((char) 0);
        pwfNewPassword.setEchoChar((char) 0);
        pwfVerificationPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_btnEyeMousePressed

    private void btnEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMouseReleased
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open eye.png"))); // NOI18N

        pwfOldAccountPassword.setEchoChar('•');
        pwfNewPassword.setEchoChar('•');
        pwfVerificationPassword.setEchoChar('•');
    }//GEN-LAST:event_btnEyeMouseReleased

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        LoginAccountViewAction loginHandler = (LoginAccountViewAction) handler;

        if (loginHandler.checkFieldText()) {
            loginHandler.btnAction(loginHandler.ADD_ACCOUNT);
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        LoginAccountViewAction loginHandler = (LoginAccountViewAction) handler;

        if (loginHandler.checkFieldText()) {
            loginHandler.btnAction(loginHandler.CHANGE_PASSWORD);
        }

    }//GEN-LAST:event_btnChangePassActionPerformed

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        if (tfUsername.getText().equals("Enter username")) {
            tfUsername.setText("");
        }

        tfUsername.setForeground(Color.BLACK);
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        LoginAccountViewAction loginHandler = (LoginAccountViewAction) handler;
        loginHandler.defaultText();
        loginHandler.returnAction("login");
    }//GEN-LAST:event_btnExitActionPerformed

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel btnEye;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblVerificationPassword;
    private javax.swing.JPasswordField pwfNewPassword;
    private javax.swing.JPasswordField pwfOldAccountPassword;
    private javax.swing.JPasswordField pwfVerificationPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnChangePass() {
        return btnChangePass;
    }

    public void setBtnChangePass(JButton btnChangePass) {
        this.btnChangePass = btnChangePass;
    }

    public JButton getBtnCreateAccount() {
        return btnCreateAccount;
    }

    public void setBtnCreateAccount(JButton btnCreateAccount) {
        this.btnCreateAccount = btnCreateAccount;
    }

    public JTextField getTfUsername() {
        return tfUsername;
    }

    public void setTfUsername(String username) {
        this.tfUsername.setText(username);
    }

    public JPasswordField getPwfNewPassword() {
        return pwfNewPassword;
    }

    public void setPwfNewPassword(String password) {
        this.pwfNewPassword.setText(password);
    }

    public JPasswordField getPwfOldAccountPassword() {
        return pwfOldAccountPassword;
    }

    public void setPwfOldAccountPassword(String password) {
        this.pwfOldAccountPassword.setText(password);
    }

    public JPasswordField getPwfVerificationPassword() {
        return pwfVerificationPassword;
    }

    public void setPwfVerificationPassword(String password) {
        this.pwfVerificationPassword.setText(password);
    }

}

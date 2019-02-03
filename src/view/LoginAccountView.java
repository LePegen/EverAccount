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
public class LoginAccountView extends View {

    private ActionHandler handler;

    public LoginAccountView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwfAccountPassword = new javax.swing.JPasswordField();
        btnEye = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCreateAccount = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Everaccount - Register and Modify");
        setMinimumSize(new java.awt.Dimension(500, 430));
        setPreferredSize(new java.awt.Dimension(500, 430));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pwfAccountPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfAccountPassword.setText("12345");
        pwfAccountPassword.setBorder(null);
        pwfAccountPassword.setEchoChar('\u2022');
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

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 120));

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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 260, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 260, 20));

        btnCreateAccount.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateAccount.setEnabled(false);
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 240, -1));

        btnChangePass.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnChangePass.setText("Change Password");
        btnChangePass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangePass.setEnabled(false);
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 240, -1));

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        if(tfUsername.getText().equals("Enter username")){
            tfUsername.setText("");
        }
        
        tfUsername.setForeground(Color.BLACK);
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        LoginViewAction loginHandler = (LoginViewAction) handler;
        loginHandler.btnAction(loginHandler.ADD_ACCOUNT);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        LoginViewAction loginHandler = (LoginViewAction) handler;
        loginHandler.btnAction(loginHandler.CHANGE_PASSWORD);
    }//GEN-LAST:event_btnChangePassActionPerformed

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel btnEye;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField pwfAccountPassword;
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

    public JPasswordField getPwfAccountPassword() {
        return pwfAccountPassword;
    }

    public void setPwfAccountPassword(JPasswordField pwfAccountPassword) {
        this.pwfAccountPassword = pwfAccountPassword;
    }

    public JTextField getTfUsername() {
        return tfUsername;
    }

    public void setTfUsername(JTextField tfUsername) {
        this.tfUsername = tfUsername;
    }

    

}

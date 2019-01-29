package view;

import javax.swing.JPasswordField;
import view.action.ActionHandler;

/**
 *
 * @author Gene Garcia
 */
public class LoginView  extends javax.swing.JFrame implements View{

    private ActionHandler handler;
    
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
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 120));

        lblAccountUsername.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lblAccountUsername.setText("Account Username");
        getContentPane().add(lblAccountUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        btnEye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open eye.png"))); // NOI18N
        getContentPane().add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 40, 30));

        pwfAccountPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfAccountPassword.setText("jPasswordField1");
        pwfAccountPassword.setEchoChar('\u2022');
        getContentPane().add(pwfAccountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 260, 30));

        btnLogin.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 240, -1));

        lblBackground.setBackground(new java.awt.Color(245, 245, 245));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPasswordField getPwfPassword(){
        return pwfAccountPassword;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEye;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblAccountUsername;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField pwfAccountPassword;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }
    
}

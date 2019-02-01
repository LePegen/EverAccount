package view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.action.ActionHandler;
import view.action.LoginViewAction;

/**
 *
 * @author Gene Garcia
 */
public class LoginView  extends View{

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
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 120));

        tfUsername.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        tfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsername.setText("Mukuro");
        getContentPane().add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, -1));

        btnEye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open eye.png"))); // NOI18N
        getContentPane().add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 40, 30));

        pwfAccountPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwfAccountPassword.setText("abc");
        pwfAccountPassword.setEchoChar('\u2022');
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

        lblBackground.setBackground(new java.awt.Color(245, 245, 245));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginViewAction loginHandler=(LoginViewAction) handler;
        loginHandler.loginPressAction();
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
    private javax.swing.JLabel lblBackground;
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

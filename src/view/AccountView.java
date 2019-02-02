package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.action.AccountViewAction;
import view.action.ActionHandler;

/**
 *
 * @author Gene Garcia
 */
public class AccountView extends View {

    //to do: change all labels to text field
    private ActionHandler handler;

    public AccountView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanner = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        lblFooter = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        pnlData = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtAdditionalInformation = new javax.swing.JTextField();
        pwfPassword = new javax.swing.JPasswordField();
        txtProvider = new javax.swing.JTextField();
        txtUniqueName = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Banner draft 3.png"))); // NOI18N
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 810, 100));

        pnlFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFooter.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        lblFooter.setText("F O O T E R | C R E D I T S");
        pnlFooter.add(lblFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 800, 80));

        pnlButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlButtons.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 15, -1, -1));

        btnLogout.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        pnlButtons.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        btnAdd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlButtons.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 15, -1, -1));

        btnModify.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        pnlButtons.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 15, -1, -1));

        getContentPane().add(pnlButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 800, 60));

        pnlData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtEmail.setText("E M A I L");
        pnlData.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 60));

        txtUsername.setEditable(false);
        txtUsername.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtUsername.setText("U S E R N A M E");
        pnlData.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 350, 60));

        txtAdditionalInformation.setEditable(false);
        txtAdditionalInformation.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtAdditionalInformation.setText("A D D I T I O N A L I N F O");
        pnlData.add(txtAdditionalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 105, 350, 60));

        pwfPassword.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        pwfPassword.setText("password");
        pwfPassword.setEchoChar('\u2022');
        pnlData.add(pwfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 350, 60));

        getContentPane().add(pnlData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 800, 180));

        txtProvider.setEditable(false);
        txtProvider.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        txtProvider.setText("P R O V I D E R");
        getContentPane().add(txtProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 300, 50));

        txtUniqueName.setEditable(false);
        txtUniqueName.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        txtUniqueName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUniqueName.setText("U N I Q U E N A M E");
        getContentPane().add(txtUniqueName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 390, 50));

        lblBackground.setBackground(new java.awt.Color(245, 245, 245));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        AccountViewAction action = (AccountViewAction) handler;

        action.saveAction();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        txtProvider.setEditable(true);
        txtUniqueName.setEditable(true);
        txtEmail.setEditable(true);
        txtUsername.setEditable(true);
        pwfPassword.setEditable(true);
        txtAdditionalInformation.setEditable(true);

        txtProvider.setText("");
        txtUniqueName.setText("");
        txtEmail.setText("");
        txtUsername.setText("");
        pwfPassword.setText("");
        txtAdditionalInformation.setText("");
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AccountViewAction action = (AccountViewAction) handler;

        action.addAction();

    }//GEN-LAST:event_btnAddActionPerformed

    public JPasswordField getPwfPassword() {
        return pwfPassword;
    }

    public void setPwfPassword(String password) {
        this.pwfPassword.setText(password);
    }

    public JTextField getTxtAdditionalInformation() {
        return txtAdditionalInformation;
    }

    public void setTxtAdditionalInformation(String additionalInfo) {
        this.txtAdditionalInformation.setText(additionalInfo);
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String email) {
        this.txtEmail.setText(email);
    }

    public JTextField getTxtProvider() {
        return txtProvider;
    }

    public void setTxtProvider(String provider) {
        this.txtProvider.setText(provider);
    }

    public JTextField getTxtUniqueName() {
        return txtUniqueName;
    }

    public void setTxtUniqueName(String uniqueName) {
        this.txtUniqueName.setText(uniqueName);
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(String username) {
        this.txtUsername.setText(username);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JTextField txtAdditionalInformation;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtProvider;
    private javax.swing.JTextField txtUniqueName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

}

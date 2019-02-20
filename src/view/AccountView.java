package view;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.action.AccountAction;
import view.action.ActionHandler;

/**
 *
 * @author Lezned
 */
public class AccountView extends View {

    private ActionHandler handler;

    public AccountView() {
        initComponents();
         
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Logo icon.png")));
        this.setSize(800, 650);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanner = new javax.swing.JLabel();
        pnlInfo = new javax.swing.JPanel();
        lblProvider = new javax.swing.JLabel();
        txtProvider = new javax.swing.JTextField();
        lblUniqueName = new javax.swing.JLabel();
        txtUniqueName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pwfPassword = new javax.swing.JPasswordField();
        btnEye = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        pnlAdditionalInfo = new javax.swing.JPanel();
        lblAdditionalInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdditionalInformation = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Everaccount - Account Display");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(950, 710));
        setPreferredSize(new java.awt.Dimension(950, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(950, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Banner draft 3.png"))); // NOI18N
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 850, 100));

        pnlInfo.setBackground(new java.awt.Color(248, 248, 248));
        pnlInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProvider.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblProvider.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProvider.setText("Provider");
        lblProvider.setFocusable(false);
        pnlInfo.add(lblProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, 50));

        txtProvider.setBackground(new java.awt.Color(248, 248, 248));
        txtProvider.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtProvider.setText("P R O V I D E R");
        txtProvider.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnlInfo.add(txtProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 320, 30));

        lblUniqueName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblUniqueName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUniqueName.setText("Account Identifier");
        lblUniqueName.setFocusable(false);
        pnlInfo.add(lblUniqueName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, 50));

        txtUniqueName.setBackground(new java.awt.Color(248, 248, 248));
        txtUniqueName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtUniqueName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUniqueName.setText("U N I Q U E N A M E");
        txtUniqueName.setToolTipText("Enter a unique name that could easily remind you of the type of acount as this name will be the identifier of your account.");
        txtUniqueName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        txtUniqueName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueNameActionPerformed(evt);
            }
        });
        pnlInfo.add(txtUniqueName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 320, 40));

        lblEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email");
        pnlInfo.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 80, 50));

        txtEmail.setBackground(new java.awt.Color(248, 248, 248));
        txtEmail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEmail.setText("E M A I L");
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnlInfo.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 320, 30));

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username");
        pnlInfo.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, 50));

        txtUsername.setBackground(new java.awt.Color(248, 248, 248));
        txtUsername.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtUsername.setText("U S E R N A M E");
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnlInfo.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 320, 30));

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password");
        pnlInfo.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 80, 50));

        pwfPassword.setBackground(new java.awt.Color(248, 248, 248));
        pwfPassword.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pwfPassword.setText("password");
        pwfPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pnlInfo.add(pwfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 290, 30));

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
        pnlInfo.add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        pnlInfo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 320, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 20));
        pnlInfo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 320, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 20));
        pnlInfo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 320, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setPreferredSize(new java.awt.Dimension(50, 20));
        pnlInfo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 320, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setPreferredSize(new java.awt.Dimension(50, 20));
        pnlInfo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 320, 20));

        getContentPane().add(pnlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 570, 370));

        pnlAdditionalInfo.setBackground(new java.awt.Color(248, 248, 248));
        pnlAdditionalInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlAdditionalInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdditionalInfo.setBackground(new java.awt.Color(248, 248, 248));
        lblAdditionalInfo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblAdditionalInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAdditionalInfo.setText("Additional Information");
        pnlAdditionalInfo.add(lblAdditionalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, -1));

        txtAdditionalInformation.setColumns(20);
        txtAdditionalInformation.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAdditionalInformation.setRows(5);
        txtAdditionalInformation.setText("A D D I T I O N A L I N F O");
        txtAdditionalInformation.setToolTipText("");
        txtAdditionalInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane1.setViewportView(txtAdditionalInformation);

        pnlAdditionalInfo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 230));

        getContentPane().add(pnlAdditionalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 330, 290));

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 8));

        btnAdd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("To enable the 'add' button, please toggle the 'clear' button please.");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);

        btnSave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("The changes made with the current account will be saved and recorded.");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);

        btnClear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("All input fields will be cleared.");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Current account will be permanently deleted.");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        btnReturn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.setToolTipText("Will go back to the overview form.");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 860, 50));

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        AccountAction action = (AccountAction) handler;

        if (action.checkFields()) {
            action.saveAction();
        } else {
            JOptionPane.showMessageDialog(null, "Do not forget to add value for the 'unique name'.");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AccountAction action = (AccountAction) handler;

        if (action.checkFields()) {
            action.addAction();
        } else {
            JOptionPane.showMessageDialog(null, "Do not forget to add value for the 'unique name'.");
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        AccountAction action = (AccountAction) handler;
        action.deleteAction();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        clear();
        AccountAction action = (AccountAction) handler;
        action.returnAction();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMousePressed
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hide eye.png"))); // NOI18N

        pwfPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_btnEyeMousePressed

    private void btnEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMouseReleased
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open eye.png"))); // NOI18N

        pwfPassword.setEchoChar('•');
    }//GEN-LAST:event_btnEyeMouseReleased

    private void txtUniqueNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueNameActionPerformed

    public void clear() {
        btnAdd.setEnabled(true);
        btnSave.setEnabled(false);
        btnDelete.setEnabled(true);

        txtProvider.setText("");
        txtUniqueName.setText("");
        txtEmail.setText("");
        txtUsername.setText("");
        pwfPassword.setText("");
        txtAdditionalInformation.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnEye;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAdditionalInfo;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProvider;
    private javax.swing.JLabel lblUniqueName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlAdditionalInfo;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JTextArea txtAdditionalInformation;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtProvider;
    private javax.swing.JTextField txtUniqueName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

    public JPasswordField getPwfPassword() {
        return pwfPassword;
    }

    public void setPwfPassword(String password) {
        this.pwfPassword.setText(password);
    }

    public JTextArea getTxtAdditionalInformation() {
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

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

}

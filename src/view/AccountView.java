package view;

/**
 *
 * @author Gene Garcia
 */
public class AccountView extends javax.swing.JFrame {

    public AccountView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanner = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        pnlData = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAdditionalInformation = new javax.swing.JLabel();
        lblProvider = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Banner draft 3.png"))); // NOI18N
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 820, -1));

        pnlFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel1.setText("F O O T E R | C R E D I T S");
        pnlFooter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 800, 80));

        pnlButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSave.setText("Save");
        pnlButtons.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 15, -1, -1));

        btnReturn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnReturn.setText("Return");
        pnlButtons.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        btnAdd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        pnlButtons.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 15, -1, -1));

        btnModify.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnModify.setText("Modify");
        pnlButtons.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 15, -1, -1));

        getContentPane().add(pnlButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 800, 60));

        pnlData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Meiryo", 0, 18)); // NOI18N
        lblUsername.setText("U S E R N A M E");
        lblUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlData.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 350, 60));

        lblEmail.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        lblEmail.setText("E M A I L");
        lblEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlData.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 350, 60));

        lblPassword.setFont(new java.awt.Font("Meiryo", 0, 18)); // NOI18N
        lblPassword.setText("• • • • • • • •");
        lblPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlData.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 350, 60));

        lblAdditionalInformation.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        lblAdditionalInformation.setText("additional information");
        lblAdditionalInformation.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAdditionalInformation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlData.add(lblAdditionalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 350, 60));

        getContentPane().add(pnlData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 800, 180));

        lblProvider.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        lblProvider.setText(" P R O V I  D E R ");
        getContentPane().add(lblProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdditionalInformation;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProvider;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlFooter;
    // End of variables declaration//GEN-END:variables
}

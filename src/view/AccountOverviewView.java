package view;

/**
 *
 * @author Gene Garcia
 */
public class AccountOverviewView extends javax.swing.JFrame {

    /**
     * Creates new form AccountOverviewView
     */
    public AccountOverviewView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanner = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlSearchBox1 = new javax.swing.JPanel();
        pnlHighlight = new javax.swing.JPanel();
        lblHighlight = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnHighlight3 = new javax.swing.JButton();
        btnHighlight4 = new javax.swing.JButton();
        btnHighlight1 = new javax.swing.JButton();
        btnHighlight2 = new javax.swing.JButton();
        pnlSearchBox = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Banner draft 3.png"))); // NOI18N
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 810, 100));

        pnlFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel1.setText("F O O T E R | C R E D I T S");
        pnlFooter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 800, 80));

        pnlSearchBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlSearchBox1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHighlight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlHighlight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHighlight.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblHighlight.setText("Highlight account");
        pnlHighlight.add(lblHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 220, 30));

        btnRefresh.setText("R");
        pnlHighlight.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 5, -1, 30));

        pnlSearchBox1.add(pnlHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 6, 420, 40));

        btnHighlight3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight3.setText("Facebook");
        pnlSearchBox1.add(btnHighlight3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 195, 180, 75));

        btnHighlight4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight4.setText("Steam");
        pnlSearchBox1.add(btnHighlight4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 180, 75));

        btnHighlight1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight1.setText("Yahoo");
        pnlSearchBox1.add(btnHighlight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 80, 180, 75));

        btnHighlight2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight2.setText("Gmail");
        pnlSearchBox1.add(btnHighlight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 180, 75));

        getContentPane().add(pnlSearchBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 440, 300));

        pnlSearchBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlSearchBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txtSearch.setText("Enter username, email or host.");
        pnlSearchBox.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 230, 30));

        btnSearch.setText("s");
        pnlSearchBox.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 15, 30, 30));

        lblMessage.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setText("Simple Message");
        pnlSearchBox.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 190));

        getContentPane().add(pnlSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 290, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountOverviewView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHighlight1;
    private javax.swing.JButton btnHighlight2;
    private javax.swing.JButton btnHighlight3;
    private javax.swing.JButton btnHighlight4;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblHighlight;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHighlight;
    private javax.swing.JPanel pnlSearchBox;
    private javax.swing.JPanel pnlSearchBox1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}

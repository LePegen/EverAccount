package view;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import view.action.ActionHandler;

/**
 *
 * @author Gene Garcia
 */
public class AccountOverviewView extends View {

    /**
     * Creates new form AccountOverviewView
     */
    
    private ActionHandler handler;
    private HashMap<JButton,Integer> buttonValues;
    private ArrayList<JButton> buttons;
    public AccountOverviewView() {
        initComponents();
        buttons.add(btnHighlight1);
        buttons.add(btnHighlight2);
        buttons.add(btnHighlight3);
        buttons.add(btnHighlight4);

    }
    /**
     * This method is used to set the values of the buttons. 
     * From an account the user passes in the id of the account and the unique name of the account
     * The id is mapped to the button and button's test is set to the unique name 
     * 
     * @see model.AccountModel
     * @param accountID ID of the account from the model
     * @param buttonText Text of the button. Unique name
     */
    public void setButton(ArrayList<Integer> accountID,ArrayList<String> buttonText){
        buttonValues.clear();
        for (int i = 0; i < accountID.size(); i++) {
            buttonValues.put(buttons.get(i), accountID.get(i));
            buttons.get(i).setText(buttonText.get(i));
        }
    }
    
    
    public int action(JButton button){
        return buttonValues.get(button);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jListChoiceDisplay = new javax.swing.JList<>();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
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
        pnlHighlight.add(lblHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 30));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        pnlHighlight.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 6, 40, 40));

        pnlSearchBox1.add(pnlHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 6, 420, 50));

        btnHighlight3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight3.setText("Facebook");
        pnlSearchBox1.add(btnHighlight3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 195, 180, 75));

        btnHighlight4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight4.setText("Steam");
        pnlSearchBox1.add(btnHighlight4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 180, 75));

        btnHighlight1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight1.setText("Yahoo unique name");
        btnHighlight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighlight1ActionPerformed(evt);
            }
        });
        pnlSearchBox1.add(btnHighlight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 80, 180, 75));

        btnHighlight2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        btnHighlight2.setText("Gmail");
        pnlSearchBox1.add(btnHighlight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 180, 75));

        getContentPane().add(pnlSearchBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 440, 300));

        pnlSearchBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlSearchBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txtSearch.setText("Enter the unique name of your account");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        pnlSearchBox.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 230, 40));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        pnlSearchBox.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 10, 40, 39));

        jListChoiceDisplay.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jListChoiceDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListChoiceDisplay);

        pnlSearchBox.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, 190));

        getContentPane().add(pnlSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 300, 300));

        lblBackground.setBackground(new java.awt.Color(245, 245, 245));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnHighlight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighlight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHighlight1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHighlight1;
    private javax.swing.JButton btnHighlight2;
    private javax.swing.JButton btnHighlight3;
    private javax.swing.JButton btnHighlight4;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListChoiceDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblHighlight;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHighlight;
    private javax.swing.JPanel pnlSearchBox;
    private javax.swing.JPanel pnlSearchBox1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

}

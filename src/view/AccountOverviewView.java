 package view;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import view.action.AccountOverviewAction;
import view.action.ActionHandler;

/**
 *
 * @author Lezned
 */
public class AccountOverviewView extends View {

    private ActionHandler handler;
    private HashMap<Object, Integer> components;

    public AccountOverviewView() {
        initComponents();
        initArrayListsAndHashMap();

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Logo icon.png")));
        setPositionOnScreen();

    }

    public void initArrayListsAndHashMap() {
        components = new HashMap<>();
    }

    public void setAccountList(ArrayList<Integer> accountID, ArrayList<String> itemText) {
        DefaultListModel listModel = new DefaultListModel();

        //will add the itemText to the JList in this view
        for (int i = 0; i < itemText.size(); i++) {
            listModel.add(i, itemText.get(i));
        }

        //treats per line as an object. Gets it and adds it to components with the account id
        for (int i = 0; i < listModel.size(); i++) {
            components.putIfAbsent(listModel.getElementAt(i), accountID.get(i));
        }
        jlAccountItems.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanner = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        lblFooter = new javax.swing.JLabel();
        pnlSearchBox = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlAccountItems = new javax.swing.JList<>();
        pnlButton = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Everaccount - Overview");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(840, 870));
        setPreferredSize(new java.awt.Dimension(840, 910));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Banner draft 3.png"))); // NOI18N
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 25, 810, 100));

        pnlFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFooter.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        lblFooter.setText("F O O T E R | C R E D I T S");
        pnlFooter.add(lblFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, 740, 80));

        pnlSearchBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlSearchBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnSearch.setToolTipText("Search button. Choose 1 account before toggling the search button.");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pnlSearchBox.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 40, 40));

        jlAccountItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlAccountItems.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jlAccountItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlAccountItems.setToolTipText("This will show your accounts' unique name. Contains all your available accounts. Please choose 1 and then click the search button. ");
        jlAccountItems.setName("jlChoices"); // NOI18N
        jScrollPane1.setViewportView(jlAccountItems);

        pnlSearchBox.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 520, 430));

        getContentPane().add(pnlSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 540, 500));

        pnlButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnCreate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        pnlButton.add(btnCreate);

        btnLogout.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pnlButton.add(btnLogout);

        getContentPane().add(pnlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 685, 540, 50));

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        AccountOverviewAction action = (AccountOverviewAction) handler;
        action.createAccount();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        AccountOverviewAction action = (AccountOverviewAction) handler;

        if (!jlAccountItems.isSelectionEmpty()) {

            DefaultListModel listModel = (DefaultListModel) jlAccountItems.getModel();
            int index = jlAccountItems.getSelectedIndex();

            Object item = listModel.get(index);

            int id = action.selectedAccount(item, components); //gets the selected item from JList and returns the id
            action.passSelectedAccount(id); //displays the accountview with the passed value of ID   
        } else {
            JOptionPane.showMessageDialog(null, "Please select an account or create one. To create please toggle the create button.", "Everaccount", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        AccountOverviewAction action = (AccountOverviewAction) handler;
        action.returnAction("login");
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlAccountItems;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlSearchBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

}

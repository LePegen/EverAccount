package view;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ListModel;
import view.action.AccountOverviewAction;
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
    private HashMap<Object, Integer> components;
    private ArrayList<JButton> buttons;
    private ArrayList<Object> items;

    public AccountOverviewView() {
        initComponents();
        initArrayLists();
                components=new HashMap<>();
        buttons.add(btnHighlight1);
        buttons.add(btnHighlight2);
        buttons.add(btnHighlight3);
        buttons.add(btnHighlight4);
        
    }
    
    public void initArrayLists(){
        buttons = new ArrayList<>();
        items = new ArrayList<>();
    }

    /**
     * This method is used to set the values of the buttons. From an account the
     * user passes in the id of the account and the unique name of the account
     * The id is mapped to the button and button's test is set to the unique
     * name
     *
     * @see model.AccountModel
     * @param accountID ID of the account from the model
     * @param itemText Text of the button. Unique name
     */
    public void setFeaturedButtons(ArrayList<Integer> accountID, ArrayList<String> itemText) {
        for (int i = 0; i < accountID.size(); i++) {
            components.putIfAbsent(buttons.get(i), accountID.get(i));
            buttons.get(i).setText(itemText.get(i));
        }
    }
    
    public void setAccountList(ArrayList<Integer> accountID, ArrayList<String> itemText){
        DefaultListModel listModel = new DefaultListModel();
        
        //will add the itemText to the JList in this view
        for (int i = 0; i < itemText.size(); i++) {
            listModel.add(i, itemText.get(i));
            System.out.println(itemText.get(i));
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
        pnlSearchBox1 = new javax.swing.JPanel();
        btnHighlight3 = new javax.swing.JButton();
        btnHighlight4 = new javax.swing.JButton();
        btnHighlight1 = new javax.swing.JButton();
        btnHighlight2 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        pnlSearchBox = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlAccountItems = new javax.swing.JList<>();

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
        pnlFooter.add(lblFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 770, 800, 80));

        pnlSearchBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlSearchBox1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHighlight3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnHighlight3.setText("Facebook");
        btnHighlight3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighlight3ActionPerformed(evt);
            }
        });
        pnlSearchBox1.add(btnHighlight3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 40));

        btnHighlight4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnHighlight4.setText("Steam");
        btnHighlight4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighlight4ActionPerformed(evt);
            }
        });
        pnlSearchBox1.add(btnHighlight4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 40));

        btnHighlight1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnHighlight1.setText("Yahoo unique name");
        btnHighlight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighlight1ActionPerformed(evt);
            }
        });
        pnlSearchBox1.add(btnHighlight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 40));

        btnHighlight2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnHighlight2.setText("Gmail");
        btnHighlight2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighlight2ActionPerformed(evt);
            }
        });
        pnlSearchBox1.add(btnHighlight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 40));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        pnlSearchBox1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, -1));

        getContentPane().add(pnlSearchBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 230, 450));

        pnlSearchBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlSearchBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        pnlSearchBox.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 60, 410));

        jlAccountItems.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jlAccountItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlAccountItems.setName("jlChoices"); // NOI18N
        jlAccountItems.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlAccountItemsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlAccountItems);

        pnlSearchBox.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 410));

        getContentPane().add(pnlSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 670, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHighlight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighlight1ActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        ((AccountOverviewAction) handler).selectedAccount((JButton) source, components);
    }//GEN-LAST:event_btnHighlight1ActionPerformed

    private void btnHighlight3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighlight3ActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        ((AccountOverviewAction) handler).selectedAccount((JButton) source, components);
    }//GEN-LAST:event_btnHighlight3ActionPerformed

    private void btnHighlight2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighlight2ActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        ((AccountOverviewAction) handler).selectedAccount((JButton) source, components);
    }//GEN-LAST:event_btnHighlight2ActionPerformed

    private void btnHighlight4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighlight4ActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        ((AccountOverviewAction) handler).selectedAccount((JButton) source, components);
    }//GEN-LAST:event_btnHighlight4ActionPerformed

    private void jlAccountItemsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlAccountItemsValueChanged
        DefaultListModel listModel = (DefaultListModel) jlAccountItems.getModel();
        int index=jlAccountItems.getSelectedIndex();
        Object item=listModel.get(index);
        ((AccountOverviewAction) handler).selectedAccount(item, components);    
        jlAccountItems.clearSelection();
    }//GEN-LAST:event_jlAccountItemsValueChanged

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHighlight1;
    private javax.swing.JButton btnHighlight2;
    private javax.swing.JButton btnHighlight3;
    private javax.swing.JButton btnHighlight4;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlAccountItems;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlSearchBox;
    private javax.swing.JPanel pnlSearchBox1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

}

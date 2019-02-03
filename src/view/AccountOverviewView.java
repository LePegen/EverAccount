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
    
    public AccountOverviewView() {
        initComponents();
        initArrayListsAndHashMap();

    }

    public void initArrayListsAndHashMap() {
        components = new HashMap<>();
    }

    public void setAccountList(ArrayList<Integer> accountID, ArrayList<String> itemText) {
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
        pnlFooter.add(lblFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 770, 740, 80));

        pnlSearchBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlSearchBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnSearch.setToolTipText("Search button. Choose 1 account before toggling the search button.");
        pnlSearchBox.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 12, 50, 50));

        jlAccountItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlAccountItems.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jlAccountItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlAccountItems.setToolTipText("Contains all your available accounts. Please choose 1 and then click the search button.");
        jlAccountItems.setName("jlChoices"); // NOI18N
        jlAccountItems.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlAccountItemsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlAccountItems);

        pnlSearchBox.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 390, 450));

        getContentPane().add(pnlSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 810, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlAccountItemsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlAccountItemsValueChanged
        DefaultListModel listModel = (DefaultListModel) jlAccountItems.getModel();
        int index = jlAccountItems.getSelectedIndex();
        Object item = listModel.get(index);
        ((AccountOverviewAction) handler).selectedAccount(item, components);
        //jlAccountItems.clearSelection();
    }//GEN-LAST:event_jlAccountItemsValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlAccountItems;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblFooter;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlSearchBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

}

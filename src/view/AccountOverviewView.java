package view;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import view.action.AccountOverviewAction;
import view.action.ActionHandler;
import view.action.LoginViewAction;

/**
 *
 * @author Lezned
 */
public class AccountOverviewView extends View {

    private ActionHandler handler;
    private HashMap<Object, Integer> components;
    private AccountOverviewItemListView itemView;
    public AccountOverviewView() {
        initComponents();
        initArrayListsAndHashMap();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Logo icon.png")));
        AccountOverviewAction action = (AccountOverviewAction) handler;
        itemView=new AccountOverviewItemListView() {
            @Override
            public void itemClicked(int id, String name) {
                listAction(id);
            }
        };
        this.pnlSearchBox.add(itemView);
        this.setSize(800, 650);
        btnCreate.setOpaque(false);
        btnCreate.setBorderPainted(false);
    }

    public void initArrayListsAndHashMap() {
        components = new HashMap<>();
    }

    public void setAccountList(ArrayList<Integer> accountID, ArrayList<String> itemText) {
        itemView.removeAll();
        //will add the itemText to the JList in this view
        for (int i = 0; i < itemText.size(); i++) {
            itemView.addItem(accountID.get(i), itemText.get(i));
        }
    }
    
    
    public void listAction(int id){
        AccountOverviewAction action = (AccountOverviewAction) handler;
        action.passSelectedAccount(id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        pnlSearchBox = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Everaccount - Overview");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(840, 870));
        setPreferredSize(new java.awt.Dimension(840, 910));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportView(pnlSearchBox);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 580, 440));

        btnCreate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCreate.setText("+");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Banner draft 3.png"))); // NOI18N
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, 80));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Hello");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, 30));

        btnLogout.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo small.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 230, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
            AccountOverviewAction action = (AccountOverviewAction) handler;
        action.createAccount();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        AccountOverviewAction action = (AccountOverviewAction) handler;
        action.returnAction("login");
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlSearchBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setHandler(ActionHandler action) {
        this.handler = action;
    }

}

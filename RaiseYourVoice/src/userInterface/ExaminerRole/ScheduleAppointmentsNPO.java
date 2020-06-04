/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ExaminerRole;

import Business.Application.Application;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LawyerOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Lawyer;
import Business.Role.Role;
import static Business.Role.Role.RoleType.Lawyer;
import Business.UserAccount.UserAccount;
//import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apurvasalvi
 */
public class ScheduleAppointmentsNPO extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleAppointmentsNPO
     */
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private Organization organization;
    private EcoSystem system;
    private Network network;
    private Enterprise enterprise;
    
    public ScheduleAppointmentsNPO(JPanel userProcessContainer, UserAccount useraccount, Organization organization, EcoSystem system, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.organization = organization;
        this.system = system;
        this.network = network;
        this.enterprise  = enterprise;
        refreshTable();
        populateLawyerComboBox();
    }
    
    private void populateLawyerComboBox(){
        lawyerComboBox.removeAllItems();
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(o instanceof LawyerOrganization) {
                for(UserAccount lawyer : o.getUserAccountDirectory().getUserAccountList()) {
                    lawyerComboBox.addItem(lawyer);
                }
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignlawyerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicationTbl = new javax.swing.JTable();
        lawyerComboBox = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        assignlawyerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignlawyerBtn.setText("Assign a Lawyer");
        assignlawyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignlawyerBtnActionPerformed(evt);
            }
        });

        applicationTbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        applicationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Lawyer Assigned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(applicationTbl);

        lawyerComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lawyerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Stencil", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("schedule Appointment");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.setVerifyInputWhenFocusTarget(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(lawyerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assignlawyerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignlawyerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lawyerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignlawyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignlawyerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = applicationTbl.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a Row");
        }
        else {
            Application application = (Application)applicationTbl.getValueAt(selectedRow, 0);
            application.setLawyer((UserAccount)lawyerComboBox.getSelectedItem());
            refreshTable();
        }  
    }//GEN-LAST:event_assignlawyerBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)this.userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshTable(){
        DefaultTableModel model = (DefaultTableModel) applicationTbl.getModel();
        model.setRowCount(0);
        for (Application app : organization.getApplicationDirectory().getApplicationList()){
            if(app.getStatus().equals("Application Approved")){
                
                Object[] row = new Object[3];
                row[0] = app;
                row[1] = app.getLname();
//                row[2] = String.valueOf(app.getNumber());
                if(app.getLawyer() != null) {
                    row[2] = app.getLawyer().toString();
                }
                else {
                    row[2] = "";
                }
                model.addRow(row);
            }  
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable applicationTbl;
    private javax.swing.JButton assignlawyerBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox lawyerComboBox;
    // End of variables declaration//GEN-END:variables
}
//public void refreshTable() {
//        int rowCount = supplierTable.getRowCount();
//        DefaultTableModel model = (DefaultTableModel)supplierTable.getModel();
//        for(int i = rowCount - 1; i >=0; i--) {
//            model.removeRow(i);
//        }
//        
//        for(Supplier s : supplierDirectory.getSupplierDict()) {
//            Object row[] = new Object[1];
//            row[0] = s;
//            model.addRow(row);
//        }
//    }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManageCustomers;

import Business.AirplaneCatalog;
import Business.CustomerCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Siddhi
 */
public class ManageCustomers extends javax.swing.JPanel {

    private JPanel userControlDisplayPanel;
    private CustomerCatalog cCatalog;
    private AirplaneCatalog aCatalog;
    //private AirlinerCatalog aCatalog;
    /**
     * Creates new form ManageCustomers
     */
    public ManageCustomers(JPanel userControlDisplayPanel, AirplaneCatalog aCatalog) {
    initComponents();
    this.userControlDisplayPanel=userControlDisplayPanel;
    this.aCatalog=aCatalog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageCust = new javax.swing.JLabel();
        btnBestFlights = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        lblManageCust.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblManageCust.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCust.setText("MANAGE CUSTOMERS");

        btnBestFlights.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBestFlights.setText("Search for Best Flights");
        btnBestFlights.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBestFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestFlightsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(lblManageCust))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnBestFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblManageCust)
                .addGap(18, 18, 18)
                .addComponent(btnBestFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBestFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestFlightsActionPerformed
        // TODO add your handling code here:
        BestFlights panel = new BestFlights (userControlDisplayPanel, aCatalog);
        userControlDisplayPanel.add("ManageAirliner",panel);
        CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
        layout.next(userControlDisplayPanel);
    }//GEN-LAST:event_btnBestFlightsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBestFlights;
    private javax.swing.JLabel lblManageCust;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.TravelAgency;

import Business.Airplane;
import Business.AirplaneCatalog;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhi
 */
public class SearchFlights extends javax.swing.JPanel {
private JPanel userControlDisplayPanel;
private AirplaneCatalog airplaneC;

    /**
     * Creates new form SearchFlights
     */
    public SearchFlights(JPanel userControlDisplayPanel,AirplaneCatalog airplaneC) {
        initComponents();
        this.userControlDisplayPanel=userControlDisplayPanel;
        this.airplaneC=airplaneC;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSource = new javax.swing.JLabel();
        lblDest = new javax.swing.JLabel();
        TextFieldSource = new javax.swing.JTextField();
        TextFieldDest = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageTravelAgency = new javax.swing.JTable();
        btnSearchFlightDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SEARCH FLIGHTS");

        lblSource.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSource.setText("Source:");

        lblDest.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDest.setText("Destination:");

        TextFieldSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSourceActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblManageTravelAgency.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblManageTravelAgency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Flight ID", "Flight Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageTravelAgency);

        btnSearchFlightDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchFlightDetails.setText("Search Flight Details");
        btnSearchFlightDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearchFlightDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(btnSearchFlightDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSource)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextFieldSource, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(lblDest))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldDest, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource)
                    .addComponent(lblDest)
                    .addComponent(TextFieldSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSearchFlightDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchFlightDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblManageTravelAgency.getSelectedRow();
      if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the data first","Warning!", JOptionPane.WARNING_MESSAGE);
        }
      else{
       Airplane airplane=(Airplane)tblManageTravelAgency.getValueAt(selectedRow, 0);
       FlightDetails panel=new FlightDetails(userControlDisplayPanel,airplane);
       userControlDisplayPanel.add("FlightDetails",panel);
       CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
       layout.next(userControlDisplayPanel);
    }
    
    }//GEN-LAST:event_btnSearchFlightDetailsActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    String s= TextFieldSource.getText();
    String d=TextFieldDest.getText();
    
    try{
    if(s.isEmpty() || d.isEmpty() || s.equals(" ") || s == null || d.equals(" ") || d == null )
    {
    
    JOptionPane.showMessageDialog(null, "Please enter data!!");
    return;
    
    }
    }catch(NullPointerException e)
    {
     
    JOptionPane.showMessageDialog(null, "Please enter data!!");
    return;
    
    }
    
    String a,b;
    
    
    DefaultTableModel dtm=(DefaultTableModel)tblManageTravelAgency.getModel();
    dtm.setNumRows(0);
    if((s!=null&& !s.isEmpty()) && (d!=null && !d.isEmpty())){
    for(Airplane vs:airplaneC.getAirlinerCatalog())
      
    {
        
        
    a=vs.getFromLocation();
    
    b=vs.getToLocation();
    
     if(s.equalsIgnoreCase(a)&& d.equalsIgnoreCase(b))
     {
    Object row[]=new Object[10];
    row[0]=vs;
    row[1]=vs.getAirlineID();
    row[2]=vs.getFlightNumber();
    
  
    
    dtm.addRow(row);
    
    }
     
    }
   
       
    
        
    }
     else{
        JOptionPane.showMessageDialog(null, "Please Enter a value !");
    }
    
    
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void TextFieldSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSourceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldDest;
    private javax.swing.JTextField TextFieldSource;
    private javax.swing.JButton btnSearchFlightDetails;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDest;
    private javax.swing.JLabel lblSource;
    private javax.swing.JTable tblManageTravelAgency;
    // End of variables declaration//GEN-END:variables


}


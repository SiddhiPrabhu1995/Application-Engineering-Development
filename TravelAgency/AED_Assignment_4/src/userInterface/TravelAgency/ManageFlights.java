/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.TravelAgency;

import Business.Airliner;
import Business.AirlinerCatalog;
import Business.Airplane;
import Business.AirplaneCatalog;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhi
 */
public class ManageFlights extends javax.swing.JPanel {
    private JPanel userControlDisplayPanel;
    private AirplaneCatalog airplaneC;
   private AirlinerCatalog aCatalog;
   private Airplane air;
   Object row[]= new Object[1];
            

    /**
     * Creates new form ManageFlights
     */
    public ManageFlights(JPanel userControlDisplayPanel, AirplaneCatalog airplaneC ) {
        initComponents();
        this.userControlDisplayPanel=userControlDisplayPanel;
        this.airplaneC=airplaneC;
        this.aCatalog=aCatalog;
        // populateTable();
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
        jLabel2 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManage = new javax.swing.JTable();
        btnCreateFlight = new javax.swing.JButton();
        btnViewFlight = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE FLIGHTS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Airliner Name:");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Emirates", "Qatar", "Etihad", "British Airways", "Lufthansa", "Singapore Airlines" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblManage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AirLiner", "Airline ID", "Flight Number", "Model Number", "Source", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManage);

        btnCreateFlight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateFlight.setText("Create Flight");
        btnCreateFlight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFlightActionPerformed(evt);
            }
        });

        btnViewFlight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewFlight.setText("View Flight");
        btnViewFlight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update Flight");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFlightActionPerformed
       // TODO add your handling code here:
      CreateFlights panel=new CreateFlights(userControlDisplayPanel,airplaneC);
     userControlDisplayPanel.add("CreateFlights",panel);
     CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
     layout.next(userControlDisplayPanel);
        
        
    }//GEN-LAST:event_btnCreateFlightActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String dataEntry= ComboBox.getSelectedItem().toString();
        if(dataEntry.equalsIgnoreCase("None")){
        DefaultTableModel dtm=(DefaultTableModel)tblManage.getModel();
        dtm.setNumRows(0);
        
        }
         
         if(dataEntry.equalsIgnoreCase("Emirates"))
        {
         String abc=String.valueOf(ComboBox.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblManage.getModel();
         dtm.setNumRows(0);
         
         for(Airplane vs:airplaneC.getAirlinerCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){  
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
 
           dtm.addRow(row);
    
          }   
         }
        }
         if(dataEntry.equalsIgnoreCase("Qatar"))
        {
         String abc=String.valueOf(ComboBox.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblManage.getModel();
         dtm.setNumRows(0);
    
         for(Airplane vs:airplaneC.getAirlinerCatalog())
      
         {
          bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
 
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
  
    
           dtm.addRow(row);
    
          }   }
        }
         
         
         if(dataEntry.equalsIgnoreCase("Etihad"))
        {String abc=String.valueOf(ComboBox.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblManage.getModel();
         dtm.setNumRows(0);
    
         for(Airplane vs:airplaneC.getAirlinerCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();

    
           dtm.addRow(row);
    
          } }  
        }
         if(dataEntry.equalsIgnoreCase("British Airways"))
        {String abc=String.valueOf(ComboBox.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblManage.getModel();
         dtm.setNumRows(0);
        
         for(Airplane vs:airplaneC.getAirlinerCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();

    
           dtm.addRow(row);
    
          }   }
        }
         if(dataEntry.equalsIgnoreCase("Lufthansa"))
        {
         String abc=String.valueOf(ComboBox.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblManage.getModel();
         dtm.setNumRows(0);
    
         for(Airplane vs:airplaneC.getAirlinerCatalog())
      
         {
           bc=vs.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=vs;
           row[1]=vs.getAirlineID();
           row[2]=vs.getFlightNumber();
           row[3]=vs.getModelNumber();
           row[4]=vs.getFromLocation();
           row[5]=vs.getToLocation();
 
    
           dtm.addRow(row);
    
          }   }
        }
                                           
if(dataEntry.equalsIgnoreCase("Singapore Airlines"))
        {
         String abc=String.valueOf(ComboBox.getSelectedItem());
         String bc;
         DefaultTableModel dtm=(DefaultTableModel)tblManage.getModel();
         dtm.setNumRows(0);
    
         for(Airplane ai :airplaneC.getAirlinerCatalog())
      
         {
           bc=ai.getAirlinerName();
           if(bc.equals(abc)){
           Object row[]=new Object[10];
           row[0]=ai;
           row[1]=ai.getAirlineID();
           row[2]=ai.getFlightNumber();
           row[3]=ai.getModelNumber();
           row[4]=ai.getFromLocation();
           row[5]=ai.getToLocation();
 
    
           dtm.addRow(row);
    
          }   }
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnViewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightActionPerformed
        // TODO add your handling code here:
        
        int selectedRow=tblManage.getSelectedRow();
      if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the data first.","Warning!", JOptionPane.WARNING_MESSAGE);
        }
      else{
       Airplane airliner=(Airplane)tblManage.getValueAt(selectedRow, 0);
       ViewFlights panel=new ViewFlights(userControlDisplayPanel,airliner);
       userControlDisplayPanel.add("ViewFlights",panel);
       CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
       layout.next(userControlDisplayPanel); 
    }
    }//GEN-LAST:event_btnViewFlightActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         int selectedRow=tblManage.getSelectedRow();
      if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the data first.","Warning!", JOptionPane.WARNING_MESSAGE);
        }
      else{
       Airplane air=(Airplane)tblManage.getValueAt(selectedRow, 0);
       UpdateFlightsJPanel panel=new UpdateFlightsJPanel(userControlDisplayPanel,air);
       userControlDisplayPanel.add("UpdateFlightsJPanel",panel);
       CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
       layout.next(userControlDisplayPanel); 
    }
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JButton btnCreateFlight;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManage;
    // End of variables declaration//GEN-END:variables

    /*private void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel dtm = (DefaultTableModel)tblManage.getModel();
        dtm.setNumRows(0);
        
        for(Airplane vs: airplaneC.getAirlinerCatalog())
        {
            Object row[] = new Object[10];
            //row[0]= vs.getAirlinerName();
            row[0]= vs;
            row[1]= vs.getAirlineID();
            row[2]= vs.getFlightNumber();
            row[3]= vs.getModelNumber();
           // row[4]= vs.getManufacturerName();
            row[4]= vs.getFromLocation();
            row[5]= vs.getToLocation();
            //row[9]= vs.getSeatPrice();
            //row[8]= vs.getArrival();
            //row[7]= vs.getDeparture();
            
             dtm.addRow(row);
             
        }
    
    }*/
}

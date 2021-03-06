/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.TravelAgency;

import Business.AirlinerCatalog;
import Business.Airplane;
import Business.AirplaneCatalog;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Siddhi
 */
public class CreateFlights extends javax.swing.JPanel {
    private JPanel userControlDisplayPanel;
    private AirplaneCatalog airplaneC;
    private AirlinerCatalog aCatalog;

    /**
     * Creates new form Create
     */
    public CreateFlights(JPanel userControlDisplayPanel, AirplaneCatalog airplaneC) {
        initComponents();
        this.airplaneC=airplaneC;
      this.userControlDisplayPanel=userControlDisplayPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAirlinerID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFlightNbr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelNbr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtArrivalTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDepartureTime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtManName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        ComboAirName = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 153, 153));

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE FLIGHTS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Airliner Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Airliner ID:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Flight Number:");

        txtSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSourceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Model Number:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Source:");

        txtArrivalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrivalTimeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Destination:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Arrival Time:");

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Departure Time:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Manufacturer Name:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Price:");

        ComboAirName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Emirates", "Qatar", "Ethiad", "British Airways", "Lufthansa", "Singapore Airlines" }));
        ComboAirName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAirNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFlightNbr))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAirlinerID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboAirName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtModelNbr))
                                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel10))
                                    .addGap(221, 221, 221)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboAirName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAirlinerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtFlightNbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModelNbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtManName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        //AIRLINE ID FIELD VALIDATION
        String airlineID = txtAirlinerID.getText();
        if(airlineID==null || airlineID.equals("")){
               JOptionPane.showMessageDialog(null, "Airliner ID can't be empty" );
               return;
           } 
        
         if(!airlinerIDPatternCorrect()){
         JOptionPane.showMessageDialog(null, "Airline ID should not contain any special characters!!");
         txtAirlinerID.setBorder(BorderFactory.createLineBorder(Color.RED));
         jLabel1.setForeground(Color.RED);
         return;
     }  
        
      /*  String airlineName= txtAirlinerName.getText();
         
       if(airlineName==null || airlineName.equals("")){
               JOptionPane.showMessageDialog(null, "Airliner Name can't be empty" );
               return; 
           } */
        
         //Airliner Name dropdown box validation
        String Name = (String) ComboAirName.getSelectedItem();
        
        if(Name.equalsIgnoreCase("none"))
        {
            JOptionPane.showMessageDialog(null, "Please select Airliner from the dropdown!!");
            return;
        
        }
        
           //Flight Number field validation     
      
        int flightNum=0;
        try{
             flightNum =Integer.parseInt(txtFlightNbr.getText());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid flight number!!");
            return;
        }
        
       //Model Number field validation
        
        String model= txtModelNbr.getText();
        if(model==null || model.equals("")){
               JOptionPane.showMessageDialog(null, " Model Number field can't be empty" );
               return;
           } 
        
        if(!modelPatternCorrect()){
         JOptionPane.showMessageDialog(null, "Model Number should not contain any special characters!!");
         txtModelNbr.setBorder(BorderFactory.createLineBorder(Color.RED));
         jLabel1.setForeground(Color.RED);
         return;
     }  
        
        //Source field validation
        String source = txtSource.getText();
        if(source==null || source.equals("")){
               JOptionPane.showMessageDialog(null, "Source field can't be empty" );
               return;
           } 
        
        if(!sourcePatternCorrect()){
         JOptionPane.showMessageDialog(null, "Source field should not contain any special characters!!");
         txtSource.setBorder(BorderFactory.createLineBorder(Color.RED));
         jLabel1.setForeground(Color.RED);
         return;
     }  
        //Destination field validation
        String destination= txtDestination.getText();
        if(destination==null || destination.equals("")){
               JOptionPane.showMessageDialog(null, "Destination field can't be empty" );
               return;
           } 
        
         if(!destinationPatternCorrect()){
         JOptionPane.showMessageDialog(null, "Destination field should not contain any special characters!!");
         txtDestination.setBorder(BorderFactory.createLineBorder(Color.RED));
         jLabel1.setForeground(Color.RED);
         return;
     } 
        
        //Arrival time field validation
        
        String arrival = txtArrivalTime.getText();
        if(arrival==null || arrival.equals("")){
               JOptionPane.showMessageDialog(null, "Arrival Time can't be empty" );
               return;
           } 
      
  
        if(!arrivalTimeatternCorrect()){
         JOptionPane.showMessageDialog(null, "Arrival time field should not contain any special characters!!");
         txtArrivalTime.setBorder(BorderFactory.createLineBorder(Color.RED));
         jLabel1.setForeground(Color.RED);
         return;
     } 
        
        
        //Departure time field validation
        
        String departure = txtDepartureTime.getText();
        if(departure==null || departure.equals("")){
               JOptionPane.showMessageDialog(null, "Departure Time can't be empty" );
               return;
           } 
        
         if(!departureTimeatternCorrect()){
         JOptionPane.showMessageDialog(null, "Departure time field should not contain any special characters!!");
         txtDepartureTime.setBorder(BorderFactory.createLineBorder(Color.RED));
         jLabel1.setForeground(Color.RED);
         return;
     } 
        
        
        //Manufacture field validation
        String manufac = txtManName.getText();
        if(manufac==null || manufac.equals("")){
               JOptionPane.showMessageDialog(null, "Manufacturer Name can't be empty" );
               return;
           } 
        
        if(!manufacturerpatternCorrect()){
         JOptionPane.showMessageDialog(null, "Departure time field should not contain any special characters!!");
         txtManName.setBorder(BorderFactory.createLineBorder(Color.RED));
         jLabel1.setForeground(Color.RED);
         return;
     } 
        
        //Price field validation
        
       int price;
        try{
              price = Integer.parseInt(txtPrice.getText());
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Please enter a valid price!!");
                return;
        } 
     
        Airplane airline =airplaneC.addAirplane();
        airline.setAirlineID(airlineID);
        airline.setAirlinerName(Name);
        airline.setFlightNumber(flightNum);
        airline.setModelNumber(model);
        airline.setFromLocation(destination);
        airline.setToLocation(source);
        airline.setArrival(arrival);
        airline.setDeparture(departure);
        airline.setManufacturerName(manufac);
        airline.setSeatPrice(price);
        
        JOptionPane.showMessageDialog(null,"Airline Successfully Created !!!");

        txtAirlinerID.setText("");
      //  txtAirlinerName.setText("");
        txtFlightNbr.setText("");
        txtModelNbr.setText("");
        txtSource.setText("");
        txtDestination.setText("");
        txtArrivalTime.setText("");
        txtDepartureTime.setText("");
        txtManName.setText("");
        txtPrice.setText("");
        
        
           

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSourceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageFlights panel=new ManageFlights(userControlDisplayPanel, airplaneC);
        userControlDisplayPanel.add("ManageFlights",panel);
        CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
        layout.next(userControlDisplayPanel);

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtArrivalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrivalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrivalTimeActionPerformed

    private void ComboAirNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAirNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAirNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboAirName;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAirlinerID;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtDepartureTime;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNbr;
    private javax.swing.JTextField txtManName;
    private javax.swing.JTextField txtModelNbr;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables

    private boolean airlinerIDPatternCorrect() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtAirlinerID.getText());
       boolean b = m.matches();
       return b;
   
    }

    private boolean modelPatternCorrect() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtModelNbr.getText());
       boolean b = m.matches();
       return b;
    
    
    
    }

    private boolean sourcePatternCorrect() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
      Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtSource.getText());
       boolean b = m.matches();
       return b;
    
    }

    private boolean destinationPatternCorrect() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtDestination.getText());
       boolean b = m.matches();
       return b;
    
    }

    private boolean arrivalTimeatternCorrect() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtArrivalTime.getText());
       boolean b = m.matches();
       return b;
    
    
    
    }

    private boolean departureTimeatternCorrect() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
      Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtDepartureTime.getText());
       boolean b = m.matches();
       return b;
    
    
    }

    private boolean manufacturerpatternCorrect() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
      Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtManName.getText());
       boolean b = m.matches();
       return b;
    
    
    }
}

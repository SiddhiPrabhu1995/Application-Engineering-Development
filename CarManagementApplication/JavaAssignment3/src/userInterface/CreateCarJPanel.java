/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Car;
import business.CarInformationList;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Siddhi
 */
public class CreateCarJPanel extends javax.swing.JPanel {

    private JPanel userProcesscontainer;
    private CarInformationList carInformationList;
    /**
     * Creates new form CreateCarJPanel
     */
    public CreateCarJPanel(JPanel userProcesscontainer,CarInformationList carInformationList) {
        initComponents();
        this.userProcesscontainer = userProcesscontainer;
        this.carInformationList = carInformationList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtManufYear = new javax.swing.JTextField();
        txtMinimumSeats = new javax.swing.JTextField();
        txtMaximumSeats = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtAvailableCity = new javax.swing.JTextField();
        checkboxMaintenanceCert = new javax.swing.JCheckBox();
        checkboxAvailability = new javax.swing.JCheckBox();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblHeader.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Create Car Details");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Availability:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Brand Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Manufactured Year:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Minimum Seats:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Maximum Seats:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Serial Number:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Model Number:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Available City:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Maintenance Certificate:");

        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });

        txtMinimumSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinimumSeatsActionPerformed(evt);
            }
        });

        txtMaximumSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaximumSeatsActionPerformed(evt);
            }
        });

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        txtModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberActionPerformed(evt);
            }
        });

        txtAvailableCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailableCityActionPerformed(evt);
            }
        });

        checkboxMaintenanceCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxMaintenanceCertActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkboxMaintenanceCert)
                            .addComponent(txtMinimumSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(txtManufYear, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(txtBrandName)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(txtMaximumSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(checkboxAvailability)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAvailableCity))))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManufYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMinimumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaximumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAvailableCity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(checkboxMaintenanceCert)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(checkboxAvailability))
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaximumSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaximumSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaximumSeatsActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void txtModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberActionPerformed

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtAvailableCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailableCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableCityActionPerformed

    private void txtMinimumSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinimumSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimumSeatsActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        //Create field validations
        
        //Brand Name field vaildations
        String brandName = txtBrandName.getText();
         if(brandName == null || brandName.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Brand Name can't be empty");
                return;
            
            }
           
        //Manufactured year field validation
       int manufactured_year ;
       
       try{
           
           manufactured_year = Integer.parseInt(txtManufYear.getText());
           
           
       }catch(NumberFormatException e)
       {
                 JOptionPane.showMessageDialog(null,"Manufactured Year field can't be empty or contain Aphabets!!");
                return;
       
       }
       
       
        
         //validation:- minimum seats cannot be 0 or negative value
        int min_seats ;
        
        try{
        min_seats = Integer.parseInt(txtMinimumSeats.getText());
        
        }
        catch(NumberFormatException e)
        {
                JOptionPane.showMessageDialog(null,"Minimum Seats field can't be empty  or contain Aphabets!!");
                return;
        
        }
        
        //validation:- Maximum seats cannot be 0 or negative value or greater than 5
        int max_seats; 
        
         try{
        max_seats = Integer.parseInt(txtMaximumSeats.getText());
        }
        catch(NumberFormatException e)
        {
                JOptionPane.showMessageDialog(null,"Maximum Seats field can't be empty  or contain Aphabets!!");
                return;
        
        }
        
        //Validation:- Serial Number field Also called VIN(Vehicle indication number) should not be more than 17 digits
       
       
         int serial_num;
        try{
             serial_num = Integer.parseInt(txtSerialNumber.getText());
               
        
       
        }catch(NumberFormatException e)
        {
                JOptionPane.showMessageDialog(null,"Serial Number field can't be blank  or contain Aphabets!!");
                return;
        
        }
        
        //String serial_num = txtSerialNumber.getText();
         int length = String.valueOf(serial_num).length();
         
      
          if(serial_num <= 0)
        {
                JOptionPane.showMessageDialog(null,"Serial Number can't be less than zero");
                return;
        }
        else if(length > 17)
        {
                JOptionPane.showMessageDialog(null,"Serial Number can't be more than 17 digits");
                return;
        
        }

        
        // Model Number field vaildation
        String model_num = txtModelNumber.getText();
        if(model_num == null || model_num.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Model Number can't be empty");
                return;
            
            }
           
        // Available city field vaildation
        String availble_city = txtAvailableCity.getText();
        if(availble_city == null || availble_city.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Available city can't be empty");
                return;
            
            }
        
        boolean maintenance_certificate = checkboxMaintenanceCert.isSelected();
 
        boolean available = checkboxAvailability.isSelected();
        
       // Car car = carInformationList.createCar();
        Car car = new Car();
        car.setBrand(brandName);
        car.setManufactured_year(manufactured_year);
        car.setMin_seats(min_seats);
        car.setMax_seats(max_seats);
        car.setSerial_num(serial_num);
        car.setModel_num(model_num);
        car.setAvailble_city(availble_city);
        car.setMaintenance_certificate(maintenance_certificate);
        car.setAvailable(available);
        
        
        carInformationList.createCar(car);
        
        JOptionPane.showMessageDialog(null, "Car Details Saved Successfully!!");
        
        txtBrandName.setText("");
        txtManufYear.setText("");
        txtMinimumSeats.setText("");
        txtMaximumSeats.setText("");
        txtSerialNumber.setText("");
        txtModelNumber.setText("");
        txtAvailableCity.setText("");
        checkboxAvailability.setSelected(false);
        checkboxMaintenanceCert.setSelected(false);
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcesscontainer.remove(this);
        CardLayout layout = (CardLayout) userProcesscontainer.getLayout();
        layout.previous(userProcesscontainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void checkboxMaintenanceCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxMaintenanceCertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxMaintenanceCertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JCheckBox checkboxAvailability;
    private javax.swing.JCheckBox checkboxMaintenanceCert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtAvailableCity;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtManufYear;
    private javax.swing.JTextField txtMaximumSeats;
    private javax.swing.JTextField txtMinimumSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}

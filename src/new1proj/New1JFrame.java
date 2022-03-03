
package new1proj;

//import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class New1JFrame extends javax.swing.JFrame {
    String flag;
    String flg;

   
    public New1JFrame() {
        initComponents();
            flag="";
            flg=""; 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        txtAddress = new java.awt.TextArea();
        txtField = new java.awt.TextField();
        txtName = new java.awt.TextField();
        txtContact = new java.awt.TextField();
        txtAge = new java.awt.TextField();
        choice1 = new java.awt.Choice();
        button4 = new java.awt.Button();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        label8 = new java.awt.Label();
        txtID = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Kartik(evt);
            }
        });

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 51, 51));
        label1.setText("Employee Information");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 51, 51));
        label2.setText("Name : ");

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 51, 51));
        label3.setText("Field : ");

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 51, 51));
        label4.setText("Contact No : ");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 51, 51));

        label6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 51, 51));
        label6.setText("Age : ");

        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 51, 51));
        label7.setText("Address : ");

        txtAddress.setEnabled(false);
        txtAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 51, 51));

        txtField.setEnabled(false);
        txtField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtField.setForeground(new java.awt.Color(0, 51, 51));

        txtName.setEnabled(false);
        txtName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 51, 51));

        txtContact.setEnabled(false);
        txtContact.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtContact.setForeground(new java.awt.Color(0, 51, 51));

        txtAge.setEnabled(false);

        choice1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        choice1.setForeground(new java.awt.Color(0, 51, 51));
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hello(evt);
            }
        });

        button4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button4.setLabel("DELETE");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button1.setLabel("ADD");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button2.setLabel("SAVE");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button3.setLabel("EDIT");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 51, 51));
        label8.setText("E_ID : ");

        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        label3.getAccessibleContext().setAccessibleName("Field ");
        label4.getAccessibleContext().setAccessibleName("Contact No");
        label6.getAccessibleContext().setAccessibleName("Age");
        button4.getAccessibleContext().setAccessibleName("button4");
        button1.getAccessibleContext().setAccessibleName("button1");
        button2.getAccessibleContext().setAccessibleName("button2");
        button3.getAccessibleContext().setAccessibleName("button3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Kartik(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Kartik
        // TODO add your handling code here:
        this.choice1.addItem("IT");
        this.choice1.addItem("CS");
        this.choice1.addItem("HR");
        this.choice1.addItem("EM");
        
    }//GEN-LAST:event_Kartik

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.txtName.setEnabled(true);
        this.txtField.setEnabled(true);
        this.txtContact.setEnabled(true);
        this.txtAge.setEnabled(true);
        this.txtID.setEnabled(true);
        this.txtAddress.setEnabled(true);
        this.txtID.requestFocus();
        this.button2.setEnabled(true);
        this.button1.setEnabled(false);
        this.button4.setEnabled(false);
        this.button3.setEnabled(false);
        flag="ADD";
      
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        if(flag.equals("ADD"))
        {
           
           try {
 String sql;
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee" , "root","");
 Statement stmt = con.createStatement();
 sql = "insert into e_details values(" + this.txtID.getText() + ",'" + this.txtName.getText() + "','" + this.txtContact.getText() + "','" + this.txtField.getText() + "'," + this.txtAge.getText() + ",'" + this.txtAddress.getText() + "')";
 int result = stmt.executeUpdate(sql);
 JOptionPane.showMessageDialog(null, "Record Saved Successfully");
 this.txtName.setText("");
 this.txtField.setText("");
 this.txtID.setText("");
 this.txtAge.setText("");
 this.txtContact.setText("");
 this.txtAddress.setText("");
  this.button1.setEnabled(true);
 this.button2.setEnabled(false);
 this.txtName.setEnabled(false);
 this.txtField.setEnabled(false);
 this.txtContact.setEnabled(false);
 this.txtAge.setEnabled(false);
 this.txtAddress.setEnabled(false);
      
  this.txtID.setEnabled(false);
             boolean equals = flag.equals("");
    this.button1.requestFocus();
        
           }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(New1JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           else if(flag.equals("EDIT")){
         
             try {
 String sql;
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee" , "root","");
 Statement stmt = con.createStatement();
 sql = "update e_details set Name = '" + this.txtName.getText() + "',Contact_No = '" + this.txtContact.getText() + "',Field = '" +this.txtField.getText() + "',Age = " + Integer.parseInt(this.txtAge.getText()) + ",Address = '" + this.txtAddress.getText() + "' where E_ID = " + Integer.parseInt(this.txtID.getText()) +"";
 int result;
                 result = stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Record Edited Successfully");
 this.txtName.setText("");
 this.txtField.setText("");
 this.txtContact.setText("");
 this.txtAge.setText("");
 this.txtID.setText("");
 this.txtAddress.setText("");
 
 this.button1.setEnabled(true);
 this.button2.setEnabled(false);
 this.txtName.setEnabled(false);
 this.txtField.setEnabled(false);
 this.txtContact.setEnabled(false);
 this.txtAge.setEnabled(false);
 this.txtID.setEnabled(false);
 this.txtAddress.setEnabled(false);
             boolean equals = flag.equals("");
 this.button1.requestFocus();
 } catch (   ClassNotFoundException | SQLException ex) {
 Logger.getLogger(New1JFrame.class.getName()).log(Level.SEVERE, null, ex);
 }
                   }
        
    }//GEN-LAST:event_button2ActionPerformed

    private void hello(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hello
        // TODO add your handling code here:
        this.txtField.setText(this.choice1.getSelectedItem());
    }//GEN-LAST:event_hello

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        flag="EDIT";
        this.txtID.setEnabled(true);
        this.txtID.requestFocus();
        this.button1.setEnabled(false);
        this.button3.setEnabled(false);
        this.button4.setEnabled(false);
        
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        flag="DELETE";
 this.txtID.setEnabled(true);
 this.txtID.requestFocus();
 this.button3.setEnabled(false);
 if(flg.equals("DEL"))
 {
     try {
 String sql;
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee" , "root","");
 Statement stmt = con.createStatement();
 sql = "delete from e_details where E_ID = " + this.txtID.getText() + "";
 int result;
         result = stmt.executeUpdate(sql);
 JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
     this.txtName.setText("");
 this.txtField.setText("");
 this.txtContact.setText("");
 this.txtAge.setText("");
 this.txtID.setText("");
 this.txtAddress.setText("");
 
 
 this.button1.setEnabled(true);
 this.button2.setEnabled(true);
 this.txtID.setEnabled(false);
 this.txtName.setEnabled(false);
 this.txtField.setEnabled(false);
 this.txtContact.setEnabled(false);
 this.txtAge.setEnabled(false);
 this.txtAddress.setEnabled(false);
           boolean equals = flag.equals("");
           this.button1.requestFocus();
           } catch (ClassNotFoundException | SQLException ex) {
 Logger.getLogger(New1JFrame.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
    }//GEN-LAST:event_button4ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
        try {
 String sql;
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee" , "root","");
 Statement stmt = con.createStatement();
 sql = "select *from e_details where E_ID = " + this.txtID.getText() + "";
 ResultSet rs = stmt.executeQuery(sql);
while(rs.next())
{
    this.txtName.setText(rs.getString("Name"));
    this.txtField.setText(rs.getString("Field"));
 this.txtContact.setText(rs.getString("Contact_No"));
 this.txtAge.setText(String.valueOf(rs.getInt("Age")));
  this.txtAddress.setText(rs.getString("Address"));
 this.button3.setEnabled(true);
 this.txtField.setEnabled(true);
 this.txtContact.setEnabled(true);
 this.txtAge.setEnabled(true);
 this.txtName.setEnabled(true);
 this.txtAddress.setEnabled(true);
 this.txtID.requestFocus();
 this.button1.setEnabled(false);
  this.button3.setEnabled(false);
 //this.button3.setEnabled(false);
 if(flag.equals("DELETE"))
 {
     flg="DEL";
 
 this.button2.setEnabled(false);
 }
 else
 {
 
 this.button2.setEnabled(true);
 }
}
} catch (ClassNotFoundException | SQLException ex) {
 Logger.getLogger(New1JFrame.class.getName()).log(Level.SEVERE, null, ex);
 }
    }//GEN-LAST:event_txtIDActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new New1JFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Choice choice1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.List list1;
    private java.awt.TextArea txtAddress;
    private java.awt.TextField txtAge;
    private java.awt.TextField txtContact;
    private java.awt.TextField txtField;
    private java.awt.TextField txtID;
    private java.awt.TextField txtName;
    // End of variables declaration//GEN-END:variables
}

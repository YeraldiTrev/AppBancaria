/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appbancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yeraldi Treviño
 */
public class AddEmployedWindow extends javax.swing.JFrame {
     String url = "jdbc:postgresql://localhost:5432/AppBancaria";
     String user = "postgres";
     String password = "root";
     /**
      * Creates new form AddEmployedWindow
      */
     public AddEmployedWindow() {
          initComponents();
     }

     /**
      * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          lastNameTxt = new javax.swing.JTextField();
          txtPuesto = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();
          txtSueldo = new javax.swing.JTextField();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          confirmBtm = new javax.swing.JButton();
          lblPuesto = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          nameTxt = new javax.swing.JTextField();
          btmCancelar = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setText("Ingresa La Informacion del Empleado (No debe de faltar ningun dato)");

          jLabel2.setText("Nombre");

          jLabel3.setText("Apellido");

          confirmBtm.setText("Aceptar y Agregar Empleado");
          confirmBtm.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    confirmBtmMouseClicked(evt);
               }
          });

          lblPuesto.setText("Puesto");

          jLabel5.setText("Suledo (Mensual)");

          btmCancelar.setText("Cancelar");
          btmCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btmCancelarMouseClicked(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(135, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel1)
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(lblPuesto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGap(18, 18, 18)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                   .addComponent(lastNameTxt)
                                   .addComponent(txtPuesto)
                                   .addComponent(txtSueldo)))
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(confirmBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(46, 46, 46)
                              .addComponent(btmCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(67, 67, 67))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(lblPuesto)
                         .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel5)
                         .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(confirmBtm)
                         .addComponent(btmCancelar))
                    .addContainerGap(118, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void confirmBtmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBtmMouseClicked
          // TODO add your handling code here:
          try (Connection connect = DriverManager.getConnection(url, user, password)){
               
               PreparedStatement insert = connect.prepareStatement("INSERT INTO empleados("
                       + "nombre, apellido, puesto, sueldo)"
                       + "VALUES (?,?,?,?)");
               insert.setString(1,nameTxt.getText());
               insert.setString(2,lastNameTxt.getText());
               insert.setString(3,txtPuesto.getText());
               insert.setFloat(4,Float.parseFloat(txtSueldo.getText()));
               insert.executeUpdate();
               JOptionPane.showMessageDialog(null,
                       "Empleado Agregado Exitosamente");
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error: "+e);
          }

     }//GEN-LAST:event_confirmBtmMouseClicked

     private void btmCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmCancelarMouseClicked
          // TODO add your handling code here:
          this.setVisible(false);
          MainWindow open = new MainWindow();
          open.setVisible(true);
     }//GEN-LAST:event_btmCancelarMouseClicked

     /**
      * @param args the command line arguments
      */
     public static void main(String args[]) {
          /* Set the Nimbus look and feel */
          //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
          /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
           */
          try {
               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
                         break;
                    }
               }
          } catch (ClassNotFoundException ex) {
               java.util.logging.Logger.getLogger(AddEmployedWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(AddEmployedWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(AddEmployedWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(AddEmployedWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new AddEmployedWindow().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton btmCancelar;
     private javax.swing.JButton confirmBtm;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JTextField lastNameTxt;
     private javax.swing.JLabel lblPuesto;
     private javax.swing.JTextField nameTxt;
     private javax.swing.JTextField txtPuesto;
     private javax.swing.JTextField txtSueldo;
     // End of variables declaration//GEN-END:variables
}

package com.mycompany.appbancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Producto {
     String url = "jdbc:postgresql://localhost:5432/AppBancaria";
     String user = "postgres";
     String password = "root";
     
     public ResultSet viewProduct() {
          ResultSet rs = null;
          try{
               Connection conn= DriverManager.getConnection(url, user, password);
               PreparedStatement select = conn.prepareStatement("SELECT *"
                       + "FROM producto");
               rs = select.executeQuery();
          }catch( Exception e){
               JOptionPane.showMessageDialog(null,"Error: "+ e);
          }
          return rs;
     }
}

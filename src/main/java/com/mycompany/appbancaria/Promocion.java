package com.mycompany.appbancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Promocion {
     String url = "jdbc:postgresql://localhost:5432/AppBancaria";
     String user = "postgres";
     String password = "root";
     
     private int noPromocion;
     private String nombre;
     private String vigencia;
     private String descripcion;

     public int getNoPromocion() {
          return noPromocion;
     }
     public void setNoPromocion(int noPromocion) {
          this.noPromocion = noPromocion;
     }
     public String getNombre() {
          return nombre;
     }
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     public String getVigencia() {
          return vigencia;
     }
     public void setVigencia(String vigencia) {
          this.vigencia = vigencia;
     }
     
     public ResultSet viewPromo() {
          ResultSet rs = null;
          try{
               Connection conn= DriverManager.getConnection(url, user, password);
               PreparedStatement select = conn.prepareStatement("SELECT *"
                       + "FROM promociones");
               rs = select.executeQuery();
          }catch( Exception e){
               JOptionPane.showMessageDialog(null,"Error: "+ e);
          }
          return rs;
     }
}

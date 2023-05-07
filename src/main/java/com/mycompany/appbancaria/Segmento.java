package com.mycompany.appbancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Segmento {
     String url = "jdbc:postgresql://localhost:5432/AppBancaria";
     String user = "postgres";
     String password = "root";
     
     private int noSegmento;
     private String nombre;
     private String nivel;

     public int getNoSegmento() {
          return noSegmento;
     }
     public void setNoSegmento(int noSegmento) {
          this.noSegmento = noSegmento;
     }
     public String getNombre() {
          return nombre;
     }
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     public String getNivel() {
          return nivel;
     }
     public void setNivel(String nivel) {
          this.nivel = nivel;
     }

     public ResultSet viewSegment() {
          ResultSet rs = null;
          try{
               Connection conn= DriverManager.getConnection(url, user, password);
               PreparedStatement select = conn.prepareStatement("SELECT *"
                       + "FROM segmentos");
               rs = select.executeQuery();
          }catch( Exception e){
               JOptionPane.showMessageDialog(null,"Error: "+ e);
          }
          return rs;
     }
}

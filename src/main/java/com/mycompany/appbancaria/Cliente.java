package com.mycompany.appbancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Cliente {
     String url = "jdbc:postgresql://localhost:5432/AppBancaria";
     String user = "postgres";
     String password = "root";
     
     private String nombre;
     private String apellidos;
     private String fechaNacimiento;
     private String tipoCuenta;
     private String segmento;

     public String getNombre() {
          return nombre;
     }
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     public String getApellidos() {
          return apellidos;
     }
     public void setApellidos(String apellidos) {
          this.apellidos = apellidos;
     }
     public String getFechaNacimiento() {
          return fechaNacimiento;
     }
     public void setFechaNacimiento(String fechaNacimiento) {
          this.fechaNacimiento = fechaNacimiento;
     }
     public String getTipoCuenta() {
          return tipoCuenta;
     }
     public void setTipoCuenta(String tipoCuenta) {
          this.tipoCuenta = tipoCuenta;
     }
     public String getSegmento() {
          return segmento;
     }
     public void setSegmento(String segmento) {
          this.segmento = segmento;
     }
     
     public ResultSet viewClient() {
          ResultSet rs = null;
          try{
               Connection conn= DriverManager.getConnection(url, user, password);
               PreparedStatement select = conn.prepareStatement("SELECT "
                       + "id_cliente, nombre, apellido , fecha_nacimiento, tipo_cuenta, segmento "
                       + "FROM clientes");
               rs = select.executeQuery();
          }catch( Exception e){
               JOptionPane.showMessageDialog(null,"Error: "+ e);
          }
          return rs;
     }
}

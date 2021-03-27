/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBConexion {
    

   public Connection con;
   public DBConexion()
   {
   try
   {
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nombres","root","");
     
   }catch (Exception ex) {
           System.out.println("Error en la conexion"+ ex);
       }
   
   }

    
}

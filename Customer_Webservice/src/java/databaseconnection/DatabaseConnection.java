/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnection;

/**
 *
 * @author shuhaib
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DatabaseConnection {
    
        
   public static Connection dBconn(){
       
   Connection conn = null;
  
   try{
     
      Class.forName("com.mysql.jdbc.Driver");
      String db = "jdbc:mysql://localhost/e-bank";
      String user = "root";
      String pwd = "";

      conn = DriverManager.getConnection(db,user,pwd);
      
   }catch(SQLException se){
     
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }
   return conn;
   }
    
}


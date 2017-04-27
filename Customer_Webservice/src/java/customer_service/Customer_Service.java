/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import databaseconnection.DatabaseConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author laksh
 */
@WebService(serviceName = "Customer_Service")
public class Customer_Service {

    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date myDate;
    java.sql.Date sqlDate;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCustomer")
    public Boolean addCustomer(@WebParam(name = "Name") String Name, @WebParam(name = "DoB") String DoB, @WebParam(name = "Address") String Address, @WebParam(name = "Mobile") String Mobile, @WebParam(name = "Email") String Email, @WebParam(name = "AccountType") String AccountType, @WebParam(name = "AccountNumber") String AccountNumber, @WebParam(name = "SortCode") int SortCode, @WebParam(name = "Balance") double Balance, @WebParam(name = "Card") String Card) {
        //TODO write your implementation code here:
        boolean success = false;

        try {
            myDate = formatter.parse(DoB);
            sqlDate = new java.sql.Date(myDate.getTime());
            String sqlQuery = "INSERT INTO customer (Name, DoB, Address, Mobile,Email,AccountType,AccountNumber,SortCode,Balance,Card) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            stmt.setString(1, Name);
            stmt.setDate(2, sqlDate);
            stmt.setString(3, Address);
            stmt.setString(4, Mobile);
            stmt.setString(5, Email);
            stmt.setString(6, AccountType);
            stmt.setString(7, AccountNumber);
            stmt.setDouble(8, SortCode);
            stmt.setDouble(9, Balance);
            stmt.setString(10, Card);
            stmt.execute();
            success = true;
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(Customer_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editCustomer")
    public Boolean editCustomer(@WebParam(name = "Name") String Name, @WebParam(name = "DoB") String DoB, @WebParam(name = "Address") String Address, @WebParam(name = "Mobile") String Mobile, @WebParam(name = "Email") String Email, @WebParam(name = "AccountNumber") String AccountNumber) {
        //TODO write your implementation code here:
        boolean success = false;
        try {
            myDate = formatter.parse(DoB);
            sqlDate = new java.sql.Date(myDate.getTime());
            String sqlQuery = "UPDATE customer SET Name=?, DoB = ?, Address = ?, Mobile= ?, Email= ? WHERE AccountNumber=?";
            PreparedStatement stmt = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            stmt.setString(1, Name);
            stmt.setDate(2, sqlDate);
            stmt.setString(3, Address);
            stmt.setString(4, Email);
            stmt.setString(5, Mobile);
            stmt.setString(6, String.valueOf(AccountNumber));
            stmt.execute();
            success = true;
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(Customer_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCustomer")
    public Boolean deleteCustomer(@WebParam(name = "AccountNumber") String AccountNumber) {
        //TODO write your implementation code here:
        boolean success = false;
        try {
            String sqlQuery = "DELETE FROM customer WHERE AccountNumber = ?";
            PreparedStatement stmt = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            stmt.setString(1, AccountNumber);
            stmt.execute();
            success = true;
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return success;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "customersList")
    public ArrayList customersList() {
        //TODO write your implementation code here:
        ArrayList arrayList = new ArrayList();
        try {
            String sqlQuery = "SELECT Name, AccountNumber FROM customer";
            PreparedStatement stmt = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString("Name");
                String name = rs.getString("AccountNumber");
                arrayList.add(id + "-" + name);

            }
            return arrayList;

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return arrayList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "viewCustomer")
    public ArrayList viewCustomer(@WebParam(name = "accountNumber") int accountNumber) {
        //TODO write your implementation code here:
        ArrayList customerDetails = new ArrayList();
        try {
            String sqlQuery = "SELECT * FROM customer WHERE AccountNumber="+accountNumber;
            PreparedStatement stmt = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                customerDetails.add(rs.getString("Name"));
                customerDetails.add(rs.getString("DoB"));
                customerDetails.add(rs.getString("Address"));
                customerDetails.add(rs.getString("Mobile"));
                customerDetails.add(rs.getString("Email"));
                customerDetails.add(rs.getString("AccountType"));
                customerDetails.add(rs.getString("AccountNumber"));
                customerDetails.add(rs.getString("SortCode"));
                customerDetails.add(rs.getString("Balance"));
                customerDetails.add(rs.getString("Card"));

            }
            return customerDetails;

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return customerDetails;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import databaseconnection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shuhaib
 */
@WebService(serviceName = "Employee_Service")
public class Employee_Service {

    /**
     * Web service operation
     *
     * @param username
     * @param password
     * @return
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        String sqlQuery = "SELECT * FROM employee where Username=? and Password=?";
        try {
            PreparedStatement statment = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            statment.setString(1, username);
            statment.setString(2, password);
            System.out.println();
            ResultSet rs = statment.executeQuery();

            return rs.next();
        } catch (SQLException se) {
            Logger.getLogger(Employee_Service.class.getName()).log(Level.SEVERE, null, se);

        } catch (Exception e) {
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addEmployee")
    public Boolean addEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        boolean token = false;

        String sqlQuery = "INSERT INTO employee (Name, Position, Username, Password) VALUES (?,?,?,?)";
        try {
            PreparedStatement statment = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            statment.setString(1, name);
            statment.setString(2, position);
            statment.setString(3, username);
            statment.setString(4, password);
            statment.execute();

            token = true;

        } catch (SQLException se) {
            Logger.getLogger(Employee_Service.class.getName()).log(Level.SEVERE, null, se);

        } catch (Exception e) {
        }
        return token;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editEmployee")
    public Boolean editEmployee(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        boolean token = false;

        String sqlQuery = "UPDATE employee SET Name=?, Position=?, Username=?, Password=? WHERE Id=?";
        try {
            PreparedStatement ps = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            ps.setString(1, name);
            ps.setString(2, position);
            ps.setString(3, username);
            ps.setString(4, password);
            ps.setString(5, String.valueOf(id));
            ps.execute();
            System.out.println();
            token = true;

        } catch (SQLException se) {
            Logger.getLogger(Employee_Service.class.getName()).log(Level.SEVERE, null, se);

        } catch (Exception e) {
        }
        return token;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteOperation")
    public Boolean deleteOperation(@WebParam(name = "id") int id) {
        boolean token = false;
        String sqlQuery = "DELETE FROM employee WHERE Id=?";
        try {
            PreparedStatement ps = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            ps.setString(1, String.valueOf(id));
            ps.execute();
            System.out.println();
            token = true;

        } catch (SQLException se) {
            Logger.getLogger(Employee_Service.class.getName()).log(Level.SEVERE, null, se);

        } catch (Exception e) {
        }
        return token;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "employeeList")
    public ArrayList employeeList() {
        //TODO write your implementation code here:
        ArrayList arrayList = new ArrayList();
      try {
            String sqlQuery = "SELECT Id,Name,Position FROM employee";
            PreparedStatement stmt = DatabaseConnection.dBconn().prepareStatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString("Id");
                String name = rs.getString("Name");
                String position = rs.getString("Position");
                arrayList.add(id + " - " + name + " - " + position);

            }
            return arrayList;

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return arrayList;
    }


}

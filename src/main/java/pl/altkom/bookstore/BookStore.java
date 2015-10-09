/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class BookStore {
    
    public static void main(String[] args) {
        
        System.out.println("!!!");
        
        try {
            
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample",
                    "app",
                    "app");
            
            ResultSet rs = connection.createStatement().executeQuery("select * from app.customer");
            
            List<Customer> res = new ArrayList<>();
            
            while(rs.next()) {
                String name = rs.getString("name");
                int id = rs.getInt("customer_id");
                
                //rs.updateString("name", "ssssss");
                
                Customer customer = new Customer();
                customer.setName(rs.getString("name"));
                customer.setCiti(rs.getString("city"));
                customer.setId(rs.getInt("customer_id"));
                
                res.add(customer);
                
            }
            
            System.out.println(res);
            
            rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BookStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

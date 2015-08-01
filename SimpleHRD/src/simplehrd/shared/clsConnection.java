/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplehrd.shared;

import java.sql.*;

/**
 *
 * @author jupiterzhuo
 */
public class clsConnection {
    

        
    static Connection conn =null;
    static Statement smt =null;
    static  ResultSet rs =null;
    public static String setConnectionString()
    {
        String _Driver ="jdbc:mysql://localhost:3306/simplehrd";
        String _Username="root";
        String _Password="";
        try {
             conn =DriverManager.getConnection(_Driver,_Username,_Password);
             
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return "Success";
    }
}

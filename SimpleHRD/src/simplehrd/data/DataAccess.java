/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplehrd.data;
import java.sql.*;
/**
 *
 * @author jupiterzhuo
 */
public class DataAccess {
    private static  String _connString;
    
    public static String getConnString() {
        return _connString;
    }

    public static void setConnString(String _connString) {
        DataAccess._connString = _connString;
    }
}

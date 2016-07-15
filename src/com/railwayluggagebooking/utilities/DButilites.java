package com.railwayluggagebooking.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButilites {

	public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection con = null;

            Class.forName("oracle.jdbc.driver.OracleDriver");
            con =DriverManager.getConnection("jdbc:oracle:thin:@hstslc015:1521:elp", "elite1808", "techm123$");
            return con;

        }

     public static void closeConnection(Connection con) throws SQLException{
         con.close();
    }
}

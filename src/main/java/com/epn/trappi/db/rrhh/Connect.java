/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epn.trappi.db.rrhh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Juan Jaramillo <juanjodev02 at juan.jaramillo02@epn.edu.ec>
 */
public class Connect {
    public static Connection connect() {
            Connection conn = null;
            try {
                if(conn == null) {
                    String projectPath = System.getProperty("user.dir");
                    // db parameters
                    String url = "jdbc:sqlite:" + projectPath + "juanjo.db";
                    // create a connection to the database
                    conn = DriverManager.getConnection(url);
                    System.out.println("Connection to SQLite has been established.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
    }
}

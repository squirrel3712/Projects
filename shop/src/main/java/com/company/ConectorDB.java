package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;;

public class ConectorDB {
    static public Connection getConnection() throws SQLException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("database.properties", Locale.US);
        String driver = resourceBundle.getString("db.driver");
        String nemeDb = resourceBundle.getString("db.name");
        String url = resourceBundle.getString("db.url");
        String user = resourceBundle.getString("db.user");
        String password = resourceBundle.getString("db.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(url + nemeDb, user, password);
    }

}

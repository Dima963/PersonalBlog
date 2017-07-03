package net.blog.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectDB {

    public static Connection getConnnection() throws SQLException, IOException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        String url =  resourceBundle.getString("db.url");
        String user =  resourceBundle.getString("db.user");
        String pass =  resourceBundle.getString("db.path");
        return DriverManager.getConnection(url, user, pass);
    }
}

package com.chamodshehanka.heshanhardware.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class DBConnectionUtil {

    private static Connection connection;
    private DBConnectionUtil() {
    }

    public static Connection getDBConnection() throws SQLException, ClassNotFoundException {

        if (connection == null || connection.isClosed()){
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/heshanhardware","root","wampwamp");
        }
        return connection;
    }
}

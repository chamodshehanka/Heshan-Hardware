package com.chamodshehanka.heshanhardware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class DBConnectionUtil {

    private static Connection connection;

    public DBConnectionUtil() {
    }

    public static Connection getDBConnection() throws SQLException {
//        if (connection == null || connection.isClosed()){
//            Class.forName(properties.getProperty(CommonConstants.DRIVER_NAME));
//            connection = DriverManager.getConnection(properties.getProperty(CommonConstants.URL),
//                    properties.getProperty(CommonConstants.USERNAME), properties.getProperty(CommonConstants.PASSWORD));
//        }
        return connection;
    }
}

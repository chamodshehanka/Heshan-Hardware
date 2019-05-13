package com.chamodshehanka.heshanhardware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class DBConnectionUtil extends CommonUtil {

    private static Connection connection;
    private DBConnectionUtil() {
    }

    public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
        if (connection == null || connection.isClosed()){
            Class.forName(properties.getProperty(CommonConstants.DRIVER_NAME));
            connection = DriverManager.getConnection(
                    properties.getProperty(CommonConstants.URL),
                    properties.getProperty(CommonConstants.USERNAME),
                    properties.getProperty(CommonConstants.PASSWORD)
            );
        }
        return connection;
    }
}

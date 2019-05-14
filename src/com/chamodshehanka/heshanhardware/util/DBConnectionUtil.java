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

    private DBConnectionUtil() {
    }

    public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
        if (connection == null || connection.isClosed()){
            Class.forName(
                    CommonUtil.properties.getProperty(CommonConstants.DRIVER_NAME));
            connection = DriverManager.getConnection(
                    CommonUtil.properties.getProperty(CommonConstants.URL),
                    CommonUtil.properties.getProperty(CommonConstants.USERNAME),
                    CommonUtil.properties.getProperty(CommonConstants.PASSWORD)
            );
        }
        return connection;
    }
}

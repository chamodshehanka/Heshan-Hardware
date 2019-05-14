package com.chamodshehanka.heshanhardware.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author chamodshehanka on 5/7/2019
 * @project HeshanHardware
 **/
public class IDController {

    public static String getLastID(String tblName, String colName) throws SQLException, ClassNotFoundException {
        String SQL = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1", colName, tblName, colName);
        Connection connection = DBConnectionUtil.getDBConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(SQL);
        if (resultSet.next())
            return resultSet.getString(1);
        return null;
    }

}

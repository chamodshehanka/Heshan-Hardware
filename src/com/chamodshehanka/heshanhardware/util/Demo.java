package com.chamodshehanka.heshanhardware.util;

import java.sql.SQLException;

/**
 * @author chamodshehanka on 5/13/2019
 * @project HeshanHardware
 **/
public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println(DBConnectionUtil.getDBConnection());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

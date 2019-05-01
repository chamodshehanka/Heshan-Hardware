package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Admin;
import com.chamodshehanka.heshanhardware.service.custom.AdminService;
import com.chamodshehanka.heshanhardware.util.CommonConstants;
import com.chamodshehanka.heshanhardware.util.CommonUtil;
import com.chamodshehanka.heshanhardware.util.DBConnectionUtil;
import com.chamodshehanka.heshanhardware.util.QueryUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class AdminServiceImpl implements AdminService {

    public static final Logger LOGGER = Logger.getLogger(AdminServiceImpl.class.getName());
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    static {
        createAdminTable();
    }

    public static void createAdminTable(){
//        try {
//            connection = DBConnectionUtil.getDBConnection();
//            statement = connection.createStatement();
//            statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_DROP_TABLE));
//            statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_TABLE));
//        } catch (SQLException | IOException | ParserConfigurationException | SAXException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void add(Admin admin) {
//        assert getAdminIDs() != null;
//        String adminID = CommonUtil.generateIDs(getAdminIDs());
//
//        try {
//            connection = DBConnectionUtil.getDBConnection();
//            preparedStatement = connection
//                    .prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_ADMIN));
//            connection.setAutoCommit(false);
//
//            admin.setAdminID(adminID);
//            preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, admin.getAdminID());
//            preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, admin.getUserName());
//            preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, admin.getPassword());
//
//            preparedStatement.execute();
//            connection.commit();
//        } catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (preparedStatement != null){
//                    preparedStatement.close();
//                }
//
//                if (connection != null){
//                    connection.close();
//                }
//            }catch (SQLException e){
//                e.printStackTrace();
//            }
//        }
    }

    @Override
    public Admin getByID(String s) {
        return null;
    }

    @Override
    public Admin update(String adminID, Admin admin) {
        return null;
    }

    @Override
    public void remove(String adminID) {

    }

    @Override
    public ArrayList<Admin> getAll() {
        return null;
    }

    private ArrayList<String> getAdminIDs(){
        return null;
    }
}

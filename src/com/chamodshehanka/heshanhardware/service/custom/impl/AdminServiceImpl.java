package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Admin;
import com.chamodshehanka.heshanhardware.service.custom.AdminService;
import com.chamodshehanka.heshanhardware.util.CommonConstants;
import com.chamodshehanka.heshanhardware.util.DBConnectionUtil;
import com.chamodshehanka.heshanhardware.util.IDGenerator;
import com.chamodshehanka.heshanhardware.util.QueryUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.*;
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

    private static void createAdminTable(){
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_ADMIN_TABLE));
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Admin admin) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_ADMIN));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, admin.getAdminID());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, admin.getUserName());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, admin.getPassword());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Admin getByID(String adminID) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_ADMIN));
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, adminID);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new Admin(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_THREE)
                );
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(String adminID, Admin admin) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_ADMIN));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, admin.getAdminID());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, admin.getUserName());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, admin.getPassword());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FIVE, adminID);

            return 0 < preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(String adminID) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_ADMIN));
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, adminID);
            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Admin> getAll() {
        ArrayList<Admin> adminArrayList = new ArrayList<>();
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_ALL_ADMINS));
            while (resultSet.next()){
                adminArrayList.add(new Admin(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_THREE)
                ));
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return adminArrayList;
    }

    @Override
    public String getNewID() {
        String newID = null;
        try {
            newID = IDGenerator.getNewID(CommonConstants.ADMIN_TABLE_NAME,
                    CommonConstants.ADMIN_TABLE_COL_NAME,CommonConstants.ADMIN_ID_PREFIX);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }
}

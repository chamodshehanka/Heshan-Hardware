package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Staff;
import com.chamodshehanka.heshanhardware.service.custom.StaffService;
import com.chamodshehanka.heshanhardware.util.CommonConstants;
import com.chamodshehanka.heshanhardware.util.DBConnectionUtil;
import com.chamodshehanka.heshanhardware.util.IDGenerator;
import com.chamodshehanka.heshanhardware.util.QueryUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;



/**
 * @author surangamahesh on 5/14/2019
 * @project HeshanHardware
 **/


public class StaffServiceImpl implements StaffService {

    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static Statement statement;

    static {
        createStaffTable();
    }

    private static void createStaffTable(){
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_STAFF_TABLE));
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Staff staff) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_STAFF));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, staff.getStaffID());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, staff.getName());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, staff.getPhone());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FOUR, staff.getEmail());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FIVE, staff.getType());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update( String staffID, Staff staff ) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_STAFF));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, staff.getStaffID());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, staff.getName());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, staff.getPhone());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FOUR, staff.getEmail());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FIVE, staff.getType());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_SIX, staffID);

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove( String staffID ) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_STAFF));
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, staffID);
            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Staff getByID( String staffID ) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_STAFF));
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, staffID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new Staff(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getInt(CommonConstants.COLUMN_INDEX_THREE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE)
                );
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public ArrayList<Staff> getAll() {
        ArrayList<Staff> staffArrayList = new ArrayList<>();
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_ALL_STAFF));
            while (resultSet.next()){
                staffArrayList.add(new Staff(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getInt(CommonConstants.COLUMN_INDEX_THREE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE)
                ));
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return staffArrayList;
    }

    @Override
    public String getNewID() {
        String newID = null;
        try {
            newID = IDGenerator.getNewID(CommonConstants.STAFF_TABLE_NAME,
                    CommonConstants.STAFF_TABLE_COL_NAME, CommonConstants.STAFF_ID_PREFIX);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }


}

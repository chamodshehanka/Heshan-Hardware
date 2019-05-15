package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Vendor;
import com.chamodshehanka.heshanhardware.service.custom.VendorService;
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
 */


public class VendorServiceImpl implements VendorService {

    private static Connection connection;
    private static Statement statement;
    private PreparedStatement preparedStatement;

    static {
        createVendorTable();
    }

    private static void createVendorTable(){
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_VENDOR_TABLE));
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Vendor vendor) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_VENDOR));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, vendor.getVendorID());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, vendor.getName());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, vendor.getType());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FOUR, vendor.getPhone());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FIVE, vendor.getEmail());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Vendor getByID( String vendorID ) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_VENDOR));

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new Vendor(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_THREE),
                        resultSet.getInt(CommonConstants.COLUMN_INDEX_FOUR),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE)
                );
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update( String vendorID, Vendor vendor) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_VENDOR));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, vendor.getVendorID());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, vendor.getName());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, vendor.getType());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FOUR, vendor.getPhone());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FIVE, vendor.getEmail());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_SIX, vendorID);

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove( String vendorID ) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_VENDOR));
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, vendorID);
            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Vendor> getAll() {
        ArrayList<Vendor> vendorArrayList = new ArrayList<>();
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_ALL_VENDORS));
            while (resultSet.next()){
                vendorArrayList.add(new Vendor(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_THREE),
                        resultSet.getInt(CommonConstants.COLUMN_INDEX_FOUR),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE)
                ));
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return vendorArrayList;
    }

    @Override
    public String getNewID() {
        String newID = null;
        try {
            newID = IDGenerator.getNewID("vendor", "vendor_id", "V");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }

}

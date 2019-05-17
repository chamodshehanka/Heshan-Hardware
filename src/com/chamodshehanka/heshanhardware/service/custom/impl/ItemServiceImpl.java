package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Item;
import com.chamodshehanka.heshanhardware.service.custom.ItemService;
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
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class ItemServiceImpl implements ItemService {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    static {
        createItemTable();
    }

    private static void createItemTable(){
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_ITEM_TABLE));
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Item item) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_ITEM));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, item.getItemCode());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, item.getItemDescription());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, item.getItemBrand());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FOUR, item.getUnitPrice());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FIVE, item.getQty());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Item getByID(String itemCode) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_ITEM));
            preparedStatement.setObject(1, itemCode);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new Item(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_THREE),
                        resultSet.getDouble(CommonConstants.COLUMN_INDEX_FOUR),
                        resultSet.getInt(CommonConstants.COLUMN_INDEX_FIVE)
                );
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(String itemCode, Item item) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_ITEM));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, item.getItemCode());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, item.getItemDescription());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, item.getItemBrand());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FOUR, item.getUnitPrice());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FIVE, item.getQty());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_SIX, itemCode);

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(String itemCode) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_ITEM));
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, itemCode);
            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public ArrayList<Item> getAll() {
        ArrayList<Item> itemArrayList = new ArrayList<>();

        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_ALL_ITEMS));

            while (resultSet.next()){
                itemArrayList.add(new Item(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_THREE),
                        resultSet.getDouble(CommonConstants.COLUMN_INDEX_FOUR),
                        resultSet.getInt(CommonConstants.COLUMN_INDEX_FIVE)
                ));
            }
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }


        return itemArrayList;
    }

    public String getNewID(){
        String newID = null;
        try {
            newID = IDGenerator.getNewID(CommonConstants.ITEM_TABLE_NAME,
                    CommonConstants.ITEM_TABLE_COL_NAME,CommonConstants.ITEM_ID_PREFIX);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }
}

package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Item;
import com.chamodshehanka.heshanhardware.service.custom.ItemService;
import com.chamodshehanka.heshanhardware.util.DBConnectionUtil;
import com.chamodshehanka.heshanhardware.util.IDGenarator;

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

    @Override
    public boolean add(Item item) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO item VALUES (?,?,?,?,?)");

            preparedStatement.setObject(1, item.getItemCode());
            preparedStatement.setObject(2, item.getItemDescription());
            preparedStatement.setObject(3, item.getItemBrand());
            preparedStatement.setObject(4, item.getUnitPrice());
            preparedStatement.setObject(5, item.getQty());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Item getByID(String itemCode) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM item WHERE item_code = ?");
            preparedStatement.setObject(1, itemCode);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                Item item = new Item(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getInt(5)
                );
                return item;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(String itemCode, Item item) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection
                    .prepareStatement(
                            "UPDATE item SET item_code=?,description=?,brand=?,unitprice=?,qty=? WHERE item_code='"+itemCode+"'"
                    );
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(String itemCode) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM item WHERE item_code='"+itemCode+"'");
            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM item");

            while (resultSet.next()){
                Item item = new Item(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getInt(5)
                );
                itemArrayList.add(item);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        return itemArrayList;
    }

    public String getNewID(){
        String newID = null;
        try {
            newID = IDGenarator.getNewID("item","item_code","I");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }
}

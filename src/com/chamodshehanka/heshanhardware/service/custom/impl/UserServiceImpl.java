package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.User;
import com.chamodshehanka.heshanhardware.service.custom.UserService;
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
 * @author chamodshehanka on 4/14/2019
 * @project HeshanHardware
 **/
public class UserServiceImpl implements UserService {

    public static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class.getName());
    private static Connection connection;
    private static Statement statement;
    private PreparedStatement preparedStatement;

    static {
        createUserTable();
    }

    private static void createUserTable() {
        try {
            connection = DBConnectionUtil.getDBConnection();
            statement = connection.createStatement();
            statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_USER_TABLE));
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(User user) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_USER));

            preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, user.getUserID());
            preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, user.getUserName());
            preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, user.getUserPassword());
            preparedStatement.setString(CommonConstants.COLUMN_INDEX_FOUR, user.getUserType());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User getByID(String userID) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_USER));
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, userID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new User(
                        resultSet.getString(CommonConstants.COLUMN_INDEX_ONE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_TWO),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_THREE),
                        resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR)
                );
            }
        } catch (SQLException | ClassNotFoundException | ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(String userID, User user) {
        return false;
    }

    @Override
    public boolean remove(String userID) {

        return false;
    }

    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> userArrayList = new ArrayList<>();
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_ALL_USERS));

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                User user = new User();
                user.setUserID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
                user.setUserName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
                user.setUserPassword(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
                user.setUserType(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));

                userArrayList.add(user);
            }

        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null){
                    preparedStatement.close();
                }
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return userArrayList;
    }

    @Override
    public String getNewID() {
        String newID = null;
        try {
            newID = IDGenerator.getNewID(CommonConstants.USER_TABLE_NAME,
                    CommonConstants.USER_TABLE_COL_NAME,CommonConstants.USER_ID_PREFIX);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }


}

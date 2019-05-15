package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.User;
import com.chamodshehanka.heshanhardware.service.custom.UserService;
import com.chamodshehanka.heshanhardware.util.DBConnectionUtil;
import com.chamodshehanka.heshanhardware.util.IDGenerator;

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

    @Override
    public boolean add(User user) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO user VALUES (?,?,?,?)");

            preparedStatement.setString(1, user.getUserID());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getUserPassword());
            preparedStatement.setString(4, user.getUserType());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User getByID(String userID) {
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
            preparedStatement = connection.prepareStatement("SELECT * FROM user");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                User user = new User();
                user.setUserID(resultSet.getString(1));
                user.setUserName(resultSet.getString(2));
                user.setUserPassword(resultSet.getString(3));
                user.setUserType(resultSet.getString(4));

                userArrayList.add(user);
            }

        } catch (SQLException | ClassNotFoundException e) {
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
            newID = IDGenerator.getNewID("user","user_id","U");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }


}

package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.User;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.UserService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/17/2019
 * @project HeshanHardware
 **/
public class UserController {

    public static boolean addUser(User user){
        UserService userService = (UserService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.USER);
        return userService.add(user);
    }

    public static boolean updateUser(User user){
        UserService userService = (UserService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.USER);
        return userService.update(user.getUserID(), user);
    }

    public static boolean removeUser(String userID){
        UserService userService = (UserService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.USER);
        return userService.remove(userID);
    }

    public static User getUserByID(String userID){
        UserService userService = (UserService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.USER);
        return userService.getByID(userID);
    }

    public static ArrayList<User> getAllUsers(){
        UserService userService = (UserService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.USER);
        return userService.getAll();
    }

    public static String getNewUserID(){
        UserService userService = (UserService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.USER);
        return userService.getNewID();
    }

}

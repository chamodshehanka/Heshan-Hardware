package com.chamodshehanka.heshanhardware.model;

/**
 * @author chamodshehanka on 4/14/2019
 * @project HeshanHardware
 **/
public class
User {

    private String userID;
    private String userName;
    private String userPassword;
    private String userType;

    public User() {
    }

    public User(String userID, String userName, String userPassword, String userType) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

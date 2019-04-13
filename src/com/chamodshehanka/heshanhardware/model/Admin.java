package com.chamodshehanka.heshanhardware.model;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class Admin {

    private String adminID;
    private String userName;
    private String password;

    public Admin() {
    }

    public Admin(String adminID, String userName, String password) {
        this.adminID = adminID;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

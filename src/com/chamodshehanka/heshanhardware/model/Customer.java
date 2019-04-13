package com.chamodshehanka.heshanhardware.model;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class Customer {

    private String customerID;
    private String name;
    private String gender;
    private String address;
    private int phone;

    public Customer() {
    }

    public Customer(String customerID, String name, String gender, String address, int phone) {
        this.customerID = customerID;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

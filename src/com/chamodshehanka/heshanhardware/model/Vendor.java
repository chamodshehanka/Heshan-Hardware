package com.chamodshehanka.heshanhardware.model;

/**
 * @author chamodshehanka on 5/14/2019
 * @project HeshanHardware
 **/
public class Vendor {

    private String vendorID;
    private String name;
    private String type;
    private int phone;
    private String email;

    public Vendor() {
    }

    public Vendor(String vendorID, String name, String type, int phone, String email) {
        this.vendorID = vendorID;
        this.name = name;
        this.type = type;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorID='" + vendorID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

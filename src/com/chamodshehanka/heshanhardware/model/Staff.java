package com.chamodshehanka.heshanhardware.model;

public class Staff {
    private String staffID;
    private String name;
    private int phone;
    private String email;
    private String type;

    public Staff() {
    }

    public Staff(String staffID, String name, int phone, String email, String type) {
        this.staffID = staffID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID='" + staffID + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


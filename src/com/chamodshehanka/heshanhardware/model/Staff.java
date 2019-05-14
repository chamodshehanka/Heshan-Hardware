package com.chamodshehanka.heshanhardware.model;

public class Staff {
    private String Staff_ID;
    private String Name;
    private int Phone_No;
    private String Email;
    private String Type;

    public Staff(String staff_ID, String name, int phone_No, String email, String type) {
        Staff_ID = staff_ID;
        Name = name;
        Phone_No = phone_No;
        Email = email;
        Type = type;
    }

    public String toString() {
        return "Staff{" +
                "Staff_ID='" + Staff_ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Phone_No='" + Phone_No + '\'' +
                ", Email=" + Email +
                '}';
    }

    public String getStaff_ID() { return Staff_ID; }

    public void setStaff_ID(String staff_ID) { Staff_ID = staff_ID; }

    public String getName() { return Name; }

    public void setName(String name) { Name = name; }

    public int getPhone_No() { return Phone_No; }

    public void setPhone_No(int phone_No) { Phone_No = phone_No; }

    public String getEmail() { return Email; }

    public void setEmail(String email) { Email = email; }

    public String getType() { return Type; }

    public void setType(String type) { Type = type; }
}


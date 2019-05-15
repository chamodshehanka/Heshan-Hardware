package com.chamodshehanka.heshanhardware.model;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class Order {
    private String orderID;
    private String orderDate;
    private String customerID;

    private ArrayList<OrderDetail> orderDetailArrayList;

    public Order() {
    }

    public Order(String orderID, String orderDate, String customerID, ArrayList<OrderDetail> orderDetailArrayList) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.orderDetailArrayList = orderDetailArrayList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", orderDetailArrayList=" + orderDetailArrayList +
                '}';
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public ArrayList<OrderDetail> getOrderDetailArrayList() {
        return orderDetailArrayList;
    }

    public void setOrderDetailArrayList(ArrayList<OrderDetail> orderDetailArrayList) {
        this.orderDetailArrayList = orderDetailArrayList;
    }
}

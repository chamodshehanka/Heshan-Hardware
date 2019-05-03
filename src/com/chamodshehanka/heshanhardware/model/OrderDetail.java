package com.chamodshehanka.heshanhardware.model;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class OrderDetail {
    private String orderID;
    private String itemCode;
    private int itemQty;
    private double itemUnitPrice;

    public OrderDetail() {
    }

    public OrderDetail(String orderID, String itemCode, int itemQty, double itemUnitPrice) {
        this.orderID = orderID;
        this.itemCode = itemCode;
        this.itemQty = itemQty;
        this.itemUnitPrice = itemUnitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderID='" + orderID + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemQty=" + itemQty +
                ", itemUnitPrice=" + itemUnitPrice +
                '}';
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(double itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }
}

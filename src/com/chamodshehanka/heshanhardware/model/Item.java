package com.chamodshehanka.heshanhardware.model;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class Item {
    private String itemCode;
    private String itemDescription;
    private String itemBrand;
    private double unitPrice;
    private int qty;

    public Item() {
    }

    public Item(String itemCode, String itemDescription, String itemBrand, double unitPrice, int qty) {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemBrand = itemBrand;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemBrand='" + itemBrand + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                '}';
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

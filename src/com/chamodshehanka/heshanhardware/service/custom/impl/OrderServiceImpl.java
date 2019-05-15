package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Order;
import com.chamodshehanka.heshanhardware.service.custom.OrderService;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class OrderServiceImpl implements OrderService {

    @Override
    public boolean add(Order order) {
        return false;
    }

    @Override
    public Order getByID(String orderID) {
        return null;
    }

    @Override
    public boolean update(String orderID, Order order) {
        return false;
    }

    @Override
    public boolean remove(String orderID) {
        return false;
    }

    @Override
    public ArrayList<Order> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        return null;
    }
}

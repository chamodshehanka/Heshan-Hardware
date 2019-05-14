package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.OrderDetail;
import com.chamodshehanka.heshanhardware.service.custom.OrderDetailService;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class OrderDetailServiceImpl implements OrderDetailService {

    @Override
    public boolean add(OrderDetail orderDetail) {
        return false;
    }

    @Override
    public OrderDetail getByID(String s) {
        return null;
    }

    @Override
    public boolean update(String s, OrderDetail orderDetail) {
        return false;
    }

    @Override
    public boolean remove(String s) {
        return false;
    }

    @Override
    public ArrayList<OrderDetail> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        return null;
    }
}

package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.OrderDetail;
import com.chamodshehanka.heshanhardware.service.custom.impl.OrderDetailServiceImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/18/2019
 * @project HeshanHardware
 **/
public class OrderDetailController {

    private static OrderDetailServiceImpl orderDetailService;

    public static boolean addOrderDetail(ArrayList<OrderDetail> orderDetailArrayList){
        orderDetailService = new OrderDetailServiceImpl();
        return orderDetailService.addOrderDetails(orderDetailArrayList);
    }

    public static boolean updateOrderDetail(ArrayList<OrderDetail> orderDetailArrayList){
        orderDetailService = new OrderDetailServiceImpl();
        return false;
    }

    public static boolean removeOrderDetail(ArrayList<OrderDetail> orderDetailArrayList){
        orderDetailService = new OrderDetailServiceImpl();
        return false;
    }

    public static ArrayList<OrderDetail> getOrderDetailByID(String orderID){
        orderDetailService = new OrderDetailServiceImpl();
        return orderDetailService.getOrderAllDetailByID(orderID);
    }

}

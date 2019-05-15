package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.Order;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.OrderService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/15/2019
 * @project HeshanHardware
 **/
public class OrderController {

    public static boolean addOrder(Order order){
        OrderService orderService = (OrderService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.add(order);
    }

    public static boolean updateOrder(Order order) {
        OrderService orderService = (OrderService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.update(order.getCustomerID(), order);
    }

    public static boolean removeOrder(String orderID) {
        OrderService orderService = (OrderService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.remove(orderID);
    }

    public static Order getOrderByID(String orderID) {
        OrderService orderService = (OrderService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.getByID(orderID);
    }

    public static ArrayList<Order> getAllOrders() {
        OrderService orderService = (OrderService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.getAll();
    }

    public static String getNewOrderID(){
        OrderService orderService = (OrderService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ORDER);
        return orderService.getNewID();
    }

}

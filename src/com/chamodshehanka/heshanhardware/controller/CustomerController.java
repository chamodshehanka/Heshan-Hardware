package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.Customer;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.CustomerService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/15/2019
 * @project HeshanHardware
 **/
public class CustomerController {

    public static boolean addCustomer(Customer customer){
        CustomerService customerService = (CustomerService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.add(customer);
    }

    public static boolean updateCustomer(Customer customer){
        CustomerService customerService = (CustomerService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.update(customer.getCustomerID(), customer);
    }

    public static boolean removeCustomer(String customerID) {
        CustomerService customerService = (CustomerService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.remove(customerID);
    }

    public static Customer getCustomerByID(String customerID){
        CustomerService customerService = (CustomerService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.getByID(customerID);
    }

    public static ArrayList<Customer> getAllCustomers(){
        CustomerService customerService = (CustomerService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.getAll();
    }

    public static String getNewCustomerID(){
        CustomerService customerService = (CustomerService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.getNewID();
    }

}

package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Customer;
import com.chamodshehanka.heshanhardware.service.custom.CustomerService;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class CustomerServiceImpl implements CustomerService {

    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public Customer getByID(String s) {
        return null;
    }

    @Override
    public boolean update(String s, Customer customer) {
        return false;
    }

    @Override
    public boolean remove(String s) {
        return false;
    }

    @Override
    public ArrayList<Customer> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        return null;
    }
}

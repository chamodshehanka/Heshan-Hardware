package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Vendor;
import com.chamodshehanka.heshanhardware.util.IDGenerator;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author surangamahesh on 5/14/2019
 * @project HeshanHardware
 **/

public class VendorServiceImpl implements VendorService {

    @Override
    public boolean add(Vendor vendor) { return false; }

    @Override
    public Vendor getByID( String s ) { return null; }

    @Override
    public boolean update( String s, Vendor vendor) { return false; }

    @Override
    public boolean remove( String s ) { return false; }

    @Override
    public ArrayList<Vendor> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        String newID = null;
        try {
            newID = IDGenerator.getNewID("Vendor", "Vendor_ID", "V");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }

}
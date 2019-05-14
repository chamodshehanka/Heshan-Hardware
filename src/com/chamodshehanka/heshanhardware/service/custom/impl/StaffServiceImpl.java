package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Staff;
import com.chamodshehanka.heshanhardware.util.IDGenerator;

import java.sql.SQLException;
import java.util.ArrayList;



/**
 * @author surangamahesh on 5/14/2019
 * @project HeshanHardware
 **/


public class StaffServiceImpl implements StaffService {

    @Override
    public boolean add( Staff staff ) { return false; }

    @Override
    public boolean update( String s, Staff staff ) { return false; }

    @Override
    public boolean remove( String s ) { return false; }

    @Override
    public Staff getByID( String s ) { return null; }


    @Override
    public ArrayList<Staff> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        String newID = null;
        try {
            newID = IDGenerator.getNewID("Staff", "Staff_ID", "S");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }


}

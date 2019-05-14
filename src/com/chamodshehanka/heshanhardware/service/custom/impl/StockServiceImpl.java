package com.chamodshehanka.heshanhardware.service.custom.impl;


import com.chamodshehanka.heshanhardware.model.Stock;
import com.chamodshehanka.heshanhardware.service.custom.StockService;
import com.chamodshehanka.heshanhardware.util.IDGenerator;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author surangamahesh on 5/14/2019
 * @project HeshanHardware
 *
*/

public class StockServiceImpl implements StockService {

    @Override
    public boolean add( Stock stock ) { return false; }

    @Override
    public boolean update( String s, Stock stock ) { return false; }

    @Override
    public boolean remove( String s ) { return false; }

    @Override
    public Stock getByID( String s ) { return null; }


    @Override
    public ArrayList<Stock> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        String newID = null;
        try {
            newID = IDGenerator.getNewID("Stock", "Stock_ID", "S");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newID;
    }

}

package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.Admin;
import com.chamodshehanka.heshanhardware.service.custom.AdminService;
import com.chamodshehanka.heshanhardware.util.CommonConstants;
import com.chamodshehanka.heshanhardware.util.CommonUtil;
import com.chamodshehanka.heshanhardware.util.DBConnectionUtil;
import com.chamodshehanka.heshanhardware.util.QueryUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class AdminServiceImpl implements AdminService {

    public static final Logger LOGGER = Logger.getLogger(AdminServiceImpl.class.getName());
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;


    @Override
    public boolean add(Admin admin) {
        return false;
    }

    @Override
    public Admin getByID(String s) {
        return null;
    }

    @Override
    public boolean update(String s, Admin admin) {
        return false;
    }

    @Override
    public boolean remove(String s) {
        return false;
    }

    @Override
    public ArrayList<Admin> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        return null;
    }
}

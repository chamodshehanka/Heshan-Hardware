package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.Admin;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.AdminService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/15/2019
 * @project HeshanHardware
 **/
public class AdminController {

    public static boolean addAdmin(Admin admin)throws Exception{
        AdminService adminService = (AdminService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ADMIN);
        return adminService.add(admin);
    }

    public static boolean updateAdmin(Admin admin)throws Exception{
        AdminService adminService = (AdminService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ADMIN);
        return adminService.update(admin.getAdminID(), admin);
    }

    public static boolean removeAdmin(String adminID)throws Exception{
        AdminService adminService = (AdminService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ADMIN);
        return adminService.remove(adminID);
    }

    public static Admin getAdminByID(String adminID)throws Exception{
        AdminService adminService = (AdminService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ADMIN);
        return adminService.getByID(adminID);
    }

    public static ArrayList<Admin> getAllAdmins()throws Exception{
        AdminService adminService = (AdminService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ADMIN);
        return adminService.getAll();
    }

    public static String getNewAdminID()throws Exception{
        AdminService adminService = (AdminService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ADMIN);
        return adminService.getNewID();
    }

}

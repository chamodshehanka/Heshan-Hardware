package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.Staff;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.StaffService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/17/2019
 * @project HeshanHardware
 **/
public class StaffController {

    public static boolean addStaff(Staff staff){
        StaffService staffService = (StaffService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.STAFF);
        return staffService.add(staff);
    }

    public static boolean updateStaff(Staff staff){
        StaffService staffService = (StaffService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.STAFF);
        return staffService.update(staff.getStaffID(), staff);
    }

    public static boolean removeStaff(String staffID){
        StaffService staffService = (StaffService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.STAFF);
        return staffService.remove(staffID);
    }

    public static Staff getStaffByID(String staffID){
        StaffService staffService = (StaffService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.STAFF);
        return staffService.getByID(staffID);
    }

    public static ArrayList<Staff> getAllStaff(){
        StaffService staffService = (StaffService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.STAFF);
        return staffService.getAll();
    }

    public static String getNewStaffID(){
        StaffService staffService = (StaffService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.STAFF);
        return staffService.getNewID();
    }

}

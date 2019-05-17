package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.Staff;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.StaffService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

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



}

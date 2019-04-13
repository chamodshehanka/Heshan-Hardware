package com.chamodshehanka.heshanhardware.service.impl;

import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.SuperService;
import com.chamodshehanka.heshanhardware.service.custom.impl.AdminServiceImpl;
import com.chamodshehanka.heshanhardware.service.custom.impl.EmployeeServiceImpl;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class ServiceFactoryImpl implements ServiceFactory {

    private static ServiceFactory serviceFactory;

    public ServiceFactoryImpl() {
    }

    public static ServiceFactory getInstance(){
        if (serviceFactory == null)
            serviceFactory = new ServiceFactoryImpl();
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceType serviceType) throws Exception {
        switch (serviceType){
            case ADMIN: return new AdminServiceImpl();
            case CUSTOMER:
            case EMPLOYEE: return new EmployeeServiceImpl();
            default: return null;
        }
    }

}

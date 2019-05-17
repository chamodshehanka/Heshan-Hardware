package com.chamodshehanka.heshanhardware.service.impl;

import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.SuperService;
import com.chamodshehanka.heshanhardware.service.custom.impl.*;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class ServiceFactoryImpl implements ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactoryImpl() {
    }

    public static ServiceFactory getInstance(){
        if (serviceFactory == null)
            serviceFactory = new ServiceFactoryImpl();
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceType serviceType) {
        switch (serviceType){
            case ADMIN: return new AdminServiceImpl();
            case CUSTOMER: return new CustomerServiceImpl();
            case EMPLOYEE: return new EmployeeServiceImpl();
            case ITEM: return new ItemServiceImpl();
            case ORDER: return new OrderServiceImpl();
            case ORDER_DETAIL: return new OrderDetailServiceImpl();
            case STAFF: return new StaffServiceImpl();
            case USER: return new UserServiceImpl();
            case VENDOR: return new VendorServiceImpl();
            default: return null;
        }
    }

}

package com.chamodshehanka.heshanhardware.service;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public interface ServiceFactory {

    public enum ServiceType {
        ADMIN, CUSTOMER, EMPLOYEE, ITEM, ORDER, ORDERDETAIL
    }

    public SuperService getService(ServiceType serviceType)throws Exception;
}

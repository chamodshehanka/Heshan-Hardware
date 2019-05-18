package com.chamodshehanka.heshanhardware.service;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public interface ServiceFactory {

    public enum ServiceType {
        ADMIN, CUSTOMER, ITEM, ORDER, ORDER_DETAIL, STAFF, USER, VENDOR
    }

    public SuperService getService(ServiceType serviceType);
}

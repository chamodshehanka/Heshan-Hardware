package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.Vendor;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.VendorService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/15/2019
 * @project HeshanHardware
 **/
public class VendorController {

    public static boolean addVendor(Vendor vendor) {
        VendorService vendorService = (VendorService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.VENDOR);
        return vendorService.add(vendor);
    }

    public static boolean updateVendor(Vendor vendor) {
        VendorService vendorService = (VendorService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.VENDOR);
        return vendorService.update(vendor.getVendorID(), vendor);
    }

    public static boolean removeVendor(String vendorID) {
        VendorService vendorService = (VendorService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.VENDOR);
        return vendorService.remove(vendorID);
    }

    public static Vendor getVendorByID(String vendorID) {
        VendorService vendorService = (VendorService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.VENDOR);
        return vendorService.getByID(vendorID);
    }

    public static ArrayList<Vendor> getAllVendors() {
        VendorService vendorService = (VendorService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.VENDOR);
        return vendorService.getAll();
    }

    public static String getNewVendorID() {
        VendorService vendorService = (VendorService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.VENDOR);
        return vendorService.getNewID();
    }

}

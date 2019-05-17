package com.chamodshehanka.heshanhardware.controller;

import com.chamodshehanka.heshanhardware.model.Item;
import com.chamodshehanka.heshanhardware.service.ServiceFactory;
import com.chamodshehanka.heshanhardware.service.custom.ItemService;
import com.chamodshehanka.heshanhardware.service.impl.ServiceFactoryImpl;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/17/2019
 * @project HeshanHardware
 **/
public class ItemController {

    public static boolean addItem(Item item){
        ItemService itemService = (ItemService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ITEM);
        return itemService.add(item);
    }

    public static boolean updateItem(Item item){
        ItemService itemService = (ItemService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ITEM);
        return itemService.update(item.getItemCode(), item);
    }

    public static boolean removeItem(String itemCode){
        ItemService itemService = (ItemService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ITEM);
        return itemService.remove(itemCode);
    }

    public static Item getItemByID(String itemCode){
        ItemService itemService = (ItemService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ITEM);
        return itemService.getByID(itemCode);
    }

    public static ArrayList<Item> getAllItems(){
        ItemService itemService = (ItemService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ITEM);
        return itemService.getAll();
    }

    public static String getNewItemCode(){
        ItemService itemService = (ItemService) ServiceFactoryImpl.getInstance()
                .getService(ServiceFactory.ServiceType.ITEM);
        return itemService.getNewID();
    }

}

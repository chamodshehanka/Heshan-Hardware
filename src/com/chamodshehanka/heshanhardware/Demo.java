package com.chamodshehanka.heshanhardware;

import com.chamodshehanka.heshanhardware.controller.StaffController;
import com.chamodshehanka.heshanhardware.model.Staff;

/**
 * @author chamodshehanka on 5/14/2019
 * @project HeshanHardware
 **/
//This class for just testing purposes
public class Demo {
    public static void main(String[] args) {
        boolean isAdded = StaffController.addStaff(
                new Staff("S002","Azula",55555,
                        "azula@fire.com","Cashier"));
        System.out.println(isAdded);
    }
}

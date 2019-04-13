package com.chamodshehanka.heshanhardware.util;

import com.chamodshehanka.heshanhardware.service.custom.IEmployeeService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class CommonUtil {

    public static final Logger log = Logger.getLogger(IEmployeeService.class.getName());

    public static final Properties properties = new Properties();

    static {
        try {
            properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String generateIDs(ArrayList<String> arrayList) {

        String id;
        int next = arrayList.size();
        next++;
        id = CommonConstants.EMPLOYEE_ID_PREFIX + next;
        if (arrayList.contains(id)) {
            next++;
            id = CommonConstants.EMPLOYEE_ID_PREFIX + next;
        }
        return id;
    }
}

package com.chamodshehanka.heshanhardware.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class CommonUtil {

    public static final Properties properties = new Properties();

    static {
        try {
            properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

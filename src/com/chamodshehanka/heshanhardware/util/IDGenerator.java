package com.chamodshehanka.heshanhardware.util;

import java.sql.SQLException;

/**
 * @author chamodshehanka on 5/7/2019
 * @project HeshanHardware
 **/
public class IDGenerator {

    public static String getNewID(String tblName, String colName, String prefix) throws SQLException, ClassNotFoundException {
        String lastID = IDController.getLastID(tblName, colName);
        String newID;

        if (lastID != null){
            StringBuilder ID = new StringBuilder();
            char[] reg = lastID.toCharArray();
            for(int i=1;i<reg.length;i++){
                ID.append(reg[i]);
            }
            int r = Integer.parseInt(ID.toString());
            if(r<9){
                newID = prefix+"00"+(r+1);
            }else if(r < 99){
                newID = prefix+"0"+(r+1);
            }else
                newID = prefix+(r+1);
        }else {
            newID = prefix + "001";
        }
        return newID;
    }

}

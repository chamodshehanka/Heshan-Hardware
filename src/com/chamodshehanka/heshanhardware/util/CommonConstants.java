package com.chamodshehanka.heshanhardware.util;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class CommonConstants {

    /** Constant for config.properties key for query file path */
    public static final String QUERY_XML = "queryFilePath";

    /** Constant for file path of config.properties */
    public static final String PROPERTY_FILE = "config.properties";

    /** Constant for query tag in DBQuery.xml */
    public static final String TAG_NAME = "query";

    /** Constant for query id in DBQuery.xml */
    public static final String ATTRIB_ID = "id";

    /** Constant for employee id prefix */
    public static final String ADMIN_ID_PREFIX = "A";
    public static final String CUSTOMER_ID_PREFIX = "C";
    public static final String EMPLOYEE_ID_PREFIX = "E";
    public static final String ITEM_ID_PREFIX = "I";
    public static final String ORDERDETAIL_ID_PREFIX = "";
    public static final String ORDER_ID_PREFIX = "A";

    /** Constant for comma */
    public static final String COMMA = ",";

    /** Constant for url key of MySQL database in config.properties */
    public static final String URL = "url";

    /** Constant for user name key of MySQL database in config.properties */
    public static final String USERNAME = "username";

    /** Constant for password key of MySQL database in config.properties */
    public static final String PASSWORD = "password";

    /** Constant for driver name key of MySQL database in config.properties */
    public static final String DRIVER_NAME = "driverName";

    /** Constant for query id of drop_table in DBQuery.xml */
    public static final String QUERY_ID_DROP_TABLE = "drop_table";

    /** Constant for query id of create_table in DBQuery.xml */
    public static final String QUERY_ID_CREATE_TABLE = "create_employee_table";

    /** Constant for query id of insert employees in DBQuery.xml */
    public static final String QUERY_ID_INSERT_EMPLOYEES = "insert_employee";

    /** Constant for query id of get an employee in DBQuery.xml */
    public static final String QUERY_ID_GET_EMPLOYEE = "employee_by_id";

    /** Constant for query id of get all employees in DBQuery.xml */
    public static final String QUERY_ID_ALL_EMPLOYEES = "all_employees";

    /** Constant for query id of remove a employee in DBQuery.xml */
    public static final String QUERY_ID_REMOVE_EMPLOYEE = "remove_employee";

    /** Constant for query id of update a employee in DBQuery.xml */
    public static final String QUERY_ID_UPDATE_EMPLOYEE = "update_employee";

    /** Constant for query id of get all employee ids in DBQuery.xml */
    public static final String QUERY_ID_GET_EMPLOYEE_IDS = "employee_ids";

    /** Constant for Column index one */
    public static final int COLUMN_INDEX_ONE = 1;

    /** Constant for Column index two */
    public static final int COLUMN_INDEX_TWO = 2;

    /** Constant for Column index three */
    public static final int COLUMN_INDEX_THREE = 3;

    /** Constant for Column index four */
    public static final int COLUMN_INDEX_FOUR = 4;

    /** Constant for Column index five */
    public static final int COLUMN_INDEX_FIVE = 5;

    /** Constant for Column index six */
    public static final int COLUMN_INDEX_SIX = 6;

    /** Constant for Column index seven */
    public static final int COLUMN_INDEX_SEVEN = 7;

    /** Constant for Column index eight */
    public static final int COLUMN_INDEX_EIGHT = 8;

    public static final String QUERY_ID_INSERT_ADMIN = "admin_ids";

    public static final String QUERY_ID_INSERT_CUSTOMER = "insert_customer";
    public static final String QUERY_ID_GET_CUSTOMER = "customer_by_id";
    public static final String QUERY_ID_UPDATE_CUSTOMER = "update_customer";
    public static final String QUERY_ID_REMOVE_CUSTOMER = "remove_customer";
    public static final String QUERY_ID_GET_ALL_CUSTOMERS = "all_customers";

    public static final String QUERY_ID_INSERT_VENDOR = "insert_vendor";
    public static final String QUERY_ID_GET_VENDOR = "vendor_by_id";
    public static final String QUERY_ID_UPDATE_VENDOR = "update_vendor";
    public static final String QUERY_ID_REMOVE_VENDOR = "remove_vendor";
    public static final String QUERY_ID_GET_ALL_VENDORS = "all_vendors";
}

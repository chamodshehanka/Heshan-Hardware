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

    public static final String ADMIN_ID_PREFIX = "A";
    public static final String ADMIN_TABLE_NAME = "admin";
    public static final String ADMIN_TABLE_COL_NAME = "admin_id";
    public static final String QUERY_ID_CREATE_ADMIN_TABLE = "create_admin_table";
    public static final String QUERY_ID_INSERT_ADMIN = "insert_admin";
    public static final String QUERY_ID_GET_ADMIN = "admin_by_id";
    public static final String QUERY_ID_UPDATE_ADMIN = "update_admin";
    public static final String QUERY_ID_REMOVE_ADMIN = "remove_admin";
    public static final String QUERY_ID_GET_ALL_ADMINS = "all_admins";

    public static final String CUSTOMER_ID_PREFIX = "C";
    public static final String CUSTOMER_TABLE_NAME = "customer";
    public static final String CUSTOMER_TABLE_COL_NAME = "customer_id";
    public static final String QUERY_ID_CREATE_CUSTOMER_TABLE = "create_customer_table";
    public static final String QUERY_ID_INSERT_CUSTOMER = "insert_customer";
    public static final String QUERY_ID_GET_CUSTOMER = "customer_by_id";
    public static final String QUERY_ID_UPDATE_CUSTOMER = "update_customer";
    public static final String QUERY_ID_REMOVE_CUSTOMER = "remove_customer";
    public static final String QUERY_ID_GET_ALL_CUSTOMERS = "all_customers";

    public static final String ITEM_ID_PREFIX = "I";
    public static final String ITEM_TABLE_NAME = "item";
    public static final String ITEM_TABLE_COL_NAME = "item_code";
    public static final String QUERY_ID_CREATE_ITEM_TABLE = "create_item_table";
    public static final String QUERY_ID_INSERT_ITEM = "insert_item";
    public static final String QUERY_ID_GET_ITEM = "item_by_id";
    public static final String QUERY_ID_UPDATE_ITEM = "update_item";
    public static final String QUERY_ID_REMOVE_ITEM = "remove_item";
    public static final String QUERY_ID_GET_ALL_ITEMS = "all_items";

    public static final String ORDER_ID_PREFIX = "O";
    public static final String ORDER_TABLE_NAME = "orders";
    public static final String ORDER_TABLE_COL_NAME = "order_id";
    public static final String QUERY_ID_CREATE_ORDER_TABLE = "create_order_table";
    public static final String QUERY_ID_INSERT_ORDER = "insert_order";
    public static final String QUERY_ID_GET_ORDER = "order_by_id";
    public static final String QUERY_ID_UPDATE_ORDER = "update_order";
    public static final String QUERY_ID_REMOVE_ORDER = "remove_order";
    public static final String QUERY_ID_GET_ALL_ORDERS = "all_orders";

    public static final String QUERY_ID_CREATE_ORDER_DETAIL_TABLE = "create_order_detail_table";
    public static final String QUERY_ID_INSERT_ORDER_DETAIL = "insert_order_detail";
    public static final String QUERY_ID_GET_ORDER_DETAIL = "order_detail_by_id";
    public static final String QUERY_ID_UPDATE_ORDER_DETAIL = "update_order_detail";
    public static final String QUERY_ID_REMOVE_ORDER_DETAIL = "remove_order_detail";
    public static final String QUERY_ID_GET_ALL_ORDER_DETAILS = "all_order_details";
    public static final String QUERY_ID_GET_ALL_ORDER_DETAILS_BY_ID = "all_order_details_by_id";

    public static final String STAFF_ID_PREFIX = "S";
    public static final String STAFF_TABLE_NAME = "staff";
    public static final String STAFF_TABLE_COL_NAME = "staff_id";
    public static final String QUERY_ID_CREATE_STAFF_TABLE = "create_staff_table";
    public static final String QUERY_ID_INSERT_STAFF = "insert_staff";
    public static final String QUERY_ID_GET_STAFF = "staff_by_id";
    public static final String QUERY_ID_UPDATE_STAFF = "update_staff";
    public static final String QUERY_ID_REMOVE_STAFF = "remove_staff";
    public static final String QUERY_ID_GET_ALL_STAFF = "all_staff";

    public static final String STOCK_ID_PREFIX = "S";
    public static final String STOCK_TABLE_NAME = "stock";
    public static final String STOCK_TABLE_COL_NAME = "stock_id";
    public static final String QUERY_ID_CREATE_STOCK_TABLE = "create_stock_table";
    public static final String QUERY_ID_INSERT_STOCK = "insert_stock";
    public static final String QUERY_ID_GET_STOCK = "stock_by_id";
    public static final String QUERY_ID_UPDATE_STOCK = "update_stock";
    public static final String QUERY_ID_REMOVE_STOCK = "remove_stock";
    public static final String QUERY_ID_GET_ALL_STOCK = "all_stock";

    public static final String USER_ID_PREFIX = "U";
    public static final String USER_TABLE_NAME = "user";
    public static final String USER_TABLE_COL_NAME = "user_id";
    public static final String QUERY_ID_CREATE_USER_TABLE = "create_user_table";
    public static final String QUERY_ID_INSERT_USER = "insert_user";
    public static final String QUERY_ID_GET_USER = "user_by_id";
    public static final String QUERY_ID_UPDATE_USER = "update_user";
    public static final String QUERY_ID_REMOVE_USER = "remove_user";
    public static final String QUERY_ID_GET_ALL_USERS = "all_users";

    public static final String VENDOR_ID_PREFIX = "V";
    public static final String VENDOR_TABLE_NAME = "vendor";
    public static final String VENDOR_TABLE_COL_NAME = "vendor_id";
    public static final String QUERY_ID_CREATE_VENDOR_TABLE = "create_vendor_table";
    public static final String QUERY_ID_INSERT_VENDOR = "insert_vendor";
    public static final String QUERY_ID_GET_VENDOR = "vendor_by_id";
    public static final String QUERY_ID_UPDATE_VENDOR = "update_vendor";
    public static final String QUERY_ID_REMOVE_VENDOR = "remove_vendor";
    public static final String QUERY_ID_GET_ALL_VENDORS = "all_vendors";

}

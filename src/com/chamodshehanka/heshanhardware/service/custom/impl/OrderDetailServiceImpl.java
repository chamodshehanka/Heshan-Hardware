package com.chamodshehanka.heshanhardware.service.custom.impl;

import com.chamodshehanka.heshanhardware.model.OrderDetail;
import com.chamodshehanka.heshanhardware.service.custom.OrderDetailService;
import com.chamodshehanka.heshanhardware.util.CommonConstants;
import com.chamodshehanka.heshanhardware.util.DBConnectionUtil;
import com.chamodshehanka.heshanhardware.util.QueryUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailServiceImpl orderDetailService;
    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;

    public OrderDetailServiceImpl(){
        orderDetailService = new OrderDetailServiceImpl();
    }

    public boolean addOrderDetails(ArrayList<OrderDetail> orderDetailArrayList){
        for (OrderDetail orderDetail: orderDetailArrayList
             ) {
            boolean isUpdated = orderDetailService.add(orderDetail);
            if (!isUpdated){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean add(OrderDetail orderDetail) {
        try {
            connection = DBConnectionUtil.getDBConnection();
            preparedStatement = connection.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_ORDER_DETAIL));

            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_ONE, orderDetail.getOrderID());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_TWO, orderDetail.getItemCode());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_THREE, orderDetail.getItemQty());
            preparedStatement.setObject(CommonConstants.COLUMN_INDEX_FOUR, orderDetail.getItemUnitPrice());

            return 0 < preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public OrderDetail getByID(String s) {
        return null;
    }

    @Override
    public boolean update(String s, OrderDetail orderDetail) {
        return false;
    }

    @Override
    public boolean remove(String s) {
        return false;
    }

    @Override
    public ArrayList<OrderDetail> getAll() {
        return null;
    }

    @Override
    public String getNewID() {
        return null;
    }
}

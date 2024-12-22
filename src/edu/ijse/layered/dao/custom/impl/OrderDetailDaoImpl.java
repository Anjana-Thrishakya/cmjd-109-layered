/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.OrderDetailDao;
import edu.ijse.layered.entity.OrderDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author anjana
 */
public class OrderDetailDaoImpl implements OrderDetailDao{

    @Override
    public boolean save(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orderDetail VALUES (?,?,?,?)", t.getOrderId(), t.getItemCode(), t.getQty(), t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public OrderDetailEntity search(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
        return null;
    }
    
}

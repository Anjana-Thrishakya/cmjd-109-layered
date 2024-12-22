/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;

import edu.ijse.layered.dao.custom.impl.ItemDaoImpl;
import edu.ijse.layered.dao.custom.impl.OrderDaoImpl;
import edu.ijse.layered.dao.custom.impl.OrderDetailDaoImpl;

/**
 *
 * @author anjan
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case OLRDER_DETAIL:
                return new OrderDetailDaoImpl();
            case CUSTOMER:
                return null;
            default:
                throw new AssertionError();
        }
    }
    
    public enum DaoTypes{
        ITEM, CUSTOMER, ORDER, OLRDER_DETAIL
    }
}

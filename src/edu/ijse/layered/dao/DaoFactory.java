/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;

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
                return null;
            case ORDER:
                return null;
            case OLRDER_DETAIL:
                return null;
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
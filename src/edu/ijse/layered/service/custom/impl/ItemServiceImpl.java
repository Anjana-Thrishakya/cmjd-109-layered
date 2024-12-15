/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.dto.ItemDto;
import edu.ijse.layered.entity.ItemEntity;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    
    @Override
    public String save(ItemDto itemDto) throws Exception {
        ItemEntity entity = new ItemEntity(itemDto.getItemCode(), 
                itemDto.getDescription(), itemDto.getPackSize(),
                itemDto.getUnitPrice(), itemDto.getQoh());
        
        return itemDao.save(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(ItemDto itemDto) throws Exception {
        ItemEntity entity = new ItemEntity(itemDto.getItemCode(), 
                itemDto.getDescription(), itemDto.getPackSize(),
                itemDto.getUnitPrice(), itemDto.getQoh());
        
        return itemDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String id) throws Exception {
        return itemDao.delete(id) ? "Success" : "Fail";
    }

    @Override
    public ItemDto search(String id) throws Exception {
        ItemEntity entity = itemDao.search(id);
        return new ItemDto(entity.getItemCode(),
                entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQoh());
    }

    @Override
    public ArrayList<ItemDto> getAll() throws Exception {
        ArrayList<ItemDto> dtos = new ArrayList<>();
        ArrayList<ItemEntity> itemEntities = itemDao.getAll();
        for (ItemEntity entity : itemEntities) {
            dtos.add(new ItemDto(entity.getItemCode(),
                entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQoh()));
        }
        return dtos;
    }

}

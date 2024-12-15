/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.ItemDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class ItemController {
    
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String saveItem(ItemDto itemDto) throws Exception{
        return itemService.save(itemDto);
    }
    
    public String updateItem(ItemDto itemDto) throws Exception{
        return itemService.update(itemDto);
    }
    
    public ArrayList<ItemDto> getAll() throws Exception{
        return itemService.getAll();
    }
    
    public ItemDto searchItem(String itemCode) throws Exception{
        return itemService.search(itemCode);
    }
    
}

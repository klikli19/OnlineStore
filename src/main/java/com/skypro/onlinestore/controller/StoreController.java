package com.skypro.onlinestore.controller;

import com.skypro.onlinestore.model.Item;
import com.skypro.onlinestore.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/get")
    public List<Item> getAllItems() {
        return storeService.getAllItems();
    }

    @GetMapping("/add")
    public List addItems(@RequestParam ("id") List <Integer> id){
        return storeService.addItem(id);
    }



}

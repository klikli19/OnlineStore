package com.skypro.onlinestore.service;

import com.skypro.onlinestore.model.Item;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;



import java.util.ArrayList;
import java.util.List;


@Service
@SessionScope
public class StoreService {
    private final List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getAllItems() {
        return getItems();
    }

    public List<Item> addItem(List <Integer> id) {
        List<Item> itemList = new ArrayList<>();
        for (Integer integer: id){
            Item item = new Item(integer);
            this.items.add(item);
            itemList.add(item);
        }

        return new ArrayList<>(itemList);
    }




}

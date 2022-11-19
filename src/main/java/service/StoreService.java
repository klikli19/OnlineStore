package service;

import model.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import repository.Basket;


import java.util.LinkedList;
import java.util.List;


@Service
@Scope("Prototype")
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }


    public List<Item> getAllItems() {
        return this.basket.getItemList();
    }

    public List<Item> addItem(List <Integer> id) {
        List<Item> itemList = new LinkedList<>();
        for (Integer integer: id){
            Item item = new Item(integer);
            this.basket.addItem(item);
            itemList.add(item);
        }

        return itemList;
    }




}

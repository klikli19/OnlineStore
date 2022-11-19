package repository;

import model.Item;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.LinkedList;
import java.util.List;
@Repository
@SessionScope
public class Basket {
    private final List<Item> itemList = new LinkedList<>();


    public List<Item> getItemList() {
        return itemList;
    }


    public void addItem(Item item) {
        itemList.add(item);

    }
}

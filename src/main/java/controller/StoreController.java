package controller;

import model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.StoreService;

import java.util.List;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/order/get")
    public List<Item> getAllItems() {
        return storeService.getAllItems();
    }

    @GetMapping("/order/add")
    public List addItems(@RequestParam ("id") List <Integer> id){
        return storeService.addItem(id);
    }



}

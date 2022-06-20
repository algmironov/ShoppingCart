package pro.skystudent.shoppingcart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.skystudent.shoppingcart.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @RequestMapping("/add")
    public List<Integer> addToShoppingCart(@RequestParam List<Integer> listOfItems) {
        return shoppingCartService.addToShoppingCart(listOfItems);
    }

    @RequestMapping("/get")
    public List<Integer> getShopingCart() {
        return shoppingCartService.getShoppingCart();
    }

}

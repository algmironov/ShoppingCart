package pro.skystudent.shoppingcart.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pro.skystudent.shoppingcart.service.ShoppingCartService;
import pro.skystudent.shoppingcart.shoppingCart.ShoppingCart;

import java.util.List;

@Service
public class ShoppingCartImpl implements ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> addToShoppingCart(@RequestParam List<Integer> listOfItems) {
        return shoppingCart.addToShoppingCart(listOfItems);
    }

    @Override
    public List<Integer> getShoppingCart() {
        return shoppingCart.getShoppingCart();
    }
}

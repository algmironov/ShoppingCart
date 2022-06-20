package pro.skystudent.shoppingcart.service;

import java.util.List;

public interface ShoppingCartService {

    List<Integer> addToShoppingCart(List<Integer> listOfItems);

    List<Integer> getShoppingCart();

}

package pro.skystudent.shoppingcart.shoppingCart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer> listOfItems;

    public ShoppingCart() {
        this.listOfItems = new ArrayList<Integer>();
    }

    public List<Integer> addToShoppingCart(List<Integer> idToAdd) {
        listOfItems.addAll(idToAdd);
        return idToAdd;

    }

    public List<Integer> getShoppingCart() {
        return new ArrayList<Integer>(listOfItems);
    }

}

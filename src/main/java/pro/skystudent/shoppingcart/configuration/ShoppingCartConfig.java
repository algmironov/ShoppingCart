package pro.skystudent.shoppingcart.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.skystudent.shoppingcart.shoppingCart.ShoppingCart;

@Configuration
public class ShoppingCartConfig {

    @Bean
    @SessionScope
    public ShoppingCart createNewShoppingCart() {
        return new ShoppingCart();
    }
}

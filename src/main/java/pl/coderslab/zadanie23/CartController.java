package pl.coderslab.zadanie23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.NoSuchElementException;

@Controller
public class CartController {

    private final Cart cart;
    private final ProductDao productDao;

    public CartController(Cart cart, ProductDao productDao) {
        this.cart = cart;
        this.productDao = productDao;
    }

    @GetMapping("/addtocart/{id}/{quantity}")
    @ResponseBody
    public String addtocart(@PathVariable int id,
                            @PathVariable int quantity) {
        List<Product> productList = productDao.getList();
        Product product;
        try {
            product = productList.stream().filter(i->i.getId() == id).findFirst().get();
        } catch (NoSuchElementException e){
            return "nie ma produktu o takim ID";
        }
            cart.addToCart(new CartItem(quantity, product));
            return "Dodano do koszyka";
    }

    @RequestMapping(value = "/cart", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String cart(){
        List<CartItem> cartItems = cart.getCartItems();

        int items = cartItems.size();
        int products = 0;
        int cartValue = 0;

        for (CartItem cartItem : cartItems) {
            products += cartItem.getQuantity();
            cartValue += cartItem.getProduct().getPrice() * cartItem.getQuantity();
        }

        String sentence1 = "W koszyku jest " + items + " pozycji.\n";
        String sentence2 = "W koszyku jest " + products + " produktów \n";
        String sentence3 = "Wartość koszyka to: " + cartValue + ".\n";
        return sentence1 + sentence2 + sentence3;
    }
}

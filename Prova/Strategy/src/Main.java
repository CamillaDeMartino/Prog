import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        LocalDate data = LocalDate.of(2025,05,31);
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786",data ));
    }
}
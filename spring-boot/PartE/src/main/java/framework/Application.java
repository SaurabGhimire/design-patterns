package framework;

import framework.domain.*;
import framework.payment.VisaCardPayment;
import framework.service.ProductCatalog;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;

public class Application implements CommandLineRunner {

    public static void main(String[] args) {
    }

    @Override
    public void run(String... args) throws Exception {
        Product product1 = new Product(1, "Harry Potter", 12.0f, 100);
        Product product2 = new Product(2, "Game of Thrones", 8.0f, 100);
        Product product3 = new Product(3, "House of the Dragon", 22.0f, 100);
        Product product4 = new Product(4, "Winterfell", 7.0f, 100);

        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.addProduct(new ProductLine(product1, 100));
        productCatalog.addProduct(new ProductLine(product2, 100));
        productCatalog.addProduct(new ProductLine(product3, 100));
        productCatalog.addProduct(new ProductLine(product4, 100));

        ShoppingCart shoppingCart = new ShoppingCart(1);
        shoppingCart.addProduct(product1, 12);
        shoppingCart.addProduct(product2, 8);
        shoppingCart.addProduct(product3, 13);
        shoppingCart.addProduct(product4, 5);

        Order order = shoppingCart.checkout();
        order.setBillingAddress(new Address("farefield", "ia", "52556"));
        order.setBillingAddress(new Address("des moine", "ia", "51856"));

        order.setPaymentMethod(new VisaCardPayment(new CreditCard(1234123124, LocalDate.of(2025, 01,01))));
    }
}

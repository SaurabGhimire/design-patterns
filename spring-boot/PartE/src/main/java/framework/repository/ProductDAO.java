package framework.repository;

import framework.domain.Product;
import framework.domain.ProductLine;
import framework.domain.ShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductDAO {
    List<ProductLine> productLines;
    List<ShoppingCart> shoppingCart;

    public List<ProductLine> getProducts() {
        return productLines;
    }

    public List<ShoppingCart> getShoppingCart() {
        return shoppingCart;
    }

    public void addProduct(ProductLine productLine){
        productLines.add(productLine);
    }

    public void removeProduct(Product product){
        productLines = productLines.stream().filter(item -> item.getProduct().getId() == product.getId()).collect(Collectors.toList());
    }

    public void updateProduct(ProductLine productLine){
        for(ProductLine productLine1: productLines){
            if(productLine1.getProduct().getId() == productLine.getProduct().getId()){
                productLine1.setQuantity(productLine.getQuantity());
            }
        }
    }
}

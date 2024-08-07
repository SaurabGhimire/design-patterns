package framework.domain;

import java.util.Collection;
import java.util.stream.Collectors;


public class ShoppingCart {
    int id;
    Collection<ProductLine> productLineCollection;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShoppingCart(int id) {
        this.id = id;
    }

    public void addProduct(Product product, int quantity){
        productLineCollection.add(new ProductLine(product, quantity));
    }

    public void removeProduct(Product product){
        productLineCollection = productLineCollection.stream().filter(item -> item.getProduct().getId() == product.getId()).collect(Collectors.toList());
    }

    public void updateProduct(Product product, int quantity){
        for(ProductLine productLine: productLineCollection){
            if(productLine.getProduct().getId() == product.getId()){
                productLine.setQuantity(quantity);
            }
        }
    }

    public Order checkout(){
        return  null;
    }
}

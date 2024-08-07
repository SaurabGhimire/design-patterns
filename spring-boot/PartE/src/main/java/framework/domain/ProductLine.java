package framework.domain;

public class ProductLine {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private int quantity;
}

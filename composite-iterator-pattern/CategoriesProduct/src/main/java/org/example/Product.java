package org.example;

public class Product extends CompositeElement{
    double price;

    public Product(String name, double price) {
        super(name);
        this.price = price;
    }

    public void print(){
        System.out.println(toString());
    }


    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

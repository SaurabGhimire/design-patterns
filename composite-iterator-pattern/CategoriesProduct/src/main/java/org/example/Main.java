package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CompositeElement redLannisterShirt = new Product("Red Lannister Shirt", 12.0);
        CompositeElement greenTargaryeanShirt = new Product("Green Targaryean Shirt", 13.0);
        CompositeElement shirt = new Category(List.of(redLannisterShirt, greenTargaryeanShirt),"shirt");
        CompositeElement pant = new Category("pant");

        CompositeElement men = new Category(List.of(shirt, pant), "men");
        CompositeElement women = new Category("women");

        CompositeElement clothing = new Category(List.of(men, women), "clothing");

        clothing.print();
    }
}
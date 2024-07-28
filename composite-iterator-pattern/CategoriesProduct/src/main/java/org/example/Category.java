package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Category extends CompositeElement{
    Collection<CompositeElement> subCategories;


    public Category(Collection<CompositeElement> subCategories, String name){
        super(name);
        this.subCategories = subCategories;
    }

    public Category(String name){
        super(name);
        this.subCategories = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(name + " -> ");
        for(CompositeElement element: subCategories){
            element.print();
        }
    }
}

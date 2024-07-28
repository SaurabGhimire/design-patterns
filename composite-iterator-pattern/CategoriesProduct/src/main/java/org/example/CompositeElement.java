package org.example;

public abstract class CompositeElement {
    String name;

    public CompositeElement(String name){
        this.name = name;
    }
    abstract void print();
}

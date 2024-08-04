package org.example;

public class PlainText implements HtmlElement{
    String text;
    PlainText(String text){
        this.text = text;
    }

    @Override
    public String getValue() {
        return text;
    }
}

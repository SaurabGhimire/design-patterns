package org.example;

import javax.swing.text.html.HTML;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HtmlElement plainText = new PlainText("Hello, World!");
        HtmlElement bold = new Bold(List.of(plainText));
        HtmlElement strikeThrough = new Strikethrough(List.of(bold));
        System.out.println(strikeThrough.getValue());

        plainText = new PlainText("Hello, World!");
        bold = new Bold(List.of(plainText));
        HtmlElement italic = new Italic(List.of(bold));
        HtmlElement underline = new Underline(List.of(italic));
        strikeThrough = new Strikethrough(List.of(underline));
        System.out.println(strikeThrough.getValue());
    }
}
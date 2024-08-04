package org.example;

import java.util.List;

public class Html implements HtmlElement{
    List<HtmlElement> elements;
    String tag;
    Html(List<HtmlElement> elements, String tag){
        this.elements = elements;
        this.tag = tag;
    }

    public String getValue() {
        StringBuilder temp = new StringBuilder();
        for(HtmlElement element: elements){
            temp.append(element.getValue());
        }
        String start = "<"  + tag + ">";
        String end = "<" +tag + "/>";
        temp.insert(0, start);
        temp.append(end);
        return temp.toString();
    }
}

package com.WebScrapping.Service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PageParser {
    public List<String> extractImages(Document doc){
        return doc.select("img")
                .eachAttr("abs:src");

    }
    public List<String> extractLinks(Document doc){
        return doc.select("a[href]")
                .eachAttr("abs:href");
    }
}

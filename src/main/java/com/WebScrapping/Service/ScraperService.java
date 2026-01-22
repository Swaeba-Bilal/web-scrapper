package com.WebScrapping.Service;

import com.WebScrapping.Model.ScrapeResponse;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ScraperService {
    private final PageFetcher pageFetcher;
    private final PageParser pageParser;

    public ScraperService(PageFetcher fetcher, PageParser parser) {
        this.pageFetcher = fetcher;
        this.pageParser = parser;
    }
    public ScrapeResponse scrape(String url) throws Exception {
        Document doc=pageFetcher.fetch(url);
        return new ScrapeResponse(
                pageParser.extractImages(doc),
                pageParser.extractLinks(doc)
        );
    }
}

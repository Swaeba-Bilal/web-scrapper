package com.WebScrapping.Controller;

import com.WebScrapping.Model.ScrapeResponse;
import com.WebScrapping.Service.ScraperService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ScraperApiController {
    private final ScraperService scraperService;

    public ScraperApiController(ScraperService scraperService) {
        this.scraperService = scraperService;
    }
    @PostMapping("/scrape")
    public ScrapeResponse scrape(@RequestParam String url) throws Exception {

            return scraperService.scrape(url);

    }
}

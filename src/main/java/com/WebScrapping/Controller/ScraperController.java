package com.WebScrapping.Controller;

import com.WebScrapping.Model.ScrapeResponse;
import com.WebScrapping.Service.ScraperService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ScraperController {

    private final ScraperService scraperService;

    public ScraperController(ScraperService scraperService) {
        this.scraperService = scraperService;
    }
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @PostMapping("/scrape")
        public String scrape(@RequestParam  String url, Model model){
        try{
            ScrapeResponse response=scraperService.scrape(url);
            model.addAttribute("result", response);

        }
        catch (Exception e){
            model.addAttribute("error","Unable to scrape this url");
        }
        return "result";
    }
}

package com.WebScrapping.Model;

import java.util.List;

public class ScrapeResponse {
    private List<String> images;
    private List<String> links;

    public ScrapeResponse() {
    }

    public ScrapeResponse(List<String> images, List<String> links) {
        this.images = images;
        this.links = links;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }
}

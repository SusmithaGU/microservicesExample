package com.example.movieCatalogService.resources;

public class CatalogItem {
    private String moviename;
    private String description;
    private int rating;

    public CatalogItem(String moviename, String description, int rating) {
        this.moviename = moviename;
        this.description = description;
        this.rating = rating;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



}

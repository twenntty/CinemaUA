package com.markus.cinemaua;

import java.util.List;

public class Movie {
    private String title;
    private String rating;
    private String posterUrl;
    private String description;
    private List<String> showtimes;

    public Movie(String title, String rating, String posterUrl, String description, List<String> showtimes) {
        this.title = title;
        this.rating = rating;
        this.posterUrl = posterUrl;
        this.description = description;
        this.showtimes = showtimes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public List<String> getShowtimes() {return showtimes;}

    public void setShowtimes(List<String> showtimes) {this.showtimes = showtimes;}
}

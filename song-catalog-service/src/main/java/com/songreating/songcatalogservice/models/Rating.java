package com.songreating.songcatalogservice.models;

public class Rating {
    private String songId;
    private int rating;

    public Rating(String songId, int rating) {
        this.songId = songId;
        this.rating = rating;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

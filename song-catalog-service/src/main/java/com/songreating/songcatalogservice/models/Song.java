package com.songreating.songcatalogservice.models;

public class Song {

    private String songId;
    private String name;

    public Song(){

    }

    public Song(String songId, String name) {
        this.songId = songId;
        this.name = name;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

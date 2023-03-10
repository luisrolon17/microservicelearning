package com.example.movieinfoservice.models;

public class Movie {
    private String movieId;
    private String name;
    private String overview;

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public Movie(String movieId, String name, String overview) {
        this.movieId = movieId;
        this.name = name;
        this.overview = overview;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

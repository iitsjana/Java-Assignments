package com.company;

//Game class storing game instance variables, along with their setters and getters
public class Game {
    private String title;
    private String genre;
    private String developer;
    private int releaseDate;

    // Constructor initializing instance variables
    public Game(String title, String genre, String developer, int releaseDate){
        this.title=title;
        this.genre=genre;
        this.developer=developer;
        this.releaseDate=releaseDate;
    }

    // Below are our setters and getters for every variable
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseData(int releaseData) {
        this.releaseDate = releaseData;
    }
}

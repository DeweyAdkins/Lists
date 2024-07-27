package org.example;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public TvShow(String showName) {
        this.showName = showName;
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    public TvShow() {
        this.showName = "Unknown";
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "TV Show: " + getShowName() + ", Episodes: " + getNumberOfEpisodes() + ", Genre: " + getGenre();
    }
}

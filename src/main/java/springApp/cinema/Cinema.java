package springApp.cinema;

public class Cinema {
    private Cinematograph cinematograph;

    private String genre;

    private int movieDuration;

    // IoC
    public Cinema () {};

    public Cinema(Cinematograph cinematograph, String genre, int movieDuration) {
        this.cinematograph = cinematograph;
        this.genre = genre;
        this.movieDuration = movieDuration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setCinematograph(Cinematograph cinematograph) {
        this.cinematograph = cinematograph;
    }

    public void playFilm() {
        System.out.println("Welcome to the Cinema!");
        System.out.println("The film is " + "\"" + cinematograph.getFilm() + "\"");
        System.out.println("Genre - " + this.genre);
        System.out.println("Movie Duration: " + this.movieDuration + " min.");
        System.out.println("Enjoy watching!");
    }
}

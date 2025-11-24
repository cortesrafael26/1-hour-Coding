package day3.ExerciseOne;

public class Movie implements MovieInterface {
    /* Write a Java program to create a class called Movie with private instance variables title, director, 
    and duration. Provide public getter and setter methods to access and modify these variables. Add a method 
    called getMovieDetails() that returns a formatted string containing the movie details. */

    private String title;
    private String director;
    private int durationMinutes;
    
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void getMovieDetails() {
        System.out.println("MOVIE DETAILS");
        System.out.println("Title: " + getTitle());
        System.out.println("Director/s: " + getDirector());
        System.out.println("Duration: " + getDurationMinutes() + " mins");
    }
}

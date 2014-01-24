/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lib;

/**
 * This class represents a generic Film.
 * @author Steven
 */
public class Film {
    private final String title;
    private final int year;
    private final int length;
    private final double rating;

    /**
     * Create a Film object from a title, year, length and rating (a number from
     * 0 to 5, based on viewer ratings.
     * @param title the title of the film
     * @param year the year the film was released
     * @param length the length of the film in minutes
     * @param rating the average rating on a scale of 0 to 5
     */
    public Film(String title, int year, int length, double rating) {
        this.title = title;
        this.year = year;
        this.length = length;
        this.rating = rating;
    }

    /**
     * Retrieve the title
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieve the year of the film
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * The year the film was released.
     * @return the year
     */
    public int getLength() {
        return length;
    }

    /**
     * The viewer rating of the film.
     * @return the rating from 0 to 5.
     */
    public double getRating() {
        return rating;
    }

    /**
     * Convert the film to a printable string.
     * @return the printable version of the Film
     */
    @Override
    public String toString() {
        return "Film '" + title + "' (" + year + "), " + length + " min., rating=" + rating;
    }
    
}

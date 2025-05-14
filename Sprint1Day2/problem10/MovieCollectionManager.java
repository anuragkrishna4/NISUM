import java.util.*;

class Movie {
    String title;
    String director;
    String genre;
    int releaseYear;
    double rating;

    // Constructor
    public Movie(String title, String director, String genre, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Override toString for a formatted table output
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-10s %-12d %-5.1f", title, director, genre, releaseYear, rating);
    }
}

public class MovieCollectionManager {
    private ArrayList<Movie> movies;

    public MovieCollectionManager() {
        movies = new ArrayList<>();
    }

    // Add a movie
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Remove a movie
    public void removeMovie(String title) {
        movies.removeIf(movie -> movie.title.equalsIgnoreCase(title));
    }

    // Filter movies by genre
    public List<Movie> filterByGenre(String genre) {
        List<Movie> filtered = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.genre.equalsIgnoreCase(genre)) {
                filtered.add(movie);
            }
        }
        return filtered;
    }

    // Filter movies by director
    public List<Movie> filterByDirector(String director) {
        List<Movie> filtered = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.director.equalsIgnoreCase(director)) {
                filtered.add(movie);
            }
        }
        return filtered;
    }

    // Filter movies by release year
    public List<Movie> filterByReleaseYear(int year) {
        List<Movie> filtered = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.releaseYear == year) {
                filtered.add(movie);
            }
        }
        return filtered;
    }

    // Sort movies by title
    public void sortByTitle() {
        movies.sort(Comparator.comparing(movie -> movie.title));
    }

    // Sort movies by release year
    public void sortByYear() {
        movies.sort(Comparator.comparingInt(movie -> movie.releaseYear));
    }

    // Sort movies by rating
    public void sortByRating() {
        movies.sort(Comparator.comparingDouble(movie -> movie.rating));
    }

    // Display all movies
    public void displayMovies() {
        System.out.printf("%-20s %-20s %-10s %-12s %-5s\n", "Title", "Director", "Genre", "Release Year", "Rating");
        System.out.println("------------------------------------------------------------");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void main(String[] args) {
        MovieCollectionManager manager = new MovieCollectionManager();

        // Adding movies
        manager.addMovie(new Movie("SherSaah", "xyz", "Patriotic", 2021, 8.8));
        manager.addMovie(new Movie("Raid", "mno", "Action", 2008, 9.0));
        manager.addMovie(new Movie("Kick", "Salman", "Crime", 2018, 7.2));
        manager.addMovie(new Movie("Titanic", "Cameron", "Romance", 1997, 7.8));

        // Display all movies
        System.out.println("All Movies:");
        manager.displayMovies();

        // Sort movies by title
        manager.sortByTitle();
        System.out.println("\nMovies Sorted by Title:");
        manager.displayMovies();

        // Sort movies by year
        manager.sortByYear();
        System.out.println("\nMovies Sorted by Release Year:");
        manager.displayMovies();

        // Sort movies by rating
        manager.sortByRating();
        System.out.println("\nMovies Sorted by Rating:");
        manager.displayMovies();

        // Filter movies by genre
        System.out.println("\nMovies in the 'Sci-Fi' genre:");
        List<Movie> sciFiMovies = manager.filterByGenre("Sci-Fi");
        for (Movie movie : sciFiMovies) {
            System.out.println(movie);
        }

        // Remove a movie
        manager.removeMovie("Titanic");
        System.out.println("\nMovies after removing 'Titanic':");
        manager.displayMovies();
    }
}

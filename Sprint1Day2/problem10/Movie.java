public class Movie {
    String title;
    String director;
    String genre;
    int year;
    double rating;

    Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String toString() {
        return title + " | " + director + " | " + genre + " | " + year + " | Rating: " + rating;
    }
}


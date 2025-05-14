import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MovieCollection {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("SherSaah", "ABC", "Patriotic", 2022, 8.8);
        Movie movie2 = new Movie("Dangal", "Nitesh", "Drama", 2016, 8.4);
        Movie movie3 = new Movie("Interstellar", "Nolan", "Sci-Fi", 2014, 8.6);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        System.out.println("All Movies:");
        for (Movie m : movies) {
            System.out.println(m);
        }

        System.out.println();
        System.out.println("Filtered by Genre: Sci-Fi");

    for (Movie m : movies) {
        if (m.genre.equalsIgnoreCase("Sci-Fi")) {
            System.out.println(m);
        }
    }

    System.out.println();
    System.out.println("Sorted by Rating:");

    Comparator<Movie> ratingComparator = new Comparator<Movie>() {
        public int compare(Movie m1, Movie m2) {
            if (m1.rating > m2.rating) 
                return -1;
            else if 
                (m1.rating < m2.rating) return 1;
            else 
                return 0;
        }
    };

    Collections.sort(movies, ratingComparator);

    for (Movie m : movies) {
        System.out.println(m);
    }
    }
}
package comparator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Return of the Jedi", 8.1, 1983));
        list.add(new Movie("Empire Strikes Back", 8.4, 1980));
        list.add(new Movie("Star wars", 8.0, 1977));

        System.out.println("Sorted by rating");
        RatingComparator ratingComparator = new RatingComparator();

        int n = list.size();
        boolean swapped;
        Movie temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (ratingComparator.compare(list.get(i - 1), list.get(i)) > 0) {
                    temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);

        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        n = list.size();
        System.out.println("Sorted by name");
        NameComparator nameComparator = new NameComparator();
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (nameComparator.compare(list.get(i - 1), list.get(i)) > 0) {
                    temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}

package comparable;

import java.util.ArrayList;
import java.util.List;

public class TestMovie {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();

        list.add(new Movie("1", 5, 2002));
        list.add(new Movie("2", 5, 1998));
        list.add(new Movie("3", 5, 2021));
        list.add(new Movie("4", 5, 2004));
        list.add(new Movie("5", 5, 2003));

        // Sort by bubble sort
        int n = list.size();
        boolean swapped;
        Movie temp;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                    temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);

        System.out.println("Movies after sorting");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

    }
}

package movies;
import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        Input input = new Input();

        Movie[] movies = MoviesArray.findAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nJAVA MOVIE DATABASE:\n");

        boolean getAMovie = true;
        do {
            input.yesNo("Would you like to find a movie?");
            if (sc.next().equalsIgnoreCase("n")) {
                getAMovie = false;
            } else {
                getAMovie = true;
            }

            System.out.println("Moveeexxz");

        } while (getAMovie);

        for (Movie movie : movies) {
            System.out.println(movie.getCategory());
        }
    }
}

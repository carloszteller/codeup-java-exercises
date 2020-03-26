import movies.Movie;
import movies.MoviesArray;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        int choice;

        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n");
            System.out.print("Enter your choice: ");

            choice = input.getInt();

            System.out.println();

            switch (choice) {
                case 1:
                    displayAllMovies();
                    break;
                case 2:
                    displayMoviesByCategory("animated");
                    break;
                case 3:
                    displayMoviesByCategory("drama");
                    break;
                case 4:
                    displayMoviesByCategory("horror");
                    break;
                case 5:
                    displayMoviesByCategory("scifi");
                    break;
                default:
                    System.out.println("Goodbye...");
                    break;
            }
        } while(choice != 0);
    }

    public static void displayAllMovies() {
        for(Movie movie: MoviesArray.findAll()) {
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }

    public static void displayMoviesByCategory(String category) {
        for(Movie movie: MoviesArray.findAll()) {
            if(movie.getCategory().equals(category)) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
}

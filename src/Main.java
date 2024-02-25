import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean init = true;

        do {
            System.out.println("Enter the type & title of movie or q to exit");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the movie title");
            var title = sc.nextLine();

            System.out.println("Enter the type of movie");
            var type = sc.nextLine();

            if (type.equals("q") || title.equals("q")) {
                init = false;
            } else {
                Movie movie = Movie.getMovie(title, type);
                movie.watchMovie();
            }

        }while (init);
    }
}
public class Movie {
    public Movie() {

    }

    public static Movie getMovie (String title, String type) {
        return switch (type.toLowerCase()){
            case "horror" -> new Horror(title, type);
            case "drama" -> new Drama(title, type);
            case "comedy" -> new Comedy(title, type);
            case "action" -> new Action(title, type);
            default -> new Movie();
        };
    }
    public void watchMovie () {
        System.out.println("You are watching a movie");
    }

}

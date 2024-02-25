public class Drama extends Movie {
    private final String title;

    private final String type;

    public Drama (String title, String type) {
        this.title = title;
        this.type = type;
    }

    @Override
    public void watchMovie() {
        System.out.println("You are watching a " + title + " a " + type);
    }
}

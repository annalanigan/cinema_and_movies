import java.util.ArrayList;

public class Cinema {

    private ArrayList<Movie> showings;
    private int screens;
    private String name;

    public Cinema(String newName, int newNum){
        this.name = newName;
        this.screens = newNum;
        this.showings = new ArrayList<>();
    }

    public int movieCount() {
        return showings.size();
    }

    public void addMovie(Movie inputMovie) {
        showings.add(inputMovie);
    }
}

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
        if (!cinemaFull()) {
            showings.add(inputMovie);
        }
    }

    public boolean cinemaFull(){
       return (movieCount() >= this.screens);
    }


    public void buyMovie(FilmStudio studio, Movie movie) {
        if (!cinemaFull()){
            studio.sellNewRelease(movie);
            addMovie(movie);
        }
    }
}

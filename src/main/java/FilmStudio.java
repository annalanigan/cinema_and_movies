import java.util.ArrayList;

public class FilmStudio {

    private ArrayList<Movie> newReleases;

    public FilmStudio() {
        this.newReleases = new ArrayList<>();
    }

    public void addNewRelease(Movie movie){
        newReleases.add(movie);
    }

    public int countReleases() {
        return this.newReleases.size();
    }

    public void sellNewRelease(Movie movie) {
        this.newReleases.remove(movie);
    }
}

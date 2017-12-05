import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCinema {

    Cinema myCinema;
    Cinema myCinema2;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    FilmStudio myStudio;

    @Before
    public void before(){
        myCinema = new Cinema("Dominion", 5);
        myCinema2 = new Cinema("Minion", 2);
        movie1 = new Movie("Moana", Rating.UNIVERSAL);
        movie2 = new Movie("Fantastic Beasts", Rating.TWELVE);
        movie3 = new Movie("Home Alone", Rating.PARENTALGUIDANCE);
        myStudio = new FilmStudio();
    }

    @Test
    public void canCountMovies(){
        assertEquals(0, myCinema.movieCount());
    }

    @Test
    public void canAddMovie(){
        myCinema.addMovie(movie1);
        assertEquals(1, myCinema.movieCount());
    }

    @Test
    public void cinemaIsFull(){
        myCinema2.addMovie(movie1);
        myCinema2.addMovie(movie2);
        assertEquals(true, myCinema2.cinemaFull());
    }

    @Test
    public void cantAddWhenFull(){
        myCinema2.addMovie(movie1);
        myCinema2.addMovie(movie2);
        myCinema2.addMovie(movie3);
        assertEquals(2, myCinema2.movieCount());
    }

    @Test
    public void buyMovieFromStudio(){
        myStudio.addNewRelease(movie1);
        myStudio.addNewRelease(movie2);
        myCinema.buyMovie(myStudio, movie1);
        assertEquals(1, myStudio.countReleases());
        assertEquals(1, myCinema.movieCount());

    }
}

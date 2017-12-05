import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCinema {

    Cinema myCinema;
    Movie movie1;
    Movie movie2;

    @Before
    public void before(){
        myCinema = new Cinema("Dominion", 5);
        movie1 = new Movie("Moana", Rating.UNIVERSAL);
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

//    @Test
//    public void cinemaIsFull(){
//
//    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFilmStudio {

    FilmStudio myStudio;
    Movie movie1;
    Movie movie2;

    @Before
    public void before(){
        myStudio = new FilmStudio();
        movie1 = new Movie("The Princess Bridehead Revisited", Rating.PARENTALGUIDANCE);
        movie2 = new Movie("Defrosted", Rating.UNIVERSAL);
    }

    @Test
    public void addNewRelease(){
        myStudio.addNewRelease(movie1);
        assertEquals(1, myStudio.countReleases());
    }

    @Test
    public void sellNewRelease(){
        myStudio.addNewRelease(movie1);
        myStudio.addNewRelease(movie2);
        myStudio.sellNewRelease(movie1);
        assertEquals(1, myStudio.countReleases());
    }


}

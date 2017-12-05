import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMovie {

    Movie movie1;
    Movie movie2;
    Movie movie3;

    @Before
    public void before(){
        movie1 = new Movie("Losing Nemo Again", Rating.UNIVERSAL);
        movie2 = new Movie("Suicide Squad", Rating.EIGHTEEN);
        movie3 = new Movie("Home Alone", Rating.PARENTALGUIDANCE);
    }

    @Test
    public void hasName(){
        assertEquals("Home Alone", movie3.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(Rating.UNIVERSAL,movie1.getRating());
    }

    @Test
    public void hasPrettyRating(){
        assertEquals("18", movie2.prettyRating());
    }
}

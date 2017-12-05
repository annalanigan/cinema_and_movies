public class Movie {

    private String name;
    private Rating rating;

    public Movie(String addName, Rating addRating ) {
        this.name = addName;
        this.rating = addRating;
    }


    public String getName() {
        return name;
    }

    public Rating getRating() {
        return rating;
    }

    public String prettyRating() {
        return rating.getOutput();
    }
}

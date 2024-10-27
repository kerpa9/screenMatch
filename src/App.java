import java.util.ArrayList;
import com.kevenreyes.screenmatch.models.Movie;

public class App {
    public static void main(String[] args) throws Exception {

        Movie myMovie = new Movie("Harry Potter", 1999, true, 200);
        System.out.println("Duration of the movie: " + myMovie.getDurationsInMinuts());
        myMovie.showTechnicalSheet();
        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);
        myMovie.evaluate(4);
        myMovie.evaluate(6);
        System.out.println("Total valorate: " + myMovie.getTotalEvaluations());
        System.out.println("Total media valorate: " + myMovie.calMediaEvaluate());

        var movieRings = new Movie("The Lord of the Rings", 2001, false, 180);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(myMovie);
        movies.add(movieRings);

        System.out.println("Size of list: " + movies.size());
        System.out.println("First movie: " + movies.get(0).getName());
        System.out.println("Movies " + movies.toString());

        // Object object =movieRings;

    }
}

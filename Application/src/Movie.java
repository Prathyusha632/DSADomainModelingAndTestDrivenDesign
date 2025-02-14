import java.util.ArrayList;
import java.util.List;
public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title, String studio, String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title, String studio)
    {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    Movie[] getPG(Movie[] movies)
    {
        List<Movie> movieList=new ArrayList<Movie>();
        for(Movie movie:movies)
        {
            if(movie.rating.contains("PG"))
                movieList.add(movie);
        }
        return (movieList.toArray(new Movie[movieList.size()]));
    }
    public static void main(String[] args)
    {
        Movie[] movieObjects = new Movie[5];
        movieObjects[0] = new Movie("Casino Royale","Eon Productions","PG-13");
        movieObjects[1] = new Movie("Avengers","MarvelStudios");
        movieObjects[2] = new Movie("Godzilla","KongStudios");
        movieObjects[3] = new Movie("Avatar","WarnerBrosStudio","Good");
        movieObjects[4] = new Movie("Titanic","WarnerBrosStudio","PG-14");
        Movie[] pgRatedMovies=movieObjects[0].getPG(movieObjects);
        for(Movie movie:pgRatedMovies) {
           System.out.println(movie.title+" "+movie.studio+" "+movie.rating);
        }
    }
}


package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {

    public static List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
    movies.add(movie);
    }


    public List<String> findMovieByTime(LocalDateTime time) {
    List<String> result = new ArrayList<>();

    for(Movie actual : movies) {


        if (movieContainsTime(actual, time)){

            result.add(actual.getTitle());


        }

    }
        return  result;


    }

    private boolean movieContainsTime(Movie movie, LocalDateTime time) {
        for(LocalDateTime actual : movie.getOnScreen()){
            if(actual.equals(time)){
                return true;
            }
        }
        return false;
    }




}

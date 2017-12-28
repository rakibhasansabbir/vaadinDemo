package bd.ac.seu.my.vaddindemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class Movies {

    @Id
    @GeneratedValue
    private int movieId;
    private String movieName;
    private String movieDirectorName;
    private int movieReleaseYear;
    @ManyToOne
    @JoinColumn(name = "movieCategory")
    private MovieCategory movieCategory;


    public Movies() {
    }

    public Movies(String movieName, String movieDirectorName, int movieReleaseYear, MovieCategory movieCategory) {
        this.movieName = movieName;
        this.movieDirectorName = movieDirectorName;
        this.movieReleaseYear = movieReleaseYear;
        this.movieCategory = movieCategory;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirectorName() {
        return movieDirectorName;
    }

    public void setMovieDirectorName(String movieDirectorName) {
        this.movieDirectorName = movieDirectorName;
    }

    public int getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(int movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(MovieCategory movieCategory) {
        this.movieCategory = movieCategory;
    }
}

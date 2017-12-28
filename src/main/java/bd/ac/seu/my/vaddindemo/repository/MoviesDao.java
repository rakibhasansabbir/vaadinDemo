package bd.ac.seu.my.vaddindemo.repository;

import bd.ac.seu.my.vaddindemo.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesDao extends JpaRepository<Movies, Integer> {
}

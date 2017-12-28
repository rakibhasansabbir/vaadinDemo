package bd.ac.seu.my.vaddindemo.repository;

import bd.ac.seu.my.vaddindemo.model.MovieCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCategoryDao extends JpaRepository<MovieCategory, Integer>{
}

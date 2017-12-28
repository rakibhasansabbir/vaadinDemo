package bd.ac.seu.my.vaddindemo.vaddinUI;

import bd.ac.seu.my.vaddindemo.model.Movies;
import bd.ac.seu.my.vaddindemo.repository.MoviesDao;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringUI
public class IndexUI extends UI {

    @Autowired
    MoviesDao moviesDao;
    @Override
    protected void init(VaadinRequest request) {
        Movies movies = moviesDao.findOne(1);
        List<Movies> moviesList = moviesDao.findAll();
        VerticalLayout verticalLayout = new VerticalLayout();
        this.setContent(verticalLayout);

        verticalLayout.addComponent(new Button("Click me", e -> Notification.show(movies.getMovieName())));

        Grid<Movies> grid = new Grid<>();
        grid.setItems(moviesList);
        verticalLayout.addComponent(grid);

        grid.addColumn(Movies::getMovieId).setCaption("Id");
        grid.addColumn(Movies::getMovieName).setCaption("MovieName");
        grid.addColumn(Movies::getMovieDirectorName).setCaption("DirectorName";


    }
}

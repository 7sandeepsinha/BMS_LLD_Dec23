package dev.sandeep.BookMyShow.repository;

import dev.sandeep.BookMyShow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer > {
    Movie findMovieByName(String movieName);
}

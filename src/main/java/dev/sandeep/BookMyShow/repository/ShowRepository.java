package dev.sandeep.BookMyShow.repository;

import dev.sandeep.BookMyShow.model.Auditorium;
import dev.sandeep.BookMyShow.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer > {
}

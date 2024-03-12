package dev.sandeep.BookMyShow.repository;

import dev.sandeep.BookMyShow.model.Auditorium;
import dev.sandeep.BookMyShow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer > {
}

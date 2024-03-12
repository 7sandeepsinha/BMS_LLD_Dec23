package dev.sandeep.BookMyShow.repository;

import dev.sandeep.BookMyShow.model.Auditorium;
import dev.sandeep.BookMyShow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer > {
}

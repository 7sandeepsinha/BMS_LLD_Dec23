package dev.sandeep.BookMyShow.repository;

import dev.sandeep.BookMyShow.model.Actor;
import dev.sandeep.BookMyShow.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer > {
}

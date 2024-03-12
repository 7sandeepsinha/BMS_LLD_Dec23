package dev.sandeep.BookMyShow.repository;

import dev.sandeep.BookMyShow.model.City;
import dev.sandeep.BookMyShow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer > {
}

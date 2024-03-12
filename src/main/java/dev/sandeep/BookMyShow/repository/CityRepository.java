package dev.sandeep.BookMyShow.repository;

import dev.sandeep.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer > {
    City findCityByName(String name);
}

// 6 mins -> 10:20 PM
// LLD Module 2 -> mock interview syllabus is LLD Module 1 -> expires on 14th March, book before 14th.
package dev.sandeep.BookMyShow.controller;

import dev.sandeep.BookMyShow.dto.CityRequestDTO;
import dev.sandeep.BookMyShow.model.City;
import dev.sandeep.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName){
        City savedCity = cityService.getCityByName(cityName);
        return ResponseEntity.ok(savedCity);  // we would return cityResponseDTO
    }

    @GetMapping("/city")
    public ResponseEntity getAllCities(){
        List<City> cities = cityService.getAllCities();
        return ResponseEntity.ok(cities);  // we would return cityResponseDTO
    }

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
        try{
            String cityName = cityRequestDTO.getName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()) {
                throw new Exception("City Name is invalid");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity); // we would return cityResponseDTO
        }catch (Exception e){
            e.printStackTrace();
        }
         return null;
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId){
        boolean isDeleted = cityService.deleteCity(cityId);
        return ResponseEntity.ok(isDeleted);
    }
}

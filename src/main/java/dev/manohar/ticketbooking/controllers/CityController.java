package dev.manohar.ticketbooking.controllers;

import dev.manohar.ticketbooking.models.City;
import dev.manohar.ticketbooking.service.CityService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;
    @PostMapping("/create")
    public ResponseEntity<City> createCity(@RequestBody City city){
        City c=cityService.createCity(city);
        System.out.println(c.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<City> getCityById(@PathVariable int id){
        return ResponseEntity.ok(cityService.getCityById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<List<City>> getAllCities(){
        return ResponseEntity.ok(cityService.getAllCities());
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCityById(@PathVariable int id){
        //return ResponseEntity.status(HttpStatus.OK).body(cityService.deleteCity(id));
        cityService.deleteCity(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }
    @GetMapping("/city/{name}")
    public City getCityByName(@PathVariable String name){
        return cityService.findCityByName(name);
    }
}

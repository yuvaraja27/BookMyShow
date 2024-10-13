package dev.manohar.ticketbooking.service;

import dev.manohar.ticketbooking.exceptions.CityNotFoundException;
import dev.manohar.ticketbooking.models.City;
import dev.manohar.ticketbooking.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public City createCity(City city){
        return cityRepository.save(city);
    }

    public City getCityById(int id){
        return cityRepository.findById(id).orElseThrow(()->new CityNotFoundException("City Not Found with id:"+id));
    }

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }
    public City findCityByName(String name){
        return cityRepository.findByName(name);
    }
    public void deleteCity(int id){
        cityRepository.deleteById(id);
    }


}

package com.rentx.api.controller;

import com.rentx.api.dtos.CarDto;
import com.rentx.api.models.Car;
import com.rentx.api.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carros")
public class CarController {

    @Autowired
    CarRepository repository;

    @GetMapping()
    public List<Car> find() {
        return repository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Car create(@RequestBody Car car) {
        return repository.save(car);
    }
}

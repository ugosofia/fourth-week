package com.corso.java.vehicle.controller;

import com.corso.java.vehicle.domain.Vehicle;
import com.corso.java.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v2/")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

        @GetMapping(path = "/vehicle")
        ResponseEntity<List<Vehicle>> getAll() {
            List<Vehicle> vehicles = vehicleService.findAll();
            return new ResponseEntity<>(vehicles, HttpStatus.OK);
        }

        @PostMapping(path = "/vehicle")
        ResponseEntity<Vehicle> create(@RequestParam Vehicle vehicle) {
            Vehicle vehicles2 = vehicleService.create(vehicle);
            return new ResponseEntity<>(vehicles2, HttpStatus.OK);
        }
}


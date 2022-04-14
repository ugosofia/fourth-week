package com.corso.java.vehicle.service;

import com.corso.java.vehicle.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    Vehicle create(Vehicle vehicle);
}

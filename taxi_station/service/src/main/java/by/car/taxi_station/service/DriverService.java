package by.car.taxi_station.service;

import by.car.taxi_station.repository.AbstractDriverRepository;

import java.sql.Driver;
import java.util.List;
import java.util.Optional;

public class DriverService implements AbstractDriverService{

    private AbstractDriverRepository abstractDriverRepository;

    @Override
    public Optional<Driver> getDriver(Driver driver) {
        return Optional.empty();
    }

    @Override
    public List<Driver> findDriverByName(String name) {
        return null;
    }

    @Override
    public List<Driver> getAllDrivers() {
        return null;
    }

    @Override
    public void saveDriver(Driver driver) {

    }

    @Override
    public void deleteDriver(Driver driver) {


    }

    @Override
    public int numberOfDrivers() {
        return 0;
    }
}

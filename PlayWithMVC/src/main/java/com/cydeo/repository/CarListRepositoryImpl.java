package com.cydeo.repository;

import com.cydeo.constants.Constants;
import com.cydeo.model.Car;

import java.util.List;

public class CarListRepositoryImpl implements CarListRepository{
    @Override
    public boolean save(Car car) {
        Constants.LISTofCARS.add(car);
        return true;
    }

    @Override
    public List<Car> getAll() {
        return Constants.LISTofCARS;
    }
}

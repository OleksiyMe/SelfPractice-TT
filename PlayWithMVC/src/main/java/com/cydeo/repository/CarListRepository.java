package com.cydeo.repository;

import com.cydeo.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarListRepository {
public boolean save(Car car);
List<Car> getAll();




}

package com.cydeo.service;

import com.cydeo.constants.Constants;
import com.cydeo.model.Car;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CarsService {
    public final Faker faker;

    public CarsService(Faker faker) {
        this.faker = faker;
    }

    public boolean createMyListOfCars(){

        for (int i = 1; i < 21; i++) {
            Car car=new Car(faker.rockBand().name(),
                    faker.animal().name(),
                    2000+(new Random().nextInt(20))
                    );
            Constants.LISTofCARS.add(car);


        }
        return true;
    }
}

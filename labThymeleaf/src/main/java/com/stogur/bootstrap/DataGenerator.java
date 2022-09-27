package com.stogur.bootstrap;

import com.github.javafaker.Faker;
import com.stogur.model.Employee;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Data
public class DataGenerator {
    final Faker faker;
    private List <String> states =new ArrayList<>(Arrays.asList("CA","MD", "VA"));
    private final List<Employee> employeeList= new ArrayList<>();

    public DataGenerator(Faker faker) {
        this.faker = faker;
    }
    List<Employee> listOfEmployees= new ArrayList<>();

    public void fillList(){


    }





}

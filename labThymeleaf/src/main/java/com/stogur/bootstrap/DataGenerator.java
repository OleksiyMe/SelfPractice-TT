package com.stogur.bootstrap;

import com.github.javafaker.Faker;
import com.stogur.model.Employee;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Data
public class DataGenerator {

    {
        generateInitialEmployees();
    }
    final Faker faker;
    private List<String> states = new ArrayList<>(Arrays.asList("CA", "MD", "VA"));
    private final List<Employee> employeeList = new ArrayList<>();

    public DataGenerator(Faker faker) {
        this.faker = faker;
    }

    List<Employee> listOfEmployees = new ArrayList<>();

    public void generateInitialEmployees() {
        for (int i = 0; i < 10; i++) {
            listOfEmployees.add(
                    new Employee(faker.funnyName().name(), faker.harryPotter().character(),
                            LocalDate.now(), "a@b.com",  faker.pokemon().name(),
                            faker.address().streetAddress(),"",faker.address().city(),
                            faker.address().state(),"21342134213"
            ));
        }

    }

    public void fillList() {


    }


}

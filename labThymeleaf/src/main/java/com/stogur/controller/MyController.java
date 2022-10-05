package com.stogur.controller;


import com.github.javafaker.Faker;
import com.stogur.bootstrap.DataGenerator;
import com.stogur.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    public final DataGenerator dataGenerator;

    public MyController(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }


    @GetMapping("/register-employee")
    public String registerEmployee(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("states", dataGenerator.getStates());

        return "/register";

    }

    @PostMapping("/employee-list")
    public String employeeList(@ModelAttribute("employee") Employee employee, Model model  ) {

        dataGenerator.getEmployeeList().add(employee);
        model.addAttribute("employeeList", dataGenerator.getEmployeeList());

        return "/employee-list";

    }

    @Bean
    public Faker faker(){
        return new Faker();
    }
}
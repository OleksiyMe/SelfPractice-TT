package com.cydeo.controller;

import com.cydeo.constants.Constants;
import com.cydeo.service.CarsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@Component
public class carsController {

    public final CarsService carsService;

    public carsController(CarsService carsService) {
        this.carsService = carsService;
    }


    @RequestMapping("/car/{header}")
  //  public String getmyCars(@RequestParam(required = false) String header, Model model){
    public String getmyCars(@PathVariable String header, Model model){

        model.addAttribute("header",header);

        carsService.createMyListOfCars();

        for (int i = 1; i < 20; i++) {

        model.addAttribute("car"+i, Constants.LISTofCARS.get(i));
    }

        return "car-table";
    }



}

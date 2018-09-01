package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 81046 on 2018-08-31
 */
@RestController
public class CityController {

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;

    @GetMapping("/getCity")
    public String getCity(){
        City city = cityDubboConsumerService.printCity();
        return city.toString();
    }
}

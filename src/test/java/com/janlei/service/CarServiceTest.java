package com.janlei.service;

import com.janlei.mapper.CarMapper;
import com.janlei.model.Car;
import com.janlei.model.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarServiceTest {

    @Autowired
    @Qualifier("carMapper")
    private CarMapper carMapper;

    @Test
    @Transactional
    public void getCarByBrand() {
        String brand = "福特";
        Car car1 = new Car();
        car1.setBrand("福特");
        car1.setPrice("300k");
        Country country = new Country();
        country.setId(1000);
        country.setName("美国");
        country.setReferred("US");
        car1.setCountry(country);

        Car car = carMapper.getCarByBrand(brand);
        System.out.println(car);

        assertEquals(car1,car);
    }
}
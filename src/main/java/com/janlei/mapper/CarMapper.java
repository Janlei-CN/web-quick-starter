package com.janlei.mapper;

import com.janlei.model.Car;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper {

    Car getCarByBrand(String brand);
}

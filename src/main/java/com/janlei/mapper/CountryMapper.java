package com.janlei.mapper;

import com.janlei.model.Country;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryMapper {

    Country getCountryByid(Integer id);
}

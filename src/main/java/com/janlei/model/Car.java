package com.janlei.model;

import java.util.Objects;

public class Car {

    private static int i=0;
    private String brand;

    private String price;

    private Country country;

    //*********get and set****************


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println(i++);
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    //***********hash and euqals************

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(brand, car.brand)) return false;
        if (!Objects.equals(price, car.price)) return false;
        return Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}

package com.janlei.model;

import java.util.Objects;

public class Country {

    private Integer id;

    private String name;

    private String referred;

    //*********get and set****************

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferred() {
        return referred;
    }

    public void setReferred(String referred) {
        this.referred = referred;
    }

    //***********hash and equals**********

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!Objects.equals(id, country.id)) return false;
        if (!Objects.equals(name, country.name)) return false;
        return Objects.equals(referred, country.referred);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (referred != null ? referred.hashCode() : 0);
        return result;
    }
}

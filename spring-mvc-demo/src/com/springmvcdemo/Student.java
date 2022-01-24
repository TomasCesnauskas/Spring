package com.springmvcdemo;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;

    public Student() {
//        populate country options: used iso country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("LT", "Lietuva");
        countryOptions.put("LV", "Latvija");
        countryOptions.put("EST", "Estija");
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

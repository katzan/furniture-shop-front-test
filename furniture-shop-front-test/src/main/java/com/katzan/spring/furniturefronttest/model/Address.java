package com.katzan.spring.furniturefronttest.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
/**This class is not a separate class **/
@Embeddable
public class Address implements Serializable {

    
    @Size(min=2)
    private String street;
    private String houseNumber;
    private String boxNumber;

    
    @Size(min=2)
    private String city;
    private String postalCode;

    
    @Size(min=2)
    private String country;

    public Address() {
        super();
    }

    public Address(Address source) {
        super();
        this.street = source.street;
        this.houseNumber = source.houseNumber;
        this.boxNumber = source.boxNumber;
        this.city = source.city;
        this.postalCode = source.postalCode;
        this.country = source.country;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBoxNumber() {
        return this.boxNumber;

    }

    public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
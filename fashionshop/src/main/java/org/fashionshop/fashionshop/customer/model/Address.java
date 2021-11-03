package org.fashionshop.fashionshop.customer.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Address {
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="postalCode")
    private String postalCode;
    @Column(name="country")
    private String country;

    public Address(){}

    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

package ru.job4j.streamapi;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int home;
    private int appartments;

    public Address(String city, String street, int home, int appartments) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.appartments = appartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return home == address.home &&
                appartments == address.appartments &&
                city.equals(address.city) &&
                street.equals(address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, appartments);
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getAppartments() {
        return appartments;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home=" + home +
                ", appartments=" + appartments +
                '}';
    }
}

package ru.job4j.streamapi;

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

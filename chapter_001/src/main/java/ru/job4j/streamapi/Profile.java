package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Address getAddress() {
        return address;
    }

    List<Profile> profiles = new ArrayList<>();
    List<Address> prof = profiles.stream()
            .map(Profile::getAddress)
            .collect(Collectors.toList());

}


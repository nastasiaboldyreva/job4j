package ru.job4j.streamapi;

import java.util.Collections;
import java.util.List;


public class Profile {
    private Address address;

    List<Address> collect(List<Profile> profiles) {
        profiles.stream().map().collect(Collections.toList());
    }

}


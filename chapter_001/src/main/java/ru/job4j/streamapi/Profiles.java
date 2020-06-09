package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Profiles {

    List<Profile> profiles = new ArrayList<>();
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}

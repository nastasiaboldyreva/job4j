package ru.job4j.streamapi;

import java.util.stream.Collectors;
import java.util.List;

public class AddressesList {

    List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}

package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Profiles {

    List<Profile> profiles = new ArrayList<>();
    List<Address> prof = profiles.stream()
            .map(Profile::getAddress)
            .collect(Collectors.toList());
    List<Profiles> listing = new ArrayList<>();
}

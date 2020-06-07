package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class AddressesList {

    List<Address> collect = List.of(
        new Address( "Moscow", "Novoslobodskaya", 10, 20 ),
        new Address( "Saint-Petersburg", "Nevsky", 20, 30),
        new Address( "Murmansk", "Schmidta", 30, 40),
        new Address("Kazan", "Pushkina", 40, 50)
    );


}

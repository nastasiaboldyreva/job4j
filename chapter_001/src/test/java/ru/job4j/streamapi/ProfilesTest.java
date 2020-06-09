package ru.job4j.streamapi;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Address> collect = List.of(
                new Address( "Moscow", "Novoslobodskaya", 10, 20 ),
                new Address( "Saint-Petersburg", "Nevsky", 20, 30),
                new Address( "Murmansk", "Schmidta", 30, 40),
                new Address("Kazan", "Pushkina", 40, 50)
        );

        List<Profile> profiles = List.of(
                new Profile(new Address("Moscow", "Novoslobodskaya", 10, 20)),
                new Profile(new Address("Saint-Petersburg", "Nevsky", 20, 30)),
                new Profile(new Address("Murmansk", "Schmidta", 30, 40)),
                new Profile(new Address("Kazan", "Pushkina", 40, 50))
        );

        List<Profile> result = ;
        List<Profile> expected = ;
        assertThat(result, is(expected));
    }
}
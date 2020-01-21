package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class UserTest {

    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32, 2));
        users.add(new User("Ivan", 31, 1));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31, 2)));
        assertThat(it.next(), is(new User("Petr", 32, 1)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rslt = new User("Petr", 32, 1)
                .compareTo(
                        new User("Ivan", 31, 2)
                );

    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<User> compNamePriority = new UserNameIncrease().thenComparing(new UserPriorIncrease());
        int result = compNamePriority.compare(
                new User("Ann", 10, 1),
                new User("Mike", 20, 2)
        );
        assertThat(result, lessThan(1));
    }
}

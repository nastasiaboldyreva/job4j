package ru.job4j.collection;

        import java.util.Comparator;

public class DepDescComp implements Comparator<Departments> {

    @Override
    public int compare(Departments a, Departments b) {
        return b.sortDest().compareTo(a.sortDest());
    }
}
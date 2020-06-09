package ru.job4j.lambda.studentsfilter;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    private List<Student> students;

    @Before
    public void studentsList() {
        students = List.of(
                new Student(90, "Ivanov"),
                new Student(80, "Petrov"),
                new Student(70, "Sidorov"),
                new Student(60, "Kepler"),
                new Student(75, "Pushkin"),
                new Student(65, "Lomonosov"),
                new Student(55, "Newton"),
                new Student(45, "Rezerford"),
                new Student(60, "Landau"),
                new Student(50, "Kapitsa"),
                new Student(40, "Einstein"),
                new Student(30, "Archimed")
        );
    }


    @Test
    public void filter10AClass() {
        School school = new School();

        List<Student> result = school.collect(
                students, p -> p.getScore() <= 100);
        List<Student> expected = school.collect(
                students, p -> p.getScore() >= 70 && p.getScore() <= 100);
        assertThat(result, is(expected));
    }




    @Test
    public void filter10BClass() {
        School school = new School();

        List<Student> result = school.collect(
                students, p -> p.getScore() <= 100);
        List<Student> expected = school.collect(
                students, p -> p.getScore() >= 50 && p.getScore() <= 70);
        assertThat(result, is(expected));
    }


    @Test
    public void filter10CClass() {
        School school = new School();

        List<Student> result = school.collect(
                students, p -> p.getScore() <= 100);
        List<Student> expected = school.collect(
                students, p -> p.getScore() >= 0 && p.getScore() <= 50);
        assertThat(result, is(expected));
    }
}


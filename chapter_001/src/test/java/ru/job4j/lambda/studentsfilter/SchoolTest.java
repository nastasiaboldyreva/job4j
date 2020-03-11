package ru.job4j.lambda.studentsfilter;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void filter10AClass() {
        School school = new School();
        List<Student> students = List.of(
               new Student(90),
               new Student(80),
               new Student(70),
               new Student(60)
        );
        List<Student> result = school.collect(
                students, p -> p.getScore() <= 100);
        List<Student> expected = school.collect(
                students, p -> p.getScore() >= 70 && p.getScore() <= 100);
        assertThat(result, is(expected));
    }




    @Test
    public void filter10BClass() {
        School school = new School();
        List<Student> students = List.of(
                new Student(75),
                new Student(65),
                new Student(55),
                new Student(45)
        );
        List<Student> result = school.collect(
                students, p -> p.getScore() <= 100);
        List<Student> expected = school.collect(
                students, p -> p.getScore() >= 50 && p.getScore() <= 70);
        assertThat(result, is(expected));
    }


    @Test
    public void filter10CClass() {
        School school = new School();
        List<Student> students = List.of(
                new Student(60),
                new Student(50),
                new Student(40),
                new Student(30)
        );
        List<Student> result = school.collect(
                students, p -> p.getScore() <= 100);
        List<Student> expected = school.collect(
                students, p -> p.getScore() >= 0 && p.getScore() <= 50);
        assertThat(result, is(expected));
    }
}


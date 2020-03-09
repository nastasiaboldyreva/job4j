package ru.job4j.lambda.studentsfilter;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void filter10AClass() {
        School school = new School();
        List<Student> result = school.collect(
                students, students -> students.getScore() <= 100);
        List<Student> expected = school.collect(
                students, students -> students.getScore() >= 70 && students.getScore() <= 100);
        assertThat(result, is(expected));
    }




    @Test
    public void filter10BClass() {
        School school = new School();
        List<Student> result = school.collect(
                students, students -> students.getScore() <= 100);
        List<Student> expected = school.collect(
                students, students -> students.getScore() >= 50 && students.getScore() <= 70);
        assertThat(result, is(expected));
    }


    @Test
    public void filter10CClass() {
        School school = new School();
        List<Student> result = school.collect(
                students, students -> students.getScore() <= 100);
        List<Student> expected = school.collect(
                students, students -> students.getScore() >= 0 && students.getScore() <= 50);
        assertThat(result, is(expected));
    }
}


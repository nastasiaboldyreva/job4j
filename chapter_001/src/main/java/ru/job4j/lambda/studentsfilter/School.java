package ru.job4j.lambda.studentsfilter;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> students = new List<>();
        for (int index = 0; index <= 100; index ++) {

        }
        //students.stream().filter((score) -> score >= 70 && score <= 100).collect(Collectors.toList());
    }
}


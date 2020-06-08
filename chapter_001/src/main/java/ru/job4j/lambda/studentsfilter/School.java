package ru.job4j.lambda.studentsfilter;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }
}



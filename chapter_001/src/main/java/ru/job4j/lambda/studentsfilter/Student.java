package ru.job4j.lambda.studentsfilter;

public class Student {
    private final int score;

    public Student(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }
}

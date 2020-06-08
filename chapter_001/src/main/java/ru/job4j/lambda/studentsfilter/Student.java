package ru.job4j.lambda.studentsfilter;

public class Student {
    private int score;
    private String surname;

    public Student(int score) {
        this.score = score;
    }

    public Student(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", surname='" + surname + '\'' +
                '}';
    }
}

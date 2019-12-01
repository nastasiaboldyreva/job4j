package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Вася, Даша, Саша");
        student.setGroup("a, b, c");
        student.setEnter(new Date());

        System.out.println(student.getName() + "  study university in groups  " + student.getGroup());


    }
}

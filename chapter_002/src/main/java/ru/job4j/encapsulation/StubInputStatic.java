package ru.job4j.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class StubInputStatic implements Input {
    //private String[] answers;
    //private int position = 0;
    private List<String> answers;


    //public StubInputStatic(String[] answers) { this.answers = answers; }
    public StubInputStatic(List<String> answers) { this.answers = answers; }

    @Override
    public String askStr(String question) {
        //return answers[position++];
        return answers;
    }

    @Override
    public int askInt(String question) {

        return Integer.valueOf(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }

}

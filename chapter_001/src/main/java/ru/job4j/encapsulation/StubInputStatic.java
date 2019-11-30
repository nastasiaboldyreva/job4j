package ru.job4j.encapsulation;

public class StubInputStatic implements Input{
    private String[] answers;
    private int position = 0;

    public StubInputStatic (String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

}

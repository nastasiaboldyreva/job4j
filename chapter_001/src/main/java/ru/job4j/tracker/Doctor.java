package ru.job4j.tracker;

public class Doctor extends Profession {

    public String drug;
    public String pacient;
    public String disease;


    public void diagnose(String angina) {
        this.disease = angina;

    }

    public String getName() {
        return drug;
    }

}

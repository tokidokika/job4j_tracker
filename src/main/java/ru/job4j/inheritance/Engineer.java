package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String professionArea;

    public Engineer(String name, String surname, String education, String birthday,
                    String professionArea) {
        super(name, surname, education, birthday);
        this.professionArea = professionArea;
    }

    public Engineer() {
    }

    public String getProfessionArea() {
        return professionArea;
    }
}

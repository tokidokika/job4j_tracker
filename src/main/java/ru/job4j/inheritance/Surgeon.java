package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean haveWork;

    public Surgeon(String name, String surname, String education, String birthday,
                   int experience, boolean haveWork) {
        super(name, surname, education, birthday, experience);
        this.haveWork = haveWork;
    }

    public boolean isHaveWork() {
        return haveWork;
    }

    public boolean haveStomachAche(Patient appendicitis) {
        return appendicitis.isStomachache();
    }
}

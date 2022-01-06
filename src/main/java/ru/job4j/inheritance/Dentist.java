package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean checkTooth;

    public Dentist(String name, String surname, String education, String birthday,
                   int experience, boolean checkTooth) {
        super(name, surname, education, birthday, experience);
        this.checkTooth = checkTooth;
    }

    public boolean isCheckTooth() {
        return checkTooth;
    }

    public boolean haveToothAche(Patient caries) {
        return caries.isToothache();
    }
}

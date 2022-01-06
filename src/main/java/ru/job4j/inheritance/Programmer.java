package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int version;

    public Programmer(String name, String surname, String education,
                      String birthday, String professionArea, int version) {
        super(name, surname, education, birthday, professionArea);
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public String whichLanguage(Around language) {
        return language.getLanguage();
    }
}

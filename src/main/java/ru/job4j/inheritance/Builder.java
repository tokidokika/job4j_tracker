package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String typeOfBuild;

    public Builder(String name, String surname, String education, String birthday,
                   String professionArea, String typeOfBuild) {
        super(name, surname, education, birthday, professionArea);
        this.typeOfBuild = typeOfBuild;
    }

    public String getTypeOfBuild() {
        return typeOfBuild;
    }

    public String build(Around building) {
        return building.getBuilding();
    }
}

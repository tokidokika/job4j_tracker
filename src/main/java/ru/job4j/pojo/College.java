package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student newbie = new Student();
        newbie.setGroup(324);
        newbie.setAdmission(new Date());
        newbie.setNameSurname("Ivan Ivanov");

        System.out.println(newbie.getNameSurname() + " admission to the university "
                + newbie.getAdmission() + " and his group is " + newbie.getGroup());
    }
}

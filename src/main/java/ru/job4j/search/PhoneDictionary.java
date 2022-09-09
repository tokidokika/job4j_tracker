package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person rsl : persons) {
            if (rsl.getSurname().contains(key) || rsl.getPhone().contains(key)
                    || rsl.getAddress().contains(key)
                    || rsl.getName().contains(key)) {
                result.add(rsl);
            }
        }
        return result;
    }
}

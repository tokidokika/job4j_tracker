package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            } else {
                throw new ElementNotFoundException("This element doesn't exist");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] value = {"apple", "orange"};
            String key = "plum";
            indexOf(value, "plum");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

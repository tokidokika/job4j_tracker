package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность " + active);
        System.out.println("Номер ошибки " + status);
        System.out.println("Описание ошибки: " + message);
    }

    public static void main(String[] args) {
        Error one = new Error(false, 404, "Ошибка 404");
        Error two = new Error();
        Error three = new Error(true, 500, "Internal Server Error");
        one.printInfo();
        two.printInfo();
        three.printInfo();
    }
}

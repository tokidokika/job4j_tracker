package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 464);
        Book bookTwo = new Book("Discworld", 320);
        Book bookThree = new Book("A Wizard of Earthsea", 320);
        Book bookFour = new Book("Java: The Complete Reference", 1280);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + ": " + books[index].getNumbers()
                    + " numbers");
        }

        System.out.println("Reverse two books");

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + ": " + books[index].getNumbers()
                    + " numbers");
        }
        System.out.println("You shall not pass!");
        for (int index = 0; index < books.length; index++) {
            Book anotherBook = books[index];
            if (anotherBook.getName().equals("Clean code")) {
                System.out.println("Ops, this is not Gandalf: " + books[index].getName() + ": "
                        + books[index].getNumbers() + " numbers");
            }
        }

    }
}

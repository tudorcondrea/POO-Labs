package lab2.task4;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Cartea " + this.title + " a fost scrisa de " + this.author + " in anul " + this.year;
    }
}
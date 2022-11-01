package ru.netology.javaqa;

public class Book extends Product {

    private String author;


    public Book(int id, String title, int cost, String author) {
        super(id, title, cost);
        this.author = author;
    }
    @Override
    public boolean matches(Product product, String search) {
        if (super.matches(product, search)) {
            return true;
        }
        if (author.contains(search)) {
            return true;
        }
        return false;
    }
}

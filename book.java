package az;

public class book {
    String name;
    String author;
    int price = 0;
    int SL = 0;

    public book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public book(String name, String author, int price,int quantify) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.SL = quantify;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
    public int getSL(){
        int booknow = 0;
        return booknow;
    }


    public void display() {
        System.out.println("Name: " + name + ", Author: " + author + ", Price: " + price);
    }
}
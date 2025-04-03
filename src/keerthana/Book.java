package keerthana;

public class Book {
// toString()

    String name;
    String author;

    public Book(){

    }


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString(){
        return "name : "+ this.name + ", author : " + this.author;
    }





}

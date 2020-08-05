package org.levelup.homework4;

public class Book {
    //новый класс, содержащий имя и автора книги

    public Book (){

    }

    String Bookname;
    String Author;

    public Book(String Bookname, String Author) {
        this.Bookname = Bookname;
        this.Author = Author;
    }


    public String getBookname() {
        System.out.println(" name: "+Bookname);
        return Bookname;
    }
}
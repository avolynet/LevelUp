package org.levelup.homework4;

import org.levelup.homework4.Reader;

public class BookApp {

    //класс для проверки работы программы
    public static void main(String[] args) {
        Reader reader1 = new Reader("A", "B", "C", "D", 1, 1, 1);

        Reader reader2 = new Reader("Z", "K", "E", "T", 4, 1, 2);

        Reader[] readers = {reader1,reader2};
        reader1.takeBook(2);

        String [] arrayBooks ={"AA", "BB", "CC"};
        reader1.takeBook(arrayBooks);

        Book book1 = new Book("NN","AA");
        Book book2 = new Book("MM","BB");
        Book book3 = new Book("KK","BB");
        Book book4 = new Book("TT","AA");


        book1.getBookname();

        Book[] aBooks= new Book[]{book1,book2, book3,book4};
        //abooks.getBookname();
        for(int i=0; i<aBooks.length;i++ ){
            System.out.println(" " + aBooks[i].Bookname);
        }

        System.out.println("метод с массивом объектов");
        reader1.takeBook(aBooks);

        //System.out.println("метод с возвратом");

        readers[1].returnBook(5);
        readers[0].returnBook(arrayBooks);
    }
}

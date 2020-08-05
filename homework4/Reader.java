package org.levelup.homework4;

public class Reader extends Book {
    //класс Reader, хранящий информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().

  String name;
    String surname;
    String patronymic;
    String facultet;
    int readerticket;
    int birthdate;
    int phonenumber;

    public Reader(String NEWname, String NEWsurname, String NEWpatronymic, String NEWfacultet,
                  int NEWreaderticket, int NEWbirthdate, int NEWphonenumber) {
        this.name = NEWname;
        this.surname = NEWsurname;
        this.patronymic = NEWpatronymic;
        this.facultet = NEWfacultet;
        this.readerticket = NEWreaderticket;
        this.birthdate = NEWbirthdate;
        this.phonenumber = NEWphonenumber;
    }


    //создается массив объектов данного класса
    Reader[] readers;

    public Reader (Reader[] Newreaders) {
        this.readers = Newreaders;
        for (int i = 0; i < readers.length; i++) {
            System.out.println(i + " value: " + readers[i]);
        }
    }


    public Reader[] Readers(Reader[] Newreaders) {
        this.readers = Newreaders;

        for (int i = 0; i < readers.length; i++) {
            System.out.println("index: " + i + " value: " + readers[i]);
        }
        return readers;
    }

    //takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
    int q; // колличество взятых книг

    public void takeBook(int newq) {
        this.q = newq;
        System.out.println(name + " "+ surname +" взял: " + q + " книги");
    }

    //takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    String[] arrayBooks; // массив с названиями книг

    public void takeBook(String[] arrayBooks) {
        this.arrayBooks = arrayBooks;
        System.out.print(name + " "+ surname+" взял книги: ");
        for (int i = 0; i < arrayBooks.length; i++) {
            System.out.print(arrayBooks[i]+" ");
        }
        System.out.println();
    }

//takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

        Book[] books;

    public void printbooks() {
        for (int j = 0; j < books.length; j++) {
            System.out.print(" " + books[j].Bookname +" ");
        }
        System.out.println();
    }


        public void takeBook(Book [] abooks){
           books = abooks;
           System.out.print(name +" "+surname+": взял книги: ");

            for (int i = 0; i < books.length; i++) {
                if(i<books.length-1) {
                    System.out.print(books[i].Bookname + ", ");
                }else{
                    System.out.print(books[i].Bookname);
                }
            }
            System.out.println();
        }
//returnBook()

    public void returnBook(int newq) {
        this.q = newq;
        if (q>4) {
            System.out.println(name + " " + surname + " вернул: " + q + " книги");
        }else{
            System.out.println(name + " " + surname + " вернул: " + q + " книг");
        }
    }
    //returnBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".

    public void returnBook(String[] arrayBooks1) {
        this.arrayBooks = arrayBooks1;
        System.out.print(name + " "+ surname+": вернул книги: ");
        for (int i = 0; i < this.arrayBooks.length; i++) {
            System.out.print(this.arrayBooks[i]+" ");
        }
        System.out.println();
    }


}


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        PrintStream printStream = new PrintStream(System.out);

        Book book1 = new Book("JK Rowling","Harry Potter 1", "2003", printStream);
        Book book2 = new Book("Lev Grossman","The Magicians","2010", printStream);
        Book book3 = new Book("Mr Author", "My First Book", "2017", printStream);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        Library library = new Library(bookList);

        System.out.println(greeting());


        //library.displayBookInformation(System.out);
    }

    public static String greeting(){
        return "Welcome to Biblioteca!";
    }

}

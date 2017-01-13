import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList();

    public Library(List<Book> books) {
        this.books = books;
    }

    public void displayBookInformation(Book book) {
        book.displayDetails();
    }

//    private void addBooks() {
//        books.add("Harry Potter and the Order of the Phoenix");
//        books.add("The Magicians");
//        books.add("Buddhism Without Beliefs");
//
//    }

}

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList();

    public Library() {
        addBooks();
    }

    public String printList() {
        String bookTitles = "";

        for(String book: books) {
            bookTitles += (book + "\n");
        }
        return bookTitles;
    }

    private void addBooks() {
        books.add("Harry Potter and the Order of the Phoenix");
        books.add("The Magicians");
        books.add("Buddhism Without Beliefs");
    }

}

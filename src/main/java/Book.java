import java.io.PrintStream;

/**
 * Created by ltran on 1/12/17.
 */
public class Book {

    private String author;
    private String title;
    private String yearPublished;
    private PrintStream printStream;

    public Book(String author, String title, String yearPublished, PrintStream printStream) {

        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
    }

    public void displayDetails() {
        printStream.println(author + "/t" + title + "/t" + yearPublished);
    }
}

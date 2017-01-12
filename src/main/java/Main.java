import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        List<String> bookTitles = new ArrayList<String>();
        bookTitles.add("Harry Potter and the Order of the Phoenix");
        bookTitles.add("The Magicians");
        bookTitles.add("Buddhism Without Beliefs");

        System.out.println(greeting());
        System.out.println("Books:\n" + printList(bookTitles));
    }

    public static String greeting(){
        return "Welcome to Biblioteca!";
    }

    public static String printList(List<String> books) {
        String bookTitles = "";

        for(String book: books) {
            bookTitles += (book + "\n");
        }
        return bookTitles;
    }

}

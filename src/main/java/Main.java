import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.List;

/**
 * Created by ltran on 1/11/17.
 */
public class Main {

    public static void main(String[] args){
        System.out.println(greeting());
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

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        System.out.println(greeting());

        Library library = new Library();
        System.out.println("Books:\n" + library.printList());

        library.displayBookInformation(System.out);
    }

    public static String greeting(){
        return "Welcome to Biblioteca!";
    }

}

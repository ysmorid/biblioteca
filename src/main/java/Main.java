import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Library library = new Library();

        System.out.println(greeting());
        System.out.println("Books:\n" + library.printList());
    }

    public static String greeting(){
        return "Welcome to Biblioteca!";
    }

}

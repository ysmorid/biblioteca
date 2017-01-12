import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MainTest {


    @Test
    public void greetingShouldReturnWarmMessage(){
        String result = Main.greeting();
        assertThat(result, is("Welcome to Biblioteca!"));
    }

    @Test
    public void printListShouldReturnListOfBookTitles(){
        List<String> books = new ArrayList();
        books.add("Head First Java");
        books.add("The Unbearable Lightness of Being");
        books.add("And Still I Rise");

        String result = Main.printList(books);

        assertThat(result, is("Head First Java\nThe Unbearable Lightness of Being\nAnd Still I Rise\n"));
    }
}
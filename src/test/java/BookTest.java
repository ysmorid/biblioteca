import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ltran on 1/12/17.
 */
public class BookTest {

    @Test
    public void shouldDisplayDetails() {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("JK Rowling", "Harry Potter and the Order of the Phoenix", "2007", printStream);

        book.displayDetails();

        verify(printStream).println("JK Rowling/tHarry Potter and the Order of the Phoenix/t2007");
    }


}
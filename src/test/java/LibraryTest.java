import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {
    @Test
    public void printListShouldReturnListOfBookTitles(){
        Library library = new Library();

        String result = library.printList();

        assertThat(result, is("Harry Potter and the Order of the Phoenix\nThe Magicians\nBuddhism Without Beliefs\n"));
    }

    @Test
    public void shouldShowBookInformation() {
        Library library = new Library();

        PrintStream printStream = mock(PrintStream.class);

        library.displayBookInformation(printStream);

        verify(printStream).println("J.K. Rowling | Harry Potter and the Order of the Phoenix | 2003");

    }


}
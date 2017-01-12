import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class LibraryTest {
    @Test
    public void printListShouldReturnListOfBookTitles(){
        Library library = new Library();

        String result = library.printList();

        assertThat(result, is("Harry Potter and the Order of the Phoenix\nThe Magicians\nBuddhism Without Beliefs\n"));
    }

}
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by ltran on 1/11/17.
 */
public class MainTest {

    @Test
    public void greetingShouldReturnWarmMessage(){
        String result = Main.greeting();
        assertThat(result, is("Welcome to Biblioteca!"));
    }
}
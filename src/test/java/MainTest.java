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
}
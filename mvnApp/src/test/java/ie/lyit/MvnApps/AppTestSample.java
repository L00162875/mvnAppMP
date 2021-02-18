package ie.lyit.MvnApps;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Ruth.Lennon
 */
public class AppTestSample {
    @Test
    public void testMain() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent)); //make the output go to stream instead of
        // the console
        App.main(null); //call main in the App file
        //check if the output is "Hello world!" and a new line.
        assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
    }
}
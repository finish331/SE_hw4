import static jdk.nashorn.internal.objects.Global.print;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;

public class mainTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void normal_input(){
        String inputData = "90";
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(result);
        System.setOut(printStream);

        main.main(new String[0]);

        assertEquals("Enter the score = The grade of 90 is A\r\n", result.toString());
    }

    @Test
    public void fail_input(){
        String inputData = "==";
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(result);
        System.setOut(printStream);

        main.main(new String[0]);

        assertEquals("Enter the score = Not an integer!\r\n", result.toString());
    }

    @Test
    public void trigger_io_exception(){
        String inputData = "==";
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));
        expectedException.expect(IOException.class);

        main.main(new String[0]);
    }

}

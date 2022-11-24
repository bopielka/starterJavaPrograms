import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ActionsTest {
    Actions action = new Actions();

    @Test
    public void editTextForCheckingTest(){ //POSITIVE TEST
        String input = "Kamil Ślimak";
        String expectedResult = "kamilślimak";

        String result = action.editTextForChecking(input);
        assertEquals(result, expectedResult);
    }

    @Test
    public void printInfoTest(){ //NEGATIVE TEST
        String s = "123";

        assertThrows(NullPointerException.class,() -> action.printInfo(null,s));
    }
}

package assertions.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class JunitSetup {
    @Test
    public void additionsTest() {
        JunitTestSetup junit = new JunitTestSetup();
        int result = junit.add(2, 3);
        assertEquals(5, result);
    }
}
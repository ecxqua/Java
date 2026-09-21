import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zadanie3Test {
    @Test
    public void testGetMax() {
        int result = Zadanie3.getMax(5, 3);
        assertEquals(5, result);
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zadanie2Test {
    @Test
    public void testCalculate() {
        double result = Zadanie2.calculate(0);
        assertEquals(-1.0, result, 0.001);
    }
}

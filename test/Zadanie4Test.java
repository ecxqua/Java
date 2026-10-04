import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zadanie4Test {
    @Test
    public void testCalculate() {
        double result = Zadanie4.calculate(80, 2.0);
        assertEquals(20.0, result, 0.001);
    }
}


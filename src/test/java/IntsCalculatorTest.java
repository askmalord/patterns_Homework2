import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class IntsCalculatorTest {

    private Ints calc = new IntsCalculator();

    @Test
    public void sumTest() {
        int resultOfSum = 9;
        assertThat(resultOfSum, equalTo(calc.sum(4, 5)));
    }
    @Test
    public void multTest() {
        int resultOfMult = 30;
        assertThat(resultOfMult, equalTo(calc.mult(6, 5)));
    }
    @Test
    public void powTest() {
        int resultOfPow = 8;
        assertThat(resultOfPow, equalTo(calc.pow(2, 3)));
    }
}

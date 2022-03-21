import co.com.sofka.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    public StringCalculator stringCalculatorInstance = new StringCalculator();

    //An empty string returns zero
    @Test
    void emptyStringTest() throws Exception{
        Assertions.assertEquals(0,stringCalculatorInstance.add(""));
    }

    @Test
    void singleNumberReturnItsValueTest() throws Exception{
        Assertions.assertEquals(2,stringCalculatorInstance.add("2"));
        Assertions.assertEquals(1,stringCalculatorInstance.add("1"));
    }

    @Test
    void twoNumbersCommaDelimitedReturnsTheSumTest() throws Exception {
        Assertions.assertEquals(2,stringCalculatorInstance.add("0,2"));
        Assertions.assertEquals(2,stringCalculatorInstance.add("1,1"));
        Assertions.assertEquals(3,stringCalculatorInstance.add("1,2"));
    }

}
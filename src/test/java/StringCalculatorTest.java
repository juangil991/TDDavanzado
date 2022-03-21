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

    @Test
    void sameThatBeforeButNewLineDelimitedTest() throws Exception{
        Assertions.assertEquals(2,stringCalculatorInstance.add("0\n2"));
        Assertions.assertEquals(2,stringCalculatorInstance.add("1\n1"));
        Assertions.assertEquals(3,stringCalculatorInstance.add("1\n2"));

    }

    @Test
    void sameThatBeforeButAllDelimitersWorksTest() throws Exception{
        Assertions.assertEquals(6,stringCalculatorInstance.add("1\n2,3"));
        Assertions.assertEquals(7,stringCalculatorInstance.add("1,2\n4"));
    }

    @Test
     void negativeNumbersThrowsAnExceptionTest() throws Exception {
        Assertions.assertThrows(Exception.class,()->stringCalculatorInstance.add("-1,-1"));
    }

    @Test
    void greaterThan1000AreIgnoredTest() throws Exception{
        Assertions.assertEquals(1002,stringCalculatorInstance.add("2,1000"));
        Assertions.assertEquals(2,stringCalculatorInstance.add("2,1001"));
    }

    @Test
    public void singleCharDelimiterTest() throws Exception{
        Assertions.assertEquals(1002,stringCalculatorInstance.add("#2#1000"));
    }

}
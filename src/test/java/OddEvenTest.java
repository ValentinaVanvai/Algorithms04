import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathEven(){
        long number = 8;
        String expectedResult = "Even";

        OddEven ov = new OddEven();
        String actualResult = ov.OddEvenAlgorithm(number);

        Assertions.assertSame(expectedResult,actualResult);

    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathOdd() {
         long number = 9;
        String expectedResult = "Odd";

        OddEven ov = new OddEven();
        String actualResult = ov.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEvenNegative() {
        long number = -8;
        String expectedResult = "Even";

        OddEven ov = new OddEven();
        String actualResult = ov.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathOddNegative() {
        long number = -9;
        String expectedResult = "Odd";

        OddEven ov = new OddEven();
        String actualResult = ov.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathZero() {
        long number = 0;
        String expectedResult = "Even";

        OddEven ov = new OddEven();
        String actualResult = ov.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }



    @Test
    public void testOddEvenUndefined() {
        long number = 214748364799L ;
        String expectedResult = "Undefined";

        OddEven ov = new OddEven();
        String actualResult = ov.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testOddEvenUndefinedNegative() {
        long number = -214748364799L ;
        String expectedResult = "Undefined";

        OddEven ov = new OddEven();
        String actualResult = ov.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}

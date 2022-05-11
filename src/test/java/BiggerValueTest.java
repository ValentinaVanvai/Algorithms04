import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test

    public void TestBiggerValueHappyPath1(){

        int a = 10;
        int b = 5;
        int expectedResult = 10;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void TestBiggerValueHappyPath2(){

        int a = 6;
        int b = 15;
        int expectedResult = 15;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void TestBiggerValueHappyNegative1(){

        int a = -6;
        int b = -15;
        int expectedResult = -6;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void TestBiggerValueHappyNegative2(){

        int a = -60;
        int b = -15;
        int expectedResult = -15;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void TestBiggerValueZero(){

        int a = 0;
        int b = 0;
        int expectedResult = Integer.MIN_VALUE;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test

    public void TestBiggerValueTenTen(){

        int a = 10;
        int b = 10;
        int expectedResult = Integer.MIN_VALUE;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayHappyPath(){

        int []TestData = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(TestData);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathNegative(){

        int []TestData = {0, -1, -2, -3, -4, -5};
        int expectedResult = -15;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(TestData);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayEmptyArray(){  // пустой массив для проверки

        int []TestData = {};
        int expectedResult = Integer.MIN_VALUE;

        SumArray sa = new SumArray();
        int actualResult = sa.SumArray(TestData);

        Assertions.assertEquals(expectedResult, actualResult);



    }



}

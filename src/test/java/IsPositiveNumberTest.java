import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void IsPositiveNumberHappyPath(){

        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void IsPositiveNumberHappyPathNegative(){

        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void IsPositiveNumberHappyPathZero(){

        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);


    }


}

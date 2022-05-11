import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void AreNumbersEqualHappyPath(){

        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void AreNumbersEqualHappyPath2(){

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void AreNumbersEqualHappyPath3(){

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}

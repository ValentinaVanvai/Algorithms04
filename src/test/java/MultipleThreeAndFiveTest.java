import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultipleThreeAndFiveTest {

    @Test

    public void MultipleThreeAndFiveHappyPath(){

        int a = 15;
        String expectedResult = "Good Number";

        MultipleThreeAndFive mtaf = new MultipleThreeAndFive();
        String actualResult = mtaf.MultipleThreeAndFiveAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void MultipleThreeNotFiveHappyPath(){

        int a = 9;
        String expectedResult = "Bad Number";

        MultipleThreeAndFive mtaf = new MultipleThreeAndFive();
        String actualResult = mtaf.MultipleThreeAndFiveAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void MultipleFiveNotThreeHappyPath(){

        int a = 5;
        String expectedResult = "Poor Number";

        MultipleThreeAndFive mtaf = new MultipleThreeAndFive();
        String actualResult = mtaf.MultipleThreeAndFiveAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void MultipleNotThreeNotFiveHappyPath(){

        int a = 11;
        String expectedResult = "-1";

        MultipleThreeAndFive mtaf = new MultipleThreeAndFive();
        String actualResult = mtaf.MultipleThreeAndFiveAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void MultipleNotThreeNotFiveZero(){  // типа 0 кратно и 5 и 3

        int a = 0;
        String expectedResult = "Good Number";

        MultipleThreeAndFive mtaf = new MultipleThreeAndFive();
        String actualResult = mtaf.MultipleThreeAndFiveAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }





}

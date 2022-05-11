import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void TestOddIndicesHappyPath(){
        int[] Input = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        OddIndices od = new OddIndices();
        int[] actualResult = od.OddIndicesAlgorithm(Input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void TestOddIndicesHappyPathTwo(){    // два числа
        int[] Input = {-45, 590};

        int[] expectedResult = {590};

        OddIndices od = new OddIndices();
        int[] actualResult = od.OddIndicesAlgorithm(Input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void TestOddIndicesArrayEmpty(){     // пустой массив
        int[] Input = {};

        int[] expectedResult = {};

        OddIndices od = new OddIndices();
        int[] actualResult = od.OddIndicesAlgorithm(Input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void TestOddIndicesArrayOne(){     //  массив с одним значением
        int[] Input = {1};

        int[] expectedResult = {};

        OddIndices od = new OddIndices();
        int[] actualResult = od.OddIndicesAlgorithm(Input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}

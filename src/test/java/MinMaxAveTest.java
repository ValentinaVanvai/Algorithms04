import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void MinMaxAve(){

        // Написать алгоритм MinMaxAve, который принимает массив чисел int[]
        // и 2 значения индексов. Алгоритм возвращает массив, который содержит минимальное значение,
        // максимальное значение,  и среднее среди всех значений между 2-мя индексами.
        //
        //Test Data:
        //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

        int index1 = 2;
        int index2 = 6;
        int[]array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.MinMaxAveAlgorithm(array, index1, index2);
    }

    @Test
    public void MinMaxAve1(){
        int index1 = 0;
        int index2 = 0;
        int[]array = {2};
        int[] expectedResult = {2, 2, 2};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.MinMaxAveAlgorithm(array, index1, index2);
    }


}

public class OddIndices {

    // Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений
    // нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public int[] OddIndicesAlgorithm(int[] array) {

        int count = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    count++;
                }
            }

            int[] ArrayOddIndices = new int[count];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {

                    ArrayOddIndices[j] = array[i];
                    j++;
                }
            }

            return ArrayOddIndices;


        }
        return new int[]{};
    }
}

public class MinMaxAve {

    public int[] MinMaxAveAlgorithm(int[] array, int index1, int index2) {

        if (array == null || array.length == 0 || array.length < 1 || index1 > index2 || index2 > array.length) {
            return new int[]{};
        }

        int ave = 0;
        int max = array[index2];
        int min = array[index1];


        for (int i = index1; i <= index2; i++) {
            if (array[index1] < array[i]) {
                max = array[i];
            }
            if (array[index1] > array[i]) {
                min = array[i];
            }

        }
        int sum = 0;
        int leght = 0;
        for (int i = index1; i <= index2; i++) {
            sum += array[i];
            leght++;
            ave = sum / leght;
        }

        int[] result = {min, max, ave};
        return result;
    }




}

public class OddEven {

    //1.	Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет
    // “Undefined”.
    //
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”
    //2147483647 + 1 →  “Undefined”

    public String OddEvenAlgorithm(long number) {
        String result;
        if ((number >= -2147483648L) && (number <= 2147483647L)) {
            if (number % 2 == 0) {

                return result = "Even";
            } else  {

                return result = "Odd";
            }


        }

        return result = "Undefined";
        }








}

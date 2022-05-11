public class MultipleThreeAndFive {

    public String MultipleThreeAndFiveAlgorithm(int a){
        if (a % 3 == 0 && a % 5 == 0){
            return "Good Number";
        } else if (a % 3 == 0 && a % 5 != 0){
            return "Bad Number";
        } else if (a % 3 != 0 && a % 5 == 0){
            return "Poor Number";
        } else return "-1";

    }




}

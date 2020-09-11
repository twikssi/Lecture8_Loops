package by.andrey.twikssi.exer5powercalculator.service;

public class PowerCalculator {

    private PowerCalculator() {
    }

    public static String getNumberIntDegree (int number, int degree){
        String result = "";
        int resultInt = number;
        if (degree == 0){
            return result + 1;
        }

        for (int i = 1; i < Math.abs(degree) ; i++){
            resultInt *= number;
        }

        if (degree < 0){
            result = "1/";
            return result + resultInt;
        }
        return result + resultInt;
    }
}

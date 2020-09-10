package by.andrey.twikssi.exer3numberservice.service;

public class NumberService {

    private NumberService() {
    }

    public static int rangeSum(int start, int finish){
        int sum = 0;
        if(finish > start){
            sum = sum(start,finish);
            return sum;
        } else if (finish < start){
            sum = sum(finish, start);
            return sum;
        } else {
            return sum;
        }
    }

    public static int sum(int start, int finish){
        int sum = 0;
        for (int i = start; i <= finish; i++){
            sum += i;
        }
        return sum;
    }

    public static int sumEven(int start, int finish){
        int sum = 0;
        for (int i = start; i <= finish; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }


    public static int rangeEvenCount(int start, int finish){
        int sum = 0;
        if(finish > start){
            sum = sumEven(start,finish);
            return sum;
        } else if (finish < start){
            sum = sumEven(finish, start);
            return sum;
        } else {
            return sum;
        }
    }


}

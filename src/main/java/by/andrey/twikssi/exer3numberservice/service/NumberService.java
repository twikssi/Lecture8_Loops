package by.andrey.twikssi.exer3numberservice.service;

public class NumberService {

    private NumberService() {
    }

    public static int rangeSum(int start, int finish){
        if(finish > start){
            return sum(start,finish);
        } else if (finish < start){
            return sum(finish, start);
        } else {
            return 0;
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
        if(finish > start){
            return sumEven(start,finish);
        } else if (finish < start){
            return sumEven(finish, start);
        } else {
            return 0;
        }
    }


}

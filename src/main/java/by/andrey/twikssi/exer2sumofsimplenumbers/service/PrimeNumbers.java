package by.andrey.twikssi.exer2sumofsimplenumbers.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeNumbers {
    public static final Logger logger = LoggerFactory.getLogger(PrimeNumbers.class);

    private PrimeNumbers() {
    }

    public static int[] getSumPrimeNumbers(){
        int sum = 0;
        int counterNumber = 0;
        int counter = 0;
        int[] sumAndCounter = new int[2];

        for(int j = 2; j < 500 ; j++){
            for(int i = 2; i < j ; i++){
                if (j % i == 0){
                    counterNumber++;
                }
            }

            if(j == 17 || j == 71){
                continue;
            }

            if (counterNumber < 1 ){
                sum += j;
                counter++;
            }

            if(counter == 50){
                break;
            }

            counterNumber = 0;
        }
          sumAndCounter[0] = sum;
        sumAndCounter[1] = counter;

        return sumAndCounter;
    }
}

package by.andrey.twikssi.exer1tableoddnumbers.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhileOddChecker {
    public static Logger logger = LoggerFactory.getLogger(ForOddChecker.class);

    private WhileOddChecker() {
    }

    public static void showOddNumbers(){
        int oddValue = 1;
        logger.info("Odd numbers are ");
        logger.info(String.valueOf(1));
        while (oddValue != 49){
            oddValue += 2;
            logger.info(String.valueOf(oddValue));
        }
    }
}

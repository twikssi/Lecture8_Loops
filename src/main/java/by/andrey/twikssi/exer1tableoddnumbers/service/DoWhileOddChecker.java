package by.andrey.twikssi.exer1tableoddnumbers.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoWhileOddChecker {
    public static Logger logger = LoggerFactory.getLogger(ForOddChecker.class);

    private DoWhileOddChecker() {
    }

    public static void showOddNumbers(){
        int oddValue = 1;
        logger.info("Odd numbers are ");
        logger.info(String.valueOf(1));
        do {
            oddValue += 2;
            logger.info(String.valueOf(oddValue));
        } while (oddValue != 49);
    }
}

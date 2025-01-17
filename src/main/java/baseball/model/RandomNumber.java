package baseball.model;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static baseball.utils.ConstantValue.*;

public class RandomNumber{

    private RandomNumber(){}

    public String getNumberString(){
        return createRandomNumbers();
    }

    private static class  NumberHolder{
        public static final RandomNumber randomNumber = new RandomNumber();
    }

    public static RandomNumber getInstance(){
        return NumberHolder.randomNumber;
    }

    private String createRandomNumbers() {
        return ThreadLocalRandom.current()
                .ints( MIN_NUM,MAX_NUM)
                .distinct()
                .limit(MAX_ROUND)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }


}

package model;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class RandomNumber{

    public String getNumberString(){
        return createRandomNumbers();
    }

    private static class Cache {
        public static final RandomNumber randomNumber = new RandomNumber();
    }

    public static String getInstance(){
        return Cache.randomNumber.getNumberString();
    }

    public static String createRandomNumbers() {
        return ThreadLocalRandom.current()
                .ints(1,10)
                .distinct()
                .limit(3)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }


}

package utils;

import java.util.stream.Stream;

public class NumberValidationUtil {

    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;
    public static final int MIN_LENGTH = 100;
    public static final int MAX_LENGTH = 999;
    public static final int MIN_ROUND = 1;
    public static final int MAX_ROUND = 3;

    public static boolean validNum(int num) { return Stream.of(num).allMatch(n -> n >= MIN_NUM && n <= MAX_NUM); }

    public static boolean validLength(int number) { return number >= MIN_LENGTH && number <= MAX_LENGTH; }

    public static boolean validRoundNum(int round) { return round >= MIN_ROUND && round <= MAX_ROUND; }
}

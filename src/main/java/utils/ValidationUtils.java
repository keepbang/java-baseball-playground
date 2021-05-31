package utils;

public class ValidationUtils {

    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;
    public static final int MIN_LENGTH = 100;
    public static final int MAX_LENGTH = 999;

    public static boolean validNum(int num) {
        return num >= MIN_NUM && num <= MAX_NUM;
    }

    public static boolean validLength(int number) {
        return number >= MIN_LENGTH && number <= MAX_LENGTH;
    }
}

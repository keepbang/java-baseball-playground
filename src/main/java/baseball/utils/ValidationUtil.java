package baseball.utils;

import java.util.Arrays;

import static baseball.utils.ConstantValue.*;

public class ValidationUtil {


    public static boolean validNum(String numberString) {
        return Arrays.stream(numberString.split(""))
                .mapToInt(Integer::parseInt)
                .allMatch(n -> n >= MIN_NUM && n < MAX_NUM);
    }

    public static boolean validLength(String numberString) {
        return numberString.length() == NUMBER_LENGTH;
    }

    public static boolean isInteger(String numberString) {
        return numberString.chars()
                .allMatch(Character::isDigit);
    }
}

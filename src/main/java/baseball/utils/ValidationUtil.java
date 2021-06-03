package baseball.utils;

import java.util.stream.Stream;

import static baseball.utils.ConstantValue.*;

public class ValidationUtil{


    public static boolean validNum(int num) { return Stream.of(num).allMatch(n -> n >= MIN_NUM && n < MAX_NUM); }

    public static boolean validLength(String numberString) { return numberString.length() == NUMBER_LENGTH; }

    public static boolean isInteger(String numberString) {
        return numberString.chars()
                .allMatch(Character::isDigit);
    }
}

package calculator.utils;

public class ValidationUtils {

    public static boolean isInteger(String numberString) {
        return numberString.chars()
                .allMatch(Character::isDigit);
    }

    public static boolean isOperator(String orperator){
        return orperator.matches("[-*/+]?$");
    }
}

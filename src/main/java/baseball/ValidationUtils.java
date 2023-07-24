package baseball;

public class ValidationUtils {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public static boolean isNumber(int number) {
        return number >= MIN_NUMBER && number <= MAX_NUMBER;
    }
}

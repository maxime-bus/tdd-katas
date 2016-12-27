package info.busmaxime.stringcalculator.day1;

public class StringCalculator {

    public static final String COMMA_SEPARATOR = ",";
    public static final String NEWLINE_SEPARATOR = "\n";

    public static int add(String expression) {

        if (expression.contains(COMMA_SEPARATOR) || expression.contains(NEWLINE_SEPARATOR)) {
            String[] stringNumbers = expression.split("[,|\n]");

            int result = 0;

            for (String stringNumber : stringNumbers) {
                result += Integer.parseInt(stringNumber);
            }

            return result;
        }

        if (!expression.isEmpty()) {
            return Integer.parseInt(expression);
        }

        return 0;
    }

}

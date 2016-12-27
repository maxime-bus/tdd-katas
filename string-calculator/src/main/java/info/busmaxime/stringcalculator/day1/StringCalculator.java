package info.busmaxime.stringcalculator.day1;

public class StringCalculator {

    public static int add(String expression) {

        if (expression.contains(",")) {
            String[] stringNumbers = expression.split(",");

            int result = 0;

            for (String stringNumber : stringNumbers) {
                result += Integer.parseInt(stringNumber);
            }

            return result;
        }

        if (notEmpty(expression)) {
            return Integer.parseInt(expression);
        }

        return 0;
    }

    private static boolean notEmpty(String expression) {
        return !"".equals(expression);
    }
}

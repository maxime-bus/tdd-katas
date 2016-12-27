package info.busmaxime.stringcalculator.day1;

public class StringCalculator {

    public static int add(String expression) {
        if(notEmpty(expression)) {
            return Integer.parseInt(expression);
        }
        return 0;
    }

    private static boolean notEmpty(String expression) {
        return !"".equals(expression);
    }
}

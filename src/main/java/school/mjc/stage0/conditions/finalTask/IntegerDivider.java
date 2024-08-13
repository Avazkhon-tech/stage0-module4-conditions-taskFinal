package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = 0;
        try {
            result = dividend / divider;
        } catch (Exception e) {
            System.out.println("division by zero");
            return;
        }

        System.out.println(result * divider == dividend? "can be divided completely": "cannot be divided completely");
    }
}

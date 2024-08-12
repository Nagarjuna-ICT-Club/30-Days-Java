

public class LogicalOperator {
    public static void main(String[] args) {
        boolean andResult = (5 > 3) && (8 > 6); // result is true
        boolean orResult = (5 > 3) || (8 < 6); // result is true
        boolean notResult = !(5 > 3); // result is false

        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(notResult);

    }
}

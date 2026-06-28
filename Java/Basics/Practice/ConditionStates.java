package Practice;

public class ConditionStates {
    public static void main(String[] args) {
        System.out.println("----- IF statement -----");
        int i = 10;
        if (i < 15) {
            System.out.println("Condition is True");
        }
        System.out.println("");

        System.out.println("----- IF-ELSE statement -----");
        int i1 = 10;

        if (i1 < 15)
            System.out.println("i1 is smaller than 15");
        else
            System.out.println("i1 is greater than 15");
        System.out.println("");

        System.out.println("----- NESTED-IF statement -----");
        int i2 = 10;
                                                            // Outer if statement
        if (i2 < 15) {
            System.out.println("i2 is smaller than 15");
                                                            // Nested if statement
            if (i2 == 10) {
                System.out.println("i2 is exactly 10");
            }
        }
        System.out.println(" ");

        System.out.println("----- IF-ELSE-IF statement -----");
        int j = 20;
        if (j == 10)
            System.out.println("j is 10");
        else if (j == 15)
            System.out.println("j is 15");
        else if (j == 20)
            System.out.println("j is 20");
        else
            System.out.println("j is not present.");
        System.out.println("");

        System.out.println("----- SWITCH statement -----");
        int num = 20;
        switch (num) {
        case 5:
            System.out.println("It is 5");
            break;
        case 10:
            System.out.println("It is 10");
            break;
        case 15:
            System.out.println("It is 15");
            break;
        case 20:
            System.out.println("It is 20");
            break;
        default:
            System.out.println("Not Present");
        }
    }
}

package Practice;

public class Loops {
    public static void main(String[] args) {
        System.out.println("------ For Loop ------");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("------ For Each Loop ------");
        String[] names = { "John", "Bob", "Ben" };
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println("");

        System.out.println("------ While Loop ------");
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        System.out.println("------ Do While Loop ------");
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
        System.out.println("");

        System.out.println("------ Jump Statements ------");
        System.out.println(">>>> Continue <<<<");
        for (int k = 0; k < 5; k++) {
            if (k == 2){
                    System.out.println();
                  // using continue keyword 
                  // to skip the current iteration
                continue;
            }
            System.out.println(k);
        }
        System.out.println("");

        System.out.println(">>>> Break <<<<");
        int n = 10;
        for (int num = 0; num < n; num++) {
            if (num == 4)
                break;
            System.out.println(num);
        }
    }
}

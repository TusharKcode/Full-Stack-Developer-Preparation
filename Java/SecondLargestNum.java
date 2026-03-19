import java.util.ArrayList;
import java.util.Scanner;

class FindSecondLargestNum{

    void nums(ArrayList<Integer> a){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : a){
            if(num > max1){
                max2 = max1;
                max1 = num;
            } else if(num > max2 && num != max1){
                max2 = num;
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second largest number found");            
        } else {
            System.out.println("Second largest number is: " + max2);
        }
    }

}

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 1;

        while (true) {
            System.out.println("Enter the number or 'e' to exit: " + counter);
            if (scn.hasNextInt()) {
                numbers.add(scn.nextInt());
                counter++;
            } else {
                String input = scn.next();
                if (input.equalsIgnoreCase("e")) {
                    break;
                } else {
                    System.out.println("Invalid, Enter 'e' to exit");
                }
            }
        }
        FindSecondLargestNum fsln = new FindSecondLargestNum();
        fsln.nums(numbers);     

        scn.close();
    }
}

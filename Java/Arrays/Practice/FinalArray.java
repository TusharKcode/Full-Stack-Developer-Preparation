package Java.Arrays.Practice;

import java.util.Arrays;

public class FinalArray {
    // Modifying Object State Referenced by a Final Variable
    int p = 20;
    public static void main(String[] args) {

        final FinalArray f = new FinalArray();
        f.p = 22;
        System.out.println(f.p);

        final int[] arr = {10, 20, 30};
        // Modifying Elements of a Final Array
        arr[2] = 99;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        // Assigning new element into the array
        arr[0] = 10;
        System.out.println("Array after modifying first element of an array: " + Arrays.toString(arr));

    }
}

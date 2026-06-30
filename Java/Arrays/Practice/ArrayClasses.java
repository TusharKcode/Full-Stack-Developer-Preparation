package Java.Arrays.Practice;

import java.util.Arrays;

public class ArrayClasses {
    public static void main(String[] args) {
        System.out.println("---- asList() method ----");
        int intArr[] = {10, 20, 30, 40, 50};
        System.out.println("Array as list: " + Arrays.asList(intArr));      // [[I@19469ea2]

        System.out.println("");

        System.out.println("---- binarySearch() methods ----");
        int bArr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int noKey = 45;
        int key2 = 33;
        System.out.println(key + " Searching Array found at index: " + Arrays.binarySearch(bArr, key));
        System.out.println(noKey + " Searching Array not found in the array: " + Arrays.binarySearch(bArr, noKey));
        System.out.println(key2 + " Searching Array from index 1 to 3: " + Arrays.binarySearch(bArr,
            1, 3, key2));

        System.out.println("");

        System.out.println("---- compare() method ----");
        int intArr2[] = {10, 15, 30};
        System.out.println("Comparing Arrays: " + Arrays.compare(intArr2, intArr));

    }
}

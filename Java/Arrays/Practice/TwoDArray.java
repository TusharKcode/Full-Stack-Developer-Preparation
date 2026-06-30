package Java.Arrays.Practice;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Declaring a 2D array
        int[][] arr;

        // Initializing row and column sizes
        arr = new int[1][3];

        // Assigning values
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 7;

        // Displaying values
        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[0][2] = " + arr[0][2]);

        // Array Initialized and Assigned
        int[][] arr2d = { { 1, 2 }, { 3, 4 } };

      	// Printing the Array
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(arr2d[i][j]+" ");
            System.out.println();
        }

        int[][] arrAccess = { { 1, 2 }, { 3, 4 } };
		System.out.println("a[0][0] : " + arrAccess[0][0]);
        System.out.println("a[0][1] : " + arrAccess[0][1]);
        System.out.println("a[1][0] : " + arrAccess[1][0]);
        System.out.println("a[1][1] : " + arrAccess[1][1]);

        System.out.println("");
        System.out.println("----- 2D-Array by User Input -----");
        
        Scanner arrScn = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = arrScn.nextInt();
        System.out.println("Enter number of columns: ");
        int col = arrScn.nextInt();

        int[][] arrInp = new int[row][col];
        System.out.println("Enter elements of Array: ");

        for (int i = 0; i < row; i++) {             // Input from User for each element
            for (int j = 0; j < col; j++) {
                arrInp[i][j] = arrScn.nextInt();
            }
        }

        System.out.println("Elements of an array are: ");
        for (int i = 0; i < row; i++) {             // Printing elements of Array
            for (int j = 0; j < col; j++) 
                System.out.print(arrInp[i][j] + " ");
            System.out.println();
        }
        arrScn.close();
    }
}


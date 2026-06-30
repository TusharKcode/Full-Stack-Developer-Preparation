package Java.Arrays.Practice;

public class ThreeDArray {
    public static void main(String[] args) {
        System.out.println("----- 3D Array -----");
        int[][][] arr3d = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }
        };

        int n = arr3d.length;
        int m = arr3d[0].length;
        int o = arr3d[0][0].length;

        //  'i' is the array number, 'j' is the row number and 'k' is the column number. 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + arr3d[i][j][k]);
                }
            }  
        }

        // Accessing an elements
        // Printing array at index 0 , 0 , 0
        System.out.println("arr[0][0][0] = " + arr3d[0][0][0]);
    }
}

public class MatrixAddition {
    public static void main(String[] args) {
        int [][] a = {{1,2},{3,4}};
        int [][] b = {{5,6},{7,8}};
        int [][] c = new int[2][2];

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                c[row][col] = a[row][col] + b[row][col];
                System.out.println(c[row][col] + " ");
            }
            System.out.println();
        }    
    }   
}

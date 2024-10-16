package MultidimensionalArrays;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,5,3},{2,7,4}};
        int[][] b = {{2,5,1},{5,2,1},{4,1,2}};

        // // Using an extra matrix
        // int[][] res = new int[3][3];

        // for (int i = 0; i < res.length; i++) {
        //     for (int j = 0 ; j < res[0].length ; j++) {
        //         res[i][j] = a[i][j] + b[i][j];
        //         System.out.print(res[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // Without using an extra matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < a[0].length ; j++) {
                a[i][j] = a[i][j] + b[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

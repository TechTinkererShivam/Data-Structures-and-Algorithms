package MultidimensionalArrays;

public class Imp_MultiplyTwoMatrices {

    public static void printArray(int[][] arr){
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,0},{4,1,1},{0,2,1}};
        int[][] B = {{1,2,0},{0,1,1},{1,0,1}};

        if(A[0].length != B.length){
            System.out.println("Multiplication is not possible");
            return;
        }

        int[][] res = new int[A.length][B[0].length];

        //code to multiply two matrices
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {

                // code to get each ele of res matrix
                for (int k = 0; k < B.length; k++) {
                    res[i][j] += A[i][k]*B[k][j]; 
                }

            }
        }

        printArray(A);
        printArray(B);
        //Printing the resultant matrix
        System.out.println("Matrix after Multiplication:");
        printArray(res);
        
    }
}
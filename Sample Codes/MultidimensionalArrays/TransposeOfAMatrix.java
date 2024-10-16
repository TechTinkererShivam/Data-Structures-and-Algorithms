package MultidimensionalArrays;

public class TransposeOfAMatrix {

    public static void printArray(int[][] arr){
        //Printing the matrix using for-each loop
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};

        // Row wise printing
        System.out.println("Given Matrix : ");
        for(int i=0 ; i<a.length ; i++){    //rows
            for(int j=0 ; j<a[0].length ; j++){    //cols
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        // //  Cols wise printing (i.e., Transpose)
        // System.out.println("\nTranspose of Matrix : ");
        // for(int j=0 ; j<a[0].length ; j++){//cols
        //     for(int i=0 ; i<a.length ; i++){//rows
        //         System.out.print(a[i][j]+" ");
        //     }
        //     //System.out.println();
        // }

        //Storing transpose in a new matrix
        int[][] res = new int[a[0].length][a.length];
        for(int i=0 ; i<res.length ; i++){
            for(int j=0 ; j<res[0].length ; j++){
                res[i][j] = a[j][i];
            }
        }
        System.out.println("Transpose Matrix:");
        printArray(res);





        

    }
    
}
package MultidimensionalArrays;

                        // 2D Array : Array of arrays

import java.util.*;

public class _2DArrayBasics {

    public static void inputArray(int[][] arr, int m, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            } 
        }
        sc.close();
    }

    public static void printArray(int[][] arr){ //Using for-each loop
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // //declaration and memory allocation
        // int[][] arr = new int[2][3]; // 2 rows & 3 cols.

        // //initialisation
        // arr[0][0]=10;
        // arr[0][1]=20;
        // arr[0][2]=30;
        // arr[1][0]=40;
        // arr[1][1]=50;
        // arr[1][2]=60;

        // //Printing of 2D Array
        // for(int i=0 ; i<2 ; i++){
        //     for(int j=0 ; j<3 ; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // //declaration, memory allocation and initialisation
        // int[][] arr = {{1,2,3},{6,5,4},{9,0,8}};
        // printArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        inputArray(arr, m, n);
        System.out.println();
        printArray(arr);
        sc.close();

        System.out.println(arr.length); // gives no. of rows
        System.out.println(arr[0].length); // gives no of cols   
    }
}



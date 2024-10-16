package MultidimensionalArrays;

import java.util.Scanner;

public class Imp_SearchInA2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element : ");
        int x = sc.nextInt();
        sc.close(); 
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        
        // // code of searching in 2D Matrix (Starting from top-right)
        // int i=0, j=arr[0].length-1;
        // boolean status=false;
        // while(i<arr.length && j>=0){
        //     if(arr[i][j]==x){
        //         status=true;
        //         break;
        //     }
        //     else if(arr[i][j]>x) j--; // go left
        //     else i++; // go down
        // }
        // System.out.println(status);

        // code of searching in 2D Matrix (Starting from bottom-left)
        int i=arr.length-1, j=0;
        boolean status=false;
        while(i>=0 && j<arr[0].length){
            if(arr[i][j]==x){
                status=true;
                break;
            }
            else if(arr[i][j]>x) i--; // go up
            else j++; // go right
        }
        System.out.println(status);
        
    }
}

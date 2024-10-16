package Recursion;

import java.util.Scanner;

  // Very Imp. Ques
public class MazePath { // using 4 variables

    public static int ways(int row, int col, int m, int n){
        if(row==m || col==n) return 1; // base case
        // work
        int rightWays = ways(row,col+1,m,n);
        int downWays = ways(row+1,col,m,n);
        return rightWays+downWays; // recursive call
    }

//    // ways function having different base case
//    public static int ways(int row, int col, int m, int n){
//        // base case [doubt]
//        if(row>m || col>n) return 0;
//        if(row==m && col==n) return 1;
//        // work
//        int rightWays = ways(row,col+1,m,n);
//        int downWays = ways(row+1,col,m,n);
//        return rightWays+downWays; // recursive call
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(ways(1,1,m,n));

    }
}


//    // Very Imp. Ques
//public class MazePath { // using 2 variables
//
//    public static int ways(int m, int n){
//        if(m==1 || n==1) return 1; // base case
//        // work
//        int rightWays = ways(m,n-1);
//        int downWays = ways(m-1,n);
//        return rightWays+downWays; // recursive call
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter m : ");
//        int m = sc.nextInt();
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//
//        System.out.println(ways(m,n));
//
//    }
//}

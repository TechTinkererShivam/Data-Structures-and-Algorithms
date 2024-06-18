package Recursion;

import java.util.Scanner;

//public class StairPath { // [paths(5) = paths(4)+paths(3)] in steps of 1 or 2
//
//    public static int paths(int n){
//        if(n==1 || n==2) return n;
//        return paths(n-1)+paths(n-2); // // paths(n)=paths(n-1)+paths(n-2)
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();
//
//        System.out.println(paths(n));
//
//    }
//}


public class StairPath { // [paths(5) = paths(4)+paths(2)] in steps of 1 or 3

    public static int paths(int n){
        if(n==1 || n==2) return 1;
        if(n==3) return 2;
        return paths(n-1)+paths(n-3); // paths(n)=paths(n-1)+paths(n-3)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(paths(n));

    }
}


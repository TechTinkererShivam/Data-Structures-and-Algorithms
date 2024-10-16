package Recursion;

import java.util.Scanner;

/*
public class SumFrom1toN { // [parameterised]

    public static void sum(int n, int s){
        if(n==0){ // base case
            System.out.println(s);
            return;
        }
        sum(n-1,s+n); // call & work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        sum(n,0);

    }
}
*/


public class SumFrom1toN { // [return type]

    public static int sum(int n){
        if(n==1 || n==0) return n; // base case
        return n+sum(n-1); // call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(sum(n));

    }
}

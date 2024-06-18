package Recursion;

import java.util.Scanner;

public class NthFibonacciNumber { // Fibonacci Series : 1 1 2 3 5 . . .

    // Imp Lecture : Euler's tour of tree
    public static int fib(int n){
        if(n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(fib(n));

    }
}

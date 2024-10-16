package Recursion;

/*
    recursion : function calling itself
    // Factorial Recurrence Relation : [n! = n*(n-1)!]
*/


import java.util.*;

public class RecursionBasics {

    public static int fact(int n){
        if(n==1 || n==0) return 1; // base case
        return n*fact(n-1); // recursive call

    }

    public static void main(String[] args) {
        // factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Factorial of "+n+" : "+fact(n));

    }
}

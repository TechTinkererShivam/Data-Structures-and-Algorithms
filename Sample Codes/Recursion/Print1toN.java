package Recursion;

import java.util.Scanner;

public class Print1toN { // without using an extra parameter

    public static void print(int n){
        if(n==0) return; // base case
        print(n-1); // recursive call
        System.out.print(n+" "); // work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        print(n);

    }
}

/*
public class Print1toN { // using an extra parameter

    public static void print(int n, int a){
        if(a>n) return; // base case
        System.out.println(a++); // work
        print(n,a); // recursive call

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        print(n,1);

    }
}
*/


/*
public class Print1toN { // using a global variable

    static int n;

    public static void print(int a){
        if(a>n) return; // base case
        System.out.println(a++); // work
        print(a); // recursive call

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        print(1);

    }
}
*/

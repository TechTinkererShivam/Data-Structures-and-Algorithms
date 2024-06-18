package Recursion;

import java.util.Scanner;

//public class PreInPost {
//    public static void pip(int n){ // pip = pre in post
//        if(n==0) return; // base case
//        System.out.println("pre : "+n); // pre
//        pip(n-1);
//        System.out.println("in : "+n); // in
//        pip(n-1);
//        System.out.println("post : "+n); // post
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();
//
//         pip(n);
//
//    }
//}


// zig-zag pattern printing
public class PreInPost {
    public static void zigZag(int n){
        if(n==0) return; // base case
        System.out.print(n+" "); // pre
        zigZag(n-1);
        System.out.print(n+" "); // in
        zigZag(n-1);
        System.out.print(n+" "); // post
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

         zigZag(n);

    }
}

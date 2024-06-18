package ArraysAndArrayLists;

import java.util.Scanner;

public class ArraysBasics{

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void inputArray(int[] arr,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int[] arr = new int[5]; // declaration and memory allocation

        // /* 

        //    int[] nums;  // declaration
        //    nums = new int[10];  // memory allocation

        // */
        
        // printArray(arr);    // by default 0

        // // initialisation
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // printArray(arr);

        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        inputArray(marks, 0);
        printArray(marks);
        sc.close();
        
        /*
         *  Another method of Array declaration and initialisation
         * 
         *  int[] arr = {10,2,30,20,4,50,98};
         *  sout(arr.length); // 7
         * 
         */

        int som = 0; // som = sum of marks
        for(int i=0 ; i < marks.length ; i++){
            som += marks[i];
        }
        
        System.out.println("Sum of marks : "+som);

        int pom = 1; // pom = product of marks
        for(int i=0 ; i < marks.length ; i++){
            pom *= marks[i];
        }
        
        System.out.println("Product of marks : "+pom);


    }
}

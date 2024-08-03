package ArraysAndArrayLists;

import java.util.*;

//Scanner sc = new Scanner(System.in);
//sc.close();

/*         // Arrays.sort(array_name)
 *
 * Timsort is a fast sorting algorithm working at stable O(Nlog(N)) complexity.
 * Timsort is a blend of Insertion Sort and Mergesort. 
 * This algorithm is implemented in Java as Arrays.sort()
 * 
 */

public class PassArrayToFunc {

    public static void modify(int x){
        x = 15;
    }

    public static void modifyArray(int[] nums){
        nums[0] = 15;
    }

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        // Pass by value (int, float, double, etc)
        int x = 10;
        System.out.println(x);//10
        modify(x);
        System.out.println(x);//10  [since x are different]


        // Pass by reference (array)
        int[] arr = {10,-420,130,-407,150};
        System.out.println(arr[0]);//10
        modifyArray(arr);
        System.out.println(arr[0]);//15  [both arr & nums are refering to the same Array]

        printArray(arr);

        // Built-in function [Arrays.sort(array_name)]
        Arrays.sort(arr);
        printArray(arr);
    }
}

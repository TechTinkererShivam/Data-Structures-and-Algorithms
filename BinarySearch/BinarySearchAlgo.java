package BinarySearch;

public class BinarySearchAlgo { // TC : O(log(n))
    public static void main(String[] args) {
        int[] arr = {12,15,25,36,45,56,78,98,100}; // sorted array
        int n = arr.length;
        int target = 92;

        boolean status = false; // assuming target is not present in the array

        // code of binary search algorithm
        int low=0, high=n-1;
        while(low <= high){
            int mid = low + (high-low)/2; // don't write (low+high)/2 to avoid integer overflow.
            if(arr[mid]>target) high = mid-1;
            else if (arr[mid]<target) low = mid+1;
            else{ // (arr[mid]==target)
                status = true;
                break;
            }
        }
        if(status==true) System.out.println("Target found!");
        else System.out.println(target+" doesn't exist in the array");
    }
}
/*
 *  O(log(n)) >> O(n) > O(n^2)
 *                      --- where '>' means faster
 */
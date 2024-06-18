package BinarySearch;

public class LowerAndUpperBound { 
    public static void main(String[] args) {
        int[] arr = {12,15,15,25,25,36,45,56}; // sorted array
        int n = arr.length;
        int x = 15;
        
        // code to find lower bound : arr[idx] >= x then lb = idx
        int lb = n;
        int low=0, high=n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= x){
                lb = Math.min(mid, lb);
                high = mid-1;
            }
            else low = mid+1;
        }
        System.out.println("Lower bound : "+lb);


        // // code to find upper bound : arr[idx] > x then ub = idx
        // int ub = n;
        // int low=0, high=n-1;
        // while(low <= high){
        //     int mid = low + (high-low)/2;
        //     if(arr[mid] > x){
        //         ub = Math.min(mid, ub);
        //         high = mid-1;
        //     }
        //     else low = mid+1;
        // }
        // System.out.println("Upper bound : "+ub);
    }
}

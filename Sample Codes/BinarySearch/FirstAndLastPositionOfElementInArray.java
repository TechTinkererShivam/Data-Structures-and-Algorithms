package BinarySearch;

public class FirstAndLastPositionOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10,15,20};
        int n = arr.length;
        int target = 50;
        boolean status = false;

        int lb=n, ub=n; // lr & ur = lower range & upper range
        int low=0, high=n-1;
        while(low <= high){
            int mid = low + (high-low)/2; 
            if(arr[mid]>target) high = mid-1;
            else if (arr[mid]<target) low = mid+1;
            else{ // (arr[mid]==target)
                status = true;
                break;
            }
        }

        if(status==false) System.out.println(target+" doesn't exist!");
        else{
            low=0; high=n-1;
            while(low <= high){
                int mid= low+(high-low)/2;
                if(arr[mid]>=target){
                    lb=Math.min(lb,mid);
                    high=mid-1;
                }
                else low=mid+1;
            }
            System.out.println(lb);

            low=0; high=n-1;
            while(low <= high){
                int mid= low+(high-low)/2;
                if(arr[mid] > target){
                    ub=Math.min(ub,mid);
                    high=mid-1;
                }
                else low=mid+1;
            }
            System.out.println(ub);

            System.out.println("Lower Index : "+lb);
            System.out.println("Upper Index : "+(ub-1));

        }
        
    }
}

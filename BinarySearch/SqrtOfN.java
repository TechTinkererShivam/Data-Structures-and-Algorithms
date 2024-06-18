package BinarySearch;

import java.util.*;

public class SqrtOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        sc.close();

        // code of sqrt(x)
        int low=1, high=x;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(mid*mid==x){
                System.out.println("Square root of "+x+" is "+mid);
                return;
            }
            else if(mid*mid>x) high=mid-1;
            else low=mid+1;
        }

        System.out.println("Square root of "+x+" is "+high);
        return;
    }                                                                           
}

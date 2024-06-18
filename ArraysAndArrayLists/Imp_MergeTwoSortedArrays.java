package ArraysAndArrayLists;

public class Imp_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,9,100};
        int[] b = {5,8,9,10,12,45,58,102,458};
        int[] c = new int[a.length + b.length];

        // // Code to merge sorted array : initialising (i=0,j=0,k=0)
        // int i=0, j=0, k=0;
        // while(i<a.length && j<b.length){
        //     if(a[i]<=b[j]){
        //         c[k]=a[i];
        //         i++; k++;
        //     }
        //     else{
        //         c[k]=b[j];
        //         j++; k++;
        //     }
        // }

        // if(i==a.length){ //copy paste elments from b to c
        //     while(j<b.length){
        //         c[k]=b[j];
        //         j++; k++;
        //     }
        // }
        // if(j==b.length){ //copy paste elments from a to c
        //     while(i<a.length){
        //         c[k]=a[i];
        //         i++; k++;
        //     }
        // }

        // Code to merge sorted array : initialising (i=a.length-1 ,j=b.length-1, k= (a.length+b.length-1));
        int i=a.length-1, j=b.length-1, k=(a.length+b.length-1); 
        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                c[k]=a[i];
                i--; k--;
            }
            else{
                c[k]=b[j];
                j--; k--;
            }
        }

        if(i<0){ //copy paste elments from b to c
            while(j>=0){
                c[k]=b[j];
                j--; k--;
            }
        }
        if(j<0){ //copy paste elments from a to c
            while(i>=0){
                c[k]=a[i];
                i--; k--;
            }
        }

        //Printing the merged array : 
        for (int ele : c) {
            System.out.print(ele+" ");
        }
        
        
    }
    
}    
  
  

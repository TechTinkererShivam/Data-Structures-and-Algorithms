package ArraysAndArrayLists;

public class Imp_MergeTwoSortedArrays {

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] a = {10,30,40,60,100};
        int[] b = {5,15,20,25,30,50};
        int[] c = new int[a.length + b.length];

//         // Code to merge sorted array : initialising (i=0,j=0,k=0)
//         int i=0, j=0, k=0;
//         while(i<a.length && j<b.length){
//             if(a[i]<=b[j]){
//                 c[k]=a[i];
//                 i++; k++;
//             }
//             else{
//                 c[k]=b[j];
//                 j++; k++;
//             }
//         }
//
//
//             while(j<b.length){ //copy paste elments from b to c
//                 c[k]=b[j];
//                 j++; k++;
//             }
//
//             while(i<a.length){ //copy paste elments from a to c
//                 c[k]=a[i];
//                 i++; k++;
//             }
//
//             printArray(a);
//             printArray(b);
//             printArray(c);

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


            while(j>=0){ //copy paste elments from b to c
                c[k]=b[j];
                j--; k--;
            }


            while(i>=0){ //copy paste elments from a to c
                c[k]=a[i];
                i--; k--;
            }

            printArray(a);
            printArray(b);
            printArray(c);
    }
    
}    
  
  

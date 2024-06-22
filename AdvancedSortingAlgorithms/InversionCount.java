package AdvancedSortingAlgorithms;

public class InversionCount { // arr[i]>arr[j] for all i<j

    static int count;

    // code to merge two sorted array
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else{
                count += a.length-i;
                c[k++]=b[j++];
            }
        }

        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];

    }

    public static void inversion(int[] a, int[] b){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += a.length-i;
                j++;
            }
            else i++;
        }
    }


    // code of merge sort algo
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; // base case

        // dividing array into two parts
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        // copy pasting elements
        for(int i=0;i<n/2;i++) a[i]=arr[i];
        for(int i=0;i<n-n/2;i++) b[i]=arr[i+n/2];

        // recursive call [doing magic]
        mergeSort(a);
        mergeSort(b);

        // counting no. of inversions before merging
        //inversion(a,b);

        merge(a,b,arr); // merging two sorted arrays here a & b
        a=null; b=null; // to optimise space complexity

    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        int n = arr.length;

//        // M1 Brute Force Approach [TC = O(log(n^2))]
//        int count=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]>arr[j]) count++;
//            }
//        }
//        System.out.println(count);

//        // M2 : Using merge sort algo [TC = O(n*log(n))]
//        count=0;
//        mergeSort(arr);
//        System.out.println(count);

        // M3 : Using merge sort algo [TC = O(n*log(n))] by extra adding count to the merge function
        count=0;
        mergeSort(arr);
        System.out.println(count);

    }
}

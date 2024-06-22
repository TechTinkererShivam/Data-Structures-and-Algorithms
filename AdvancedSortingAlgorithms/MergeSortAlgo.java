package AdvancedSortingAlgorithms;

// Merge Sort Algorithm
/*
           TC
    Best case : O(nlog(n))
    Avg case : O(nlog(n))
    Worst case : O(nlog(n))

           SC : max space used at any given instant of the algorithm
    Before Optimisation : O(nlog(n)) in each case
    After Optimisation : O(n) in each case

    // Merge Sort is a Stable if '<=' inside merge()
    // Merge Sort is a Unstable if '<' inside merge()

*/

public class MergeSortAlgo { // technique used -> divide and conquer
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    // code to merge two sorted array
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }

        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];

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

        merge(a,b,arr); // merging two sorted arrays here a & b
        a=null; b=null; // to optimise space complexity
        // This means the references (a & b) don't point to any array object in memory but still exist in the memory.

    }


    public static void main(String[] args) {
        int[] arr = {50,30,80,52,86,32,15,-10,0};

        print(arr);
        mergeSort(arr);
        print(arr);

    }
}

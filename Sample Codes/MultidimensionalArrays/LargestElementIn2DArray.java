package MultidimensionalArrays;

public class LargestElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{1,3,7},{1,2,4}};

        // max ele in the array
        int mx = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                if(arr[i][j] > mx) mx=arr[i][j];
            }
        }
        System.out.print("Max element in the Array : "+mx);

        System.out.println();

        // min ele in the array
        int mn = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                if(arr[i][j] < mn) mn=arr[i][j];
            }
        }
        System.out.print("Min element in the Array : "+mn);

        System.out.println();

        // sum of all the array elements
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                sum+=arr[i][j];
            }
        }
        System.out.print("Sum of all the elements in the Array : "+sum);

        System.out.println();

        // product of all the array elements
        int product=1;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                product*=arr[i][j];
            }
        }
        System.out.print("Product of all the elements in the Array : "+product);
    }
}

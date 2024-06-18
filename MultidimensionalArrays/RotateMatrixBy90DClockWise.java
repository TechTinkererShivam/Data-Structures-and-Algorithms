package MultidimensionalArrays;

public class RotateMatrixBy90DClockWise {

    public static void printArray(int[][] arr){
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void reverse(int[][] arr, int i, int x, int y){
        int low = x, high = y;
        while(low < high){
            int temp = arr[i][low];
            arr[i][low] = arr[i][high];
            arr[i][high] = temp;
            low++; high--; 
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Actual Matrix : ");
        printArray(arr);

        // Step 1 : transforming into transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose Matrix :");
        printArray(arr);

        // Step 2 : Reverse each row
        for (int i = 0; i < arr.length; i++) {
            reverse(arr, i, 0, arr[0].length-1 );
        }
        System.out.println("Rotated Matrix : ");
        printArray(arr);
    }
}

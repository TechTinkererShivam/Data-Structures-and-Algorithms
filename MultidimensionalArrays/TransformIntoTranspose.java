package MultidimensionalArrays;

public class TransformIntoTranspose {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //int m=arr.length, n=arr[0].length;
        
        System.out.println("Actual Matrix : ");

        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        
        // transforming into transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Transformed into Transpose Matrix : ");

        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

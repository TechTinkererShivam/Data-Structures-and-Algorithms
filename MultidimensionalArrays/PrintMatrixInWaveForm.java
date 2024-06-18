package MultidimensionalArrays;

public class PrintMatrixInWaveForm {

    public static void printArray(int[][] arr){
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Actual Matrix : ");
        printArray(arr);

          // Waveform Pattern I
        for (int i = 1; i < arr.length; i+=2) { //rows
            int low=0, high=arr[0].length-1;
            while(low < high){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++; high--; 
            }
        }
        System.out.println("Wave Form Matrix I : ");
        printArray(arr);


        //    // Waveform Pattern II
        // for (int i = 0; i < arr.length; i+=2) { //rows
        //     int low=0, high=arr[0].length-1;
        //     while(low < high){
        //         int temp = arr[i][low];
        //         arr[i][low] = arr[i][high];
        //         arr[i][high] = temp;
        //         low++; high--; 
        //     }
        // }
        // System.out.println("Wave Form Matrix II : ");
        // printArray(arr);


        //     // Waveform Pattern III
        //     for (int j = 1; j < arr.length; j+=2) { //cols
        //     int low=0, high=arr.length-1;
        //         while(low < high){
        //         int temp = arr[low][j];
        //         arr[low][j] = arr[high][j];
        //         arr[high][j] = temp;
        //         low++; high--; 
        //         }
        //     }
        // System.out.println("Wave Form Matrix III : ");
        // printArray(arr);


        //     // Waveform Pattern IV
        //     for (int j = 0; j < arr.length; j+=2) { //cols
        //     int low=0, high=arr.length-1;
        //         while(low < high){
        //             int temp = arr[low][j];
        //             arr[low][j] = arr[high][j];
        //             arr[high][j] = temp;
        //             low++; high--; 
        //         }
        //     }
        // System.out.println("Wave Form Matrix IV : ");
        // printArray(arr);

    }
}

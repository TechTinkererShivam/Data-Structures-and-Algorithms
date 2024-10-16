package MultidimensionalArrays;

public class Imp_SpiralFormOfMatrix {

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
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};

        System.out.println("Actual Matrix : ");
        printArray(arr);


        // Code to print spiral form
        int lr=0, lc=0, hr=arr.length-1, hc=arr[0].length-1;

        /*
         * lr = lower row;
         * hr = higher row;
         * lc = lower column;
         * hc = higher column;
         */
        
        while(lr<=hr && lc<=hc){

            //left to right
            for(int j=lc ; j<=hc ; j++){
                System.out.print(arr[lr][j]+" ");
            } lr++;

            if(lr<=hr && lc<=hc){
                //top to bottom
                for(int i=lr ; i<=hr ; i++){
                    System.out.print(arr[i][hc]+" ");
                } hc--;            
            }

            if(lr<=hr && lc<=hc){
                //right to left
                for(int j=hc ; j>=lc ; j--){
                    System.out.print(arr[hr][j]+" ");
                } hr--;
            }

            if(lr<=hr && lc<=hc){
                //bottom to top
                for(int i=hr ; i>=lr ; i--){
                    System.out.print(arr[i][lc]+" ");
                }
                lc++;
            }
        }
    }
}

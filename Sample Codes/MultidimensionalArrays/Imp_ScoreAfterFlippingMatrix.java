package MultidimensionalArrays;

public class Imp_ScoreAfterFlippingMatrix {

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
        int[][] arr = {{0,0,1,1},{0,1,1,0},{0,0,1,0}};
        int m=arr.length, n=arr[0].length;

        printArray(arr);

        //code to return max sum

        for(int i=0;i<m;i++){   //ensure 1 at the beginning of each row
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }

        printArray(arr);


        for(int j=1;j<n;j++){   //cols traversal(2nd to nth)
            int noz=0, no1=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) noz++;
                else no1++;
                
                if(noz > no1){    //very imp (flip that column)
                    for(i=0;i<m;i++){
                        if(arr[i][j]==0) arr[i][j]=1;
                        else arr[i][j]=0;
                    }
                }
            
            }
        }

        printArray(arr);

        // int max=0;
        // for(int i=0 ; i<m ; i++){
        //     int sum=0, k=n-1;
        //     for(int j=0 ; j<n ; j++){
        //         sum += arr[i][j]*Math.pow(2,k);
        //         k--;
        //     }
        //     max+=sum;
        // }
        // System.out.println(max);

        int max=0;
        for(int i=0 ; i<m ; i++){
            int k=n-1;
            for(int j=0 ; j<n ; j++){
                max += arr[i][j]*Math.pow(2,k);
                k--;
            }

        }

        System.out.println(max);
                
    }
}

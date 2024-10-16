package MultidimensionalArrays;

public class Imp_SetMatricesZero {

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
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
        int m=arr.length, n=arr[0].length;
        printArray(arr);

        // // M1 : Brute force approach using an addtional array

        // int[][] helper = new int[m][n];

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         helper[i][j]=arr[i][j];
        //     }
        // }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(helper[i][j]==0){
        //             for(int k=0;k<m;k++){ ////making ele of 'j'th col 0
        //                 arr[k][j]=0;
        //             }
        //             for(int k=0;k<n;k++){ //making ele of 'i'th row 0
        //                 arr[i][k]=0;
        //             }
        //         }
        //     }
        // }
        // printArray(arr);

        
        // // using O(m+n) extra space
        // boolean[] a = new boolean[m];
        // boolean[] b = new boolean[n];

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(arr[i][j]==0){
        //             a[i]=true;
        //             b[j]=true;
        //         }
        //     }
        // }

        // for(boolean ele : a){
        //     System.out.print(ele+" ");
        // }
        // System.out.println();

        // for(boolean ele : b){
        //     System.out.print(ele+" ");
        // }
        // System.out.println();


        // //making 'i'th row element 0
        // for(int i=0;i<m;i++){
        //     if(a[i]==true){
        //         for(int j=0;j<n;j++){
        //             arr[i][j]=0;
        //         }
        //     }
        // }

        // //making 'j'th col element 0
        // for(int j=0;j<n;j++){
        //     if(b[j]==true){
        //         for(int i=0;i<m;i++){
        //             arr[i][j]=0;
        //         }
        //     }
        // }

        // printArray(arr);


        //using O(1) space complexity  [best solution]

        boolean zeroRow=false, zeroCol=true;
        

        for(int i=1;i<m;i++){ 
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){   // 1 0 1
                    arr[i][0]=0;    // 0 0 1
                    arr[0][j]=0;    // 1 1 1
                }
            }
        }

        printArray(arr);

        for(int j=0;j<n;j++){               // 1 0 1
            if(arr[0][j]==0){               // 0 0 1
                for(int i=0;i<m;i++){       // 1 0 1
                    arr[i][j]=0;
                }
            }
        }

        printArray(arr);

        for(int i=0;i<m;i++){               // 1 0 1
            if(arr[i][0]==0){               // 0 0 0
                for(int j=0;j<n;j++){       // 1 0 1
                    arr[i][j]=0;
                }
            }
        }


        printArray(arr);

        
        

    }
}
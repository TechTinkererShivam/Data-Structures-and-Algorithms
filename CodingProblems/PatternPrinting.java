package CodingProblems;

/*
            // Print the following pattern for n=7
            In general n=2m+1 where m=1,2,3,...
            *             *
            * *         * *
            * * *     * * *
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *
*/

// code of above pattern

public class PatternPrinting {
    public static void main(String[] args) {

        int n=10;

        for(int i=1;i<=(n/2)+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=(n/2)+1-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=(n/2)+1-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }

        for(int i=1;i<=(n/2);i++){
            for(int j=1;j<=(n/2)+1-i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=(n/2)+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}

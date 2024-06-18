
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//    }
//}



/*   // Print the following pattern for n=7
        In general n=2m+1 where m=1,2,3,...
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
*/


//// code of above pattern
//public class Main{
//    public static void main(String[] args) {
//        int n=10;
//
//        for(int i=1;i<=(n/2)+1;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            for(int j=1;j<=(n/2)+1-i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j=1;j<=(n/2)+1-i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }
//
//        for(int i=1;i<=(n/2);i++){
//            for(int j=1;j<=(n/2)+1-i;j++){
//                System.out.print("*"+" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j=1;j<=(n/2)+1-i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}


import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        List<List<Integer>> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(i%j==0) arr.add(j);
            }
            al.add(arr);
        }

        System.out.println(al);

        int sum=0;
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.get(i).size();j++){
                sum += al.get(i).get(j);
            }
        }

        System.out.println("\nThe sum is "+sum);

    }
}







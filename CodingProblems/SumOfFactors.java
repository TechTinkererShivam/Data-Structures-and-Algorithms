package CodingProblems;

import java.util.*;

public class SumOfFactors {
    public static void main(String[] args) {
        // M1 : TC -> O(log(n^2)) & SC -> O(log(n^2))
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



//public class SumOfFactors {
//
//    // M2 : TC -> O(log(n^2)) & SC -> O(1)
//
//    public static int func(int n){
//        int sum = 1;
//        for(int i=n ; i>1 ; i--){
//            if(n%i==0) sum += i;
//        }
//        return sum;
//    }
//
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//
//        int ans = 0;
//        for(int i=1;i<=n;i++){
//            ans += func(i);
//        }
//
//        System.out.println("\nThe sum is "+ans);
//
//    }
//}




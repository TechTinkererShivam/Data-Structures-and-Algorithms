package MultidimensionalArrays;

// // M1 : Mathematical Approach, using nCr

// import java.util.*;

// public class Imp_GeneratePascalsTriangle {

//     public static int facto(int x){
//         int f = 1; //f = factorial
//         for(int i=1 ; i<=x ; i++){
//             f*=i;
//         }
//         return f;
//     }

//     public static int nCr(int n, int r){
//         int nCr = facto(n)/(facto(n-r)*facto(r));
//         return nCr;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         sc.close();

//         List<List<Integer>> ans = new ArrayList<>(n);

//         for(int i=0 ; i<n ; i++){
//             List<Integer> al = new ArrayList<>(i+1);
//             for(int j=0 ; j<= i ; j++){
//                 al.add(nCr(i,j));
//             }
//             ans.add(al);
//         }

//         System.out.println(ans);

//         //Printing the 2D ArrayList
//         for(int i=0 ; i<ans.size() ; i++){
//             for(int j=0 ; j<ans.get(i).size() ; j++){
//                 System.out.print(ans.get(i).get(j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// M2 : Generic solution
import java.util.*;

public class Imp_GeneratePascalsTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sc.close();

        List<List<Integer>> ans = new ArrayList<>(n);

        for(int i=0 ; i<n ; i++){
            List<Integer> al = new ArrayList<>(i+1);
            for(int j=0 ; j<= i ; j++){
                if(j==0 || j==i) al.add(1);
                else al.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            ans.add(al);
        }

        //System.out.println(ans);

        //Printing the 2D ArrayList
        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
    }
}

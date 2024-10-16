package MultidimensionalArrays;

/*
    2D ArrayList : ArrayList of ArrayLists
    2D List : List of Lists
*/
import java.util.*;

public class _2DArrayListsBasics {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(); //create an empty list of capacity = 0 & size = 0.
        System.out.println(a.size());
        a.add(1); a.add(2); a.add(3); a.add(4);

        List<Integer> b = new ArrayList<>(4);//create an empty list of capacity 4 & size = 0.
        System.out.println(b.size());
        b.add(10); b.add(20); b.add(30);

        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(40);

        List<List<Integer>> v = new ArrayList<>(); // capacity = 0
        System.out.println(v.size()); // v.size() gives no. of lists present in v
        v.add(a); v.add(b); v.add(c); v.add(d);
        System.out.println(v);

        /*
            // To fetch element present in 'i+1'th row & 'j+1'th column
            System.out.println(v.get(i).get(j));
        */

        System.out.println(v.get(1).get(1));

        //Printing of 2D ArrayList
        for(int i=0 ; i<v.size() ; i++){
            for(int j=0 ; j<v.get(i).size() ; j++){
                System.out.print(v.get(i).get(j)+" ");
            }
            System.out.println();
        }

        /*
         *   //Basic STL functions
         *      add()
         *      get()
         *      set()
         *      size()
         *      clear()
         *      isEmpty()
         *      Contains()
         *      indexOf()
         *      remove()
         *      toArray() -> Convert 1D List to 1D Array.
         *      
         */
    }
}

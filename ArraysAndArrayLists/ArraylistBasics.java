package ArraysAndArrayLists;

    // Arraylists( It is a growable array ) in Java

    /*
     * Default values in an uninitialized array is 0
     * But al.add(1,10) can't be added without adding al.add(0,5)
     * If done it will show an error otherwise specify al.ad(0,null)
     * 
     */

import java.util.*;

public class ArraylistBasics{
    public static void main(String[] args) {
         ArrayList<Integer> al = new ArrayList<>(5);//declaration
         /*
             capacity not necessary to be specified
         */
         System.out.println(al.size());

         // Initialisation
         al.add(0,null); // arr[0]=10;
         al.add(1,20); // arr[1]=20;
         al.add(2,30); // arr[2]=30;
         al.add(3,40); // arr[3]=40;
         al.add(4,50); // arr[4]=50;
         System.out.println(al.size());

         System.out.println(al.get(0));

         //Printing all ele of al using loop
         for(int i=0 ; i < al.size() ; i++){
             System.out.print(al.get(i)+" "); // where i -> index
         }
         System.out.println();

         // Direct Printing by giving name of ArrayList inside sout()
         System.out.println(al);

         // Updation(or modification)
         al.set(0, 10);
         System.out.println(al);

         al.add(60); // push_back

         /*
          * al.add(index,ele); // add element at index i and rest elements move one step ahead
          * al.add(ele); // push_back
          */

         System.out.println(al.size());
         System.out.println(al);

         // Removing an element from the ArrayList
         al.remove(3);
         System.out.println(al);

//        List<Integer> al = new ArrayList<>(); // default capacity : 10
//        System.out.println(al.size()); // size : 0

    }
}

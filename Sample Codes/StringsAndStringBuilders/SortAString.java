package StringsAndStringBuilders;

import java.util.*;

public class SortAString {

    public static void print(char[] ch){
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // String str = "shivam";
        // /*
        //  * Strings are immutable so directly can't be sorted.
        //  * But char array be sorted, now convert string to a char array
        //  * and then sort the array after this point str to sorted string.
        // */
        // char[] ch = str.toCharArray();
        // print(ch);
        // Arrays.sort(ch);
        // print(ch);

        // To sort StringBuilder : sb -> str -> char arr -> Arrays.sort(ch) -> sb.append(ch)
        StringBuilder sb = new StringBuilder("shivam");
        char[] ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        print(ch);
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println(sb);
        sb.append(ch);
        System.out.println(sb);
    }
}

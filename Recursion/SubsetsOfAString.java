package Recursion;

import java.util.ArrayList;

public class SubsetsOfAString {

    static ArrayList<String> al; // global arraylist

    // subsets of a string
    public static void subsets(String str, String ans, int i){
         if(i==str.length()){
             System.out.println(ans);
             return;
         }
         char ch = str.charAt(i);
         subsets(str,ans,i+1); // not take
         subsets(str,ans+ch,i+1); // take

    }

    public static void main(String[] args) {
        String str = "abc";
        al = new ArrayList<>(); //

        subsets(str,"",0);

    }
}

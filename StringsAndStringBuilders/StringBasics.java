package StringsAndStringBuilders;

import java.util.*;


            // Strings are immutable in JAVA

public class StringBasics {
    public static void main(String[] args) {

        // // String is a character array
        // char[] arr = {'S','h','i','v','a','m'};
        // for(char ele : arr){
        //     System.out.print(ele);
        // }

        
        // // The String class represents character strings.

        //Declaration and initialisation of String
        // String str = "Hi, Shivam Rathaur";
        // System.out.println(str);

        // Taking string as input from user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string : "); // Shivam Rathaur
        // String str = sc.next(); //read input till escape character
        // System.out.println(str); // Shivam
        // String _str = sc.nextLine(); // read whole input
        // System.out.println(_str); // Shivam Rathaur
        // sc.close();


        // charAt() & length() ; 0 based indexing
        // String str = "Shivam Rathaur";
        // System.out.println(str.length()); // 14 ; indices(0 to 13)
        // System.out.println(str.charAt(10));

        // indexOf() & lastIndexOf() methods
        // String str = "Shivam Rathaur";
        // System.out.println(str.indexOf('a')); // 4 -> gives first index of 'a'
        // System.out.println(str.lastIndexOf('a')); // 11 -> gives last index of 'a'
        // System.out.println(str.indexOf('z')); // -1 -> since 'z' doesn't exist in str.

        // compareTo() method : used to compare 2 given strings lexographically
        // String a1 = "abc";
        // String b1 = "def";
        // System.out.println(a1.compareTo(b1)); // -3 : ASCII('a') - ASCII('d')

        // String a2 = "abc";
        // String b2 = "adf";
        // System.out.println(a2.compareTo(b2)); // -2 : ASCII('b') - ASCII('d')

        // String a3 = "abc";
        // String b3 = "abd";
        // System.out.println(a3.compareTo(b3)); // -1 : ASCII('c') - ASCII('d')

        // String a4 = "abc";
        // String b4 = "abc";
        // System.out.println(a4.compareTo(b4)); // 0 : since both the strings are same

        // String a5 = "abcdiyf"; // or a5 = "abcdezt"
        // String b5 = "abc";
        // System.out.println(a5.compareTo(b5)); // 4 : since initial char's are same in both strs that's why 4(diyf)-0() = 4

        // String a6 = "abc"; 
        // String b6 = "abcdiyf"; // or b6 = "abcdezt"
        // System.out.println(a6.compareTo(b6)); // 4 : since initial char's are same in both strs that's why 0()-4(diyf) = -4


        // contains() & startsWith() : both take string as argument(input) & return boolean exp.
        // String str = "Shivam Rathaur";

        // System.out.println(str.contains("a"));//true
        // System.out.println(str.contains("Shiv"));//true
        // System.out.println(str.contains("hin"));//false

        // System.out.println(str.startsWith("Shi"));//true
        // System.out.println(str.startsWith("S"));//true
        // System.out.println(str.startsWith("shi"));//false

        // System.out.println(str.endsWith("aur"));//true
        // System.out.println(str.endsWith("r"));//true
        // System.out.println(str.endsWith("R"));//false

        // // toLowerCase(), toUpperCase() & concat() methods

        // String str = "I am Shivam Rathaur";
        // System.out.println(str); // I am Shivam Rathaur
        // System.out.println(str.toLowerCase()); // i am shivam rathaur
        // System.out.println(str); // I am Shivam Rathaur
        // System.out.println(str.toUpperCase()); // I AM SHIVAM RATHAUR
        // str = str.toLowerCase();
        // System.out.println(str); // i am shivam rathaur

        // String str1 = "abc";
        // String str2 = "def";
        // System.out.println(str1+str2); // abcdef
        // System.out.println(str1.concat(str2)); // abcdef
        // System.out.println(str1); // abc
        // str1 = str1.concat(str2);
        // System.out.println(str1); // abcdef
        // System.out.println(str2); // def

        // Substring : continuous part of a string of length 0[i.e., ""(empty string)] to str.length()
        /*
         * String str = "abc";
         * Substrings of str : "",a","ab","abc","b","bc","abc" 
         */

        // // substring(i) & substring(i,j) : [i-> Inclusive & j-> Exclusive]
        // String str = "abcde";
        // System.out.println(str.substring(1)); // bcde : print char's from indices 1 to last
        // System.out.println(str.substring(1,4)); // bcd
        // System.out.println(str.substring(2,2)); // It will print nothing
        // System.out.println(str.substring(1,5)); // bcde

        //             // Plus(+) operator
        // String a = "abc";
        // String b = "xyz";
        // System.out.println(a+b); // abcxyz
        // a = a+b; // or a+=b;
        // System.out.println(a); // abcxyz
        // System.out.println(b+10); // xyz10
        // b = 10.5+b;
        // System.out.println(b); // 10.5xyz

        /*
         * string + char = string
         * string + number = string
         * string + string = string
         */

        // // Left to Right when precedence(hierarchy) is same
        // System.out.println("abc"+10+20); // abc1020 : "abc" -> "abc10" -> "abc1020" 
        // System.out.println(10+20+"abc"); // 30abc : 10 -> 10+20=30 -> "30abc"

        // // Convert integer to string
        // int x = 100;
        // String str = ""+x;
        // System.out.println(str);

        // // Total digits in a number without using loops
            // int n=27;
            // String str = ""+n;
            // System.out.println("Digits in "+n+" : "+str.length());

            // // Using Integer.toString() method
            // int n = 17521;
            // String str = Integer.toString(n);
            // System.out.println("Digits in "+n+" : "+str.length());

        // // Array of strings
        // String[] arr = {"shivam","iith","btech"};
        // for(String ele : arr){
        //     System.out.print(ele+" ");
        // }    
    }
}

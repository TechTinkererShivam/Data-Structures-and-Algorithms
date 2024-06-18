package StringsAndStringBuilders;

import java.util.Scanner;

public class UpdateEvenPositionsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String s = new String(); // or String s = "";

        for(int i=0 ; i<str.length() ; i++){
            if(i%2!=0) s = s+str.charAt(i);
            else s = s+'a';
        }
        str = s;
        System.out.println(str);

        /*
         * Performance of string is poor bcz of "string immutability".  
        */
    }
}

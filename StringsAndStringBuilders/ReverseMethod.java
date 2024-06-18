package StringsAndStringBuilders;

import java.util.Scanner;

public class ReverseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sc.close();

        // reverse stringbuilder without using built-in method
        int i=0, j=sb.length()-1;
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
        System.out.println(sb);

        // // Using built-in method
        // sb.reverse();
        // System.out.println(sb);

    }
}

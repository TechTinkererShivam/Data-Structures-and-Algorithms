package StringsAndStringBuilders;

import java.util.Scanner;

public class ReverseEachWordInSentence {

    public static void reverse(StringBuilder sb, int i, int j){ 
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sc.close();

        int i=0, j=0;
        while(j < sb.length()){
            if(sb.charAt(j)==' '){
                reverse(sb, i, j-1);
                j++; i=j; // or  i=j+1; j=i;
            } 
            else j++;
        }
        reverse(sb, i, j-1); // to reverse last word

        System.out.println(sb);
    }
}

package StringsAndStringBuilders;

import java.util.Scanner;

public class ToggleChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0 ; i<sb.length() ; i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){ // upper-case char
                ascii += 32;
                // ch = (char)ascii;
                // sb.setCharAt(i, ch);
            }
            else if(ascii>=97 && ascii<=122){ // lower-case char
                ascii -= 32;
                // ch = (char)ascii;
                // sb.setCharAt(i, ch);
            }

            // To reduce no of lines of code we can write repititive code outside of if-else block
            ch = (char)ascii;
            sb.setCharAt(i, ch);

        }

        System.out.println(sb);

    }
}

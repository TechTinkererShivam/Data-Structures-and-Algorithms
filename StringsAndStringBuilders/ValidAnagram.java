package StringsAndStringBuilders;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "jamari";
        String t = "maarij";
        if(s.length() != t.length()){
            System.out.println("No");
            return;
        } 
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a); Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}

package StringsAndStringBuilders;


// import java.util.Scanner;

// public class CountingVowelsInAString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string : ");
//         String str = sc.nextLine();

//         int count=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') count++;
//             else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') count++;
//         }

//         System.out.println(count);
//         sc.close();
//     }
// }



// made more readable program using functions

import java.util.Scanner;

public class CountingVowelsInAString {

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        else if(ch=='e' || ch=='E') return true;
        else if(ch=='i' || ch=='I') return true;
        else if(ch=='o' || ch=='O') return true;
        else if(ch=='u' || ch=='U') return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        int count=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i)) == true) count++;
        }

        System.out.println(count);
        sc.close();
    }
}
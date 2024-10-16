package Recursion;

//public class StringTraversalUsingRecursion {
//
//    public static void printString(String str, int i){
//        if(i==str.length()) return;
//        System.out.print(str.charAt(i));
//        printString(str, i+1);
//    }
//    public static void main(String[] args) {
//        String str = "I am Shivam Rathaur";
////        System.out.println(str);
//
//        printString(str,0);
//
//    }
//}

// Skip a character
public class StringTraversalUsingRecursion {

    public static void skip(String str, String ans, int i){
        if(i==str.length()){
            System.out.print(ans);
            return;
        }
        if(str.charAt(i)!='a') ans += str.charAt(i);
        skip(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str = "I am Shivam Rathaur";
        System.out.println(str);

        skip(str,"",0);

    }
}

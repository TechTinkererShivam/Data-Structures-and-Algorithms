package StringsAndStringBuilders;

public class EqualsVsEquality {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";

        System.out.println(s==a); // true
        System.out.println(s==b); // false
        System.out.println(s==c); // false
        // bcz "==" operator is comparing the addresses of s,a,b,c.

        // Comparing using equals() method
        System.out.println(s.equals(a)); // true
        System.out.println(s.equals(b)); // true
        System.out.println(s.equals(c)); // true
        // bcz equals() method is comparing two strings char by char
        
    }
}

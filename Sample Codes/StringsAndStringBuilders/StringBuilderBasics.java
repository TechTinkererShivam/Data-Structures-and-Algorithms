package StringsAndStringBuilders;

// Java StringBuilder class is used to create mutable (modifiable) String.

public class StringBuilderBasics {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("abcd");
        // System.out.println(sb); // abcd
        // System.out.println(sb.length()); // 4
        // System.out.println(sb.capacity()); // 16+4 = 20 where 16 is default capacity

        // // empty string builder
        // StringBuilder a = new StringBuilder("");
        // System.out.println(a); // 
        // System.out.println(a.length()); // 0
        // System.out.println(a.capacity()); // 16 : since 16 is default capacity

        // // This also create an empty string builder
        // StringBuilder b = new StringBuilder();
        // System.out.println(b); // 
        // System.out.println(b.length()); // 0
        // System.out.println(b.capacity()); // 16 : since 16 is default capacity

        // // Explicitly giving initial capacity, also create an empty string builder
        // StringBuilder c = new StringBuilder(5);
        // System.out.println(c); //         
        // System.out.println(c.length()); // 0
        // System.out.println(c.capacity()); // 5


        // // Some built-in methods
        // StringBuilder a = new StringBuilder("naman");
        // StringBuilder b = new StringBuilder("pawan");
        // System.out.println(a.compareTo(b)); // -2
        // System.out.println(b.reverse()); // nawap

    }
}

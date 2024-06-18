package StringsAndStringBuilders;

public class AppendMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abcd");
        System.out.println(sb);
        sb.append(10);
        System.out.println(sb);
        sb.append('r');
        System.out.println(sb);
        sb.append('*');
        System.out.println(sb);
        sb.append(3.14);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char[] ch = {'s','h','i','v'};
        sb.append(ch); // can't append int array
        System.out.println(sb);
        StringBuilder s = new StringBuilder("hello");
        sb.append(s);
        System.out.println(sb);

        /*
         * In strings , append() doesn't work but s = s + "abcd" work
         * In StringBuilder, sb = sb + "xyz" doesn't work but append() work
        */ 

    }
}

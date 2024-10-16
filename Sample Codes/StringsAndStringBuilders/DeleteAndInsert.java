package StringsAndStringBuilders;

public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdxyz");
        System.out.println(sb);// abcdxyz
        sb.deleteCharAt(2);
        System.out.println(sb);// abdxyz
        sb.delete(2, 5); // 2-> Inclusive & 5-> Exclusive
        System.out.println(sb); // abz
        sb.insert(2, 'r');
        System.out.println(sb); // abrz
        sb.insert(3, 19);
        System.out.println(sb); // abr19z
        sb.insert(4, true);
        System.out.println(sb);// abr1true9z
        sb.insert(1, "shiv");
        System.out.println(sb);// ashivbr1true9z

    }
}

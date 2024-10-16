package StringsAndStringBuilders;

public class CharWithMostOccurrence {
    public static void main(String[] args) {
        String str = "amanirntot";
        int[] arr = new int[26]; // frequency array

        for(int i=0;i<str.length();i++){ // counting freq of each char
            char ch = str.charAt(i);
            int ascii = (int)ch;
            arr[ascii-97] += 1;
        }

        int mx=arr[0];
        for(int i=0;i<arr.length;i++){ // identifying char with max freq
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){ // printing char having max no of freq
            if(arr[i]==mx) System.out.print((char)(i+97)+" ");
        }
    }
}

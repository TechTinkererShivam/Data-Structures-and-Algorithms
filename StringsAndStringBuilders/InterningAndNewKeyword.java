package StringsAndStringBuilders;

public class InterningAndNewKeyword {
    public static void main(String[] args) {

        // String s = "Naman";
        // // Naman -> Pawan
        // /* 
        // s.charAt(0) = 'P'; // error , since strings are immutable. 
        // s.charAt(2) = 'w'; // error , since strings are immutable.
        // */
        // System.out.println(s);

        // String str = "Shivam Rathaur";
        // System.out.println(str); // Shivam Rathaur
        // System.out.println(str.toLowerCase()); // shivam rathaur
        // System.out.println(str); // Shivam Rathaur : Strings are immutable
        // str = str.toLowerCase(); // Now str refer to (shivam rathaur) but (Shivam Rathaur) still exist in memory
        // System.out.println(str); // shivam rathaur

        // Comparison b/w array & string
            // In Arrays
                // int[] a = {1,2,3};
                // int[] b = {1,2,3};
                // a[0]=10;
                // System.out.println(b[0]); // 1 : since both a & b are different arrays in the memory

                // int[] a = {1,2,3};
                // int[] b = a;
                // a[0]=10;
                // System.out.println(b[0]);// 10 : since both a & b are refering to the same array {1,2,3}

            // In Strings
                // String a = "Shivam";
                // String b = "Shivam";
                // System.out.println(a); // Shivam : since both a & b are refering to the same String "Shivam" 
                // System.out.println(b); // Shivam : since both a & b are refering to the same String "Shivam" 
                    /*
                    * This is due to the concept of "Interning" in strings used to save space.
                    */

                // String a = "Shivam";
                // String b = a;
                // System.out.println(b);// Shivam : since both a & b are refering to the same String "Shivam"

        // String str = "Naman";
        // str = "Pawan";
        // System.out.println(str);// Pawan : bcz str is now refering to Pawan but "Naman still exist in memory"

        // // Creating a new string using "new" keyword
        // String s = new String("Naman");
        // System.out.println(s);// Naman
        
        /*
         * Naman : Now s is refering to the string "Naman" [created new in the memory] which
         * is not same as the string [str = "Naman"]we have created in the line no. 44
        */
    
        
        /*
        * String str = "hello";
        * // hello -> heylo
        * str = str.substring(0,2) + 'y' + str.substring(3);
        *              "he"           "y"       "lo"
        *                     "hey"        "lo"
        *            str  ---->   "heylo"
        * All the strings still exist in the memory due to string immutability which will waste memory.
        * String Immutability ?    ->   Due to security purposes. 
        * System.out.println(str); // heylo
        * 
        */    
    }
}
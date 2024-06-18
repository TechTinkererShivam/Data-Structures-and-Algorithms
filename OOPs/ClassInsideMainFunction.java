package OOPs;

        // class inside main func
public class ClassInsideMainFunction {

    public static void main(String[] args) {
        
        class Student{
            String name;
            int rno;
            double percentage;
        }
        /*  
            Student class can't be accessed outside the main func that's why
            it is preferred to make it outside the main func. 
        */

        Student s1 = new Student();
        s1.name = "Ram";
        s1.rno = 15;
        s1.percentage = 95.60;
        // name, rno, percentage -> attributes/properties
        System.out.println(s1.name+" "+s1.rno+" "+s1.percentage);

    }
}




// // class outside main func
// public class ClassInsideMainFunction {

//     public static void func(Student x){
//         System.out.println(x.name);
//         return;
//     }

//     public static class Student{
//         String name;
//         int rno;
//         double percentage;
//     }
//     // Student class can be accessed outside the main func       
        

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Ram";
//         s1.rno = 15;
//         s1.percentage = 95.60;
//         // name, rno, percentage -> attributes/properties
//         // System.out.println(s1.name+" "+s1.rno+" "+s1.percentage);

//         func(s1);

//     }
// }
        
        


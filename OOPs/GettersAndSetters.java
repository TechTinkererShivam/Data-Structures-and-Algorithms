package OOPs;

public class GettersAndSetters { // getter & setter are functions.
    public static void main(String[] args) {
//        Student s = new Student();
//        s.name = "Tony Stark";
//        System.out.println(s.name);
//        //s.rno = 25; giving error bcz "rno" is private
//        s.setRno(25);
//        System.out.println(s.getRno());

        // understanding "Constructor" Method
//        Student st = new Student("Devil",20,8.5);
//        System.out.println(st.name);
//        System.out.println(st.rno);
//        System.out.println(st.cgpa);

//        System.out.println(st.collegeName);
        // st.collegeName = "IITB"; // cannot assign a value to "final" variable collegeName.

        Student s1 = new Student("Shiv",20,9.4);
        System.out.println(s1.nos);
        Student s2 = new Student("Amar",12,8.3);
        System.out.println(s2.nos);

        //System.out.println(nos); can't directly print nos
        System.out.println(Student.getnos());


    }
}

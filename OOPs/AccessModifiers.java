package OOPs;

public class AccessModifiers {
    /*
        public - all packages i.e., can be used anywhere in a project
        private - same class but In Java, inner classes and the containing class can access
                             each other's private members. Therefore, even though rno is private,
                             it is accessible in the main method of the AccessModifiers class.
        default - same package
    */

    public static class Student{ 
        String name;
        private int rno;
        double percentage;
    }


    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Tony";
        s.rno = 12;
        /*
            The code works because the `main` method is within the `AccessModifiers` class,
            allowing it to access the `Student` class's private field `rno`.
        */
        s.percentage = 98.40;
        System.out.println(s.rno);
        System.out.println(s.name+" "+s.rno+" "+s.percentage);
    }
}

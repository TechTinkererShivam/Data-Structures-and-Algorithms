package OOPs;

                // class : user defined data type

public class BasicsOfOOPs {

    //creating a new data-type 
    public static class Student{ // Student class is blueprint of s1 & s2
        String name;
        int rno;
        double percentage;
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // declaration of s1
        // default values
        System.out.println(s1.name+" "+s1.rno+" "+s1.percentage); // null, 0, 0.0
        s1.name = "Ram";
        s1.rno = 15;
        s1.percentage = 95.60;
        // name, rno, percentage -> attributes/properties
        System.out.println(s1.name+" "+s1.rno+" "+s1.percentage);

        Student s2 = new Student(); // declaration of s2
        s2.name = "Raj";
        s2.rno = 10;
        s2.percentage = 98.60;
        // name, rno, percentage -> attributes/properties
        System.out.println(s2.name+" "+s2.rno+" "+s2.percentage);

        /*
            Both s1 & s2 are objects of Student class.
            Objects are instances (real life entities) of class.
            Classes are blueprints.
        */ 


 
    }
}

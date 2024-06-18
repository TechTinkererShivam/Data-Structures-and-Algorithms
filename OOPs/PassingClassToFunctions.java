package OOPs;

public class PassingClassToFunctions {

    public static void change(Student s){
        s.name = "Virat";
        return;
    }

    //creating a new data-type 
    public static class Student{ // Student class is blueprint of s1 & s2
        String name;
        int rno;
        double percentage;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ram";
        s1.rno = 15;
        s1.percentage = 95.60;
        System.out.println(s1.name);
        s1.name = "Rohit"; // updation
        System.out.println(s1.name);

        // Passing class to function : Pass by reference
        change(s1);
        System.out.println(s1.name);

    }
}

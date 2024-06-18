package OOPs;

public class AccessModifiers {

    public static class Student{ 
        String name;
        private int rno;
        double percentage;
    }


    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Tony";
        s.rno = 12;
        s.percentage = 98.40;
        System.out.println(s.rno);
        System.out.println(s.name+" "+s.rno+" "+s.percentage);
    }
}

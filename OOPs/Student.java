package OOPs;

public class Student {
    String name;
    int rno;
    double cgpa;

    final String collegeName = "iith"; // it can be accessed with can't be modified.

    static int nos; // no. of students : "static" keyword to make "nos" object independent or class dependent

    public int getRno(){ // getter
        return rno;
    }

//    public void setRno(int n){ // setter
//        rno = n;
//    }
    // or
    public void setRno(int rno){ // setter
        this.rno = rno; // "this" keyword referring to attribute "rno" of "Student" class.
    }


    /*
       In Java, a constructor is a special method used to initialize objects.
       It is called when an instance of a class is created.
       A constructor has the same name as the class and does not have a return type.
       Its main purpose is to set initial values for the object's attributes.
    */

    public Student(String name, int rno, double cgpa){ // constructor method
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
        nos++;
    }

    public Student(){ // default constructor
        //
    }

    // understanding "static" keyword usage
    public static int getnos(){ //"static" keyword is added to access a method using object creation of that class or directly by className.funcName
        return nos;
    }



}

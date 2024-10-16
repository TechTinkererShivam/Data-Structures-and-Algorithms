package MultidimensionalArrays;

import java.util.*;

public class StudentsMarksAndRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        //Taking input roll no. & marks
        for(int i=0 ; i<4 ;i++){
            for(int j=0 ; j<2 ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        //Printing roll no. & marks of students
        System.out.println("               Roll No  |  Marks");
        for(int i=0 ; i<4 ;i++){
            System.out.print("student "+(i+1)+" :        ");
            for(int j=0 ; j<2 ;j++){
                System.out.print(arr[i][j]+"        ");
            }
            System.out.println();
        }
    }
}

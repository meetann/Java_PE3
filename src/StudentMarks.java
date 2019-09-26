import java.util.Scanner;
import java.lang.Exception;

public class StudentMarks {//extends Exception{

    public static void main(String[] args){
        System.out.println("Enter the number of Students:");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        System.out.println("Enter the grades of each student:");
        int[] stuGrades = new int[numOfStudents];

        for(int i=0;i<numOfStudents;i++){
            System.out.println("Grade of student "+i+":");
            stuGrades[i] = scanner.nextInt();
            try {
                if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                    throw new InvalidMarksException("Invalid marks!");
                }
            }
            catch (InvalidMarksException e){
                System.out.println(e+" Re-enter marks!");
                i--;
            }
        }
    }
}

class InvalidMarksException extends Exception{
    InvalidMarksException(String s){
        super(s);
//        System.out.println(s);
    }

    public InvalidMarksException() {
    }
}

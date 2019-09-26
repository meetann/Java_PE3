import java.util.Scanner;

public class CustomException {

    static class MyException extends Exception{
        MyException (String s){
         super(s);
        }
    }

    public static void main(String[] args){
        System.out.println("Enter '0' to go into try block or anything to go ahead.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        try{
            if(input==0) {
                System.out.println("This is try block.");
                throw new MyException("Exception occurred.");
            }
        } catch (MyException e) {
            System.out.println("Exception caught.");
        }
        finally {
            System.out.println("Finally block.");
        }

    }
}

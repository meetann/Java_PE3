import java.util.Scanner;

public class ConsecutiveNumbers {

    public static void main(String[] args){

        String numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 7 numbers separated by ',' ");
        numbers = scanner.next();
        int flag=0;

        String[] splitNumbers = numbers.split(",");
        System.out.println("Number of numbers: "+splitNumbers.length);

        int[] numberArray = new int[splitNumbers.length];

        for(int i=1;i<splitNumbers.length;i++){
            numberArray[i]=Integer.parseInt(splitNumbers[i]);
            if(numberArray[i]==numberArray[i-1]+1) {
                flag=1;
            }
            else {
                flag =0;
            }
        }
        if(flag==1){
            System.out.println("are consecutive numbers.");
        }
        else
            System.out.println("not consecutive.");
    }
}

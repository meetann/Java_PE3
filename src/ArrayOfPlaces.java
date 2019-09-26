import java.util.Scanner;

public class ArrayOfPlaces {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of places.");
        int number;
        number = scanner.nextInt();

        System.out.println("Enter the name of places: ");
        String[] listOfPlaces = new String[number];
//        StringBuilder[] stringBuilder = new StringBuilder[number];
        String[] resultList = new String[number];

        scanner.nextLine();
        for(int i=0;i<number;i++){
//            stringBuilder1[i] = new StringBuilder(scanner.nextLine());
            listOfPlaces[i] = scanner.nextLine();
//            stringBuilder[i].append(scanner.nextLine());
        }

        for(int i=0;i<number;i++){
            System.out.println(listOfPlaces[i]);
            //System.out.println(stringBuilder[i]);
        }

        for(int i=0;i<listOfPlaces.length;i++){
            for(int j=0;j<number;j++) {
                if (listOfPlaces[i].charAt(j) != 'a' || listOfPlaces[i].charAt(j) != 'e' || listOfPlaces[i].charAt(j) != 'i' || listOfPlaces[i].charAt(j) != 'o' || listOfPlaces[i].charAt(j) != 'u') {
                    resultList[i]+=listOfPlaces[i].charAt(j);
                }
            }
        }

        for(int i=0;i<number;i++){
            System.out.println(resultList[i]);
        }
    }
}

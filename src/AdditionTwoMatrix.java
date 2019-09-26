import java.util.Scanner;

public class AdditionTwoMatrix {

    public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        int row,col;
        row=scanner.nextInt();
        System.out.println("Enter number of cols:");
        col=scanner.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] matrixSum = new int[row][col];

        System.out.println("Input elements of first matrix:");
        for(int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Input elements of second matrix:");
        for(int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrixSum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }

    }

}


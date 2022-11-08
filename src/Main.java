import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr;
        int size1;
        int size2;
        int sum1 = 0;
        int sum2 = 0;

        System.out.println("Enter the size of the square array:");
        size1 = sc.nextInt();
        size2 = size1;

        arr = new int[size1][size2];

        System.out.println("Enter the elements for this square array");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The square array is: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < size1; i++) {
            sum1 += arr[i][i];
        }
        System.out.println("First diagonal sum from top-left to bottom-right is: " + sum1);

        for (int i = 0; i < size1; i++) {
            sum2 += arr[i][size1 - 1 - i];
        }
        System.out.println("Second diagonal sum from top-right to bottom-left is: "+ sum2);
    }
}
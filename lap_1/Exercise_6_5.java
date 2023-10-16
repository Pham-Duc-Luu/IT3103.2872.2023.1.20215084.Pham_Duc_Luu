package lap_1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_6_5 {

    public static void main(String[] args) {
        double[] numericArray;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter a new array (yes/no)? ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            numericArray = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numericArray[i] = scanner.nextDouble();
            }
        } else {
            numericArray = new double[] { 1789, 2035, 1899, 1456, 2013 };
        }

        Arrays.sort(numericArray);

        double sum = 0.0;
        for (double num : numericArray) {
            sum += num;
        }
        double average = sum / numericArray.length;

        System.out.println("Sorted Array: " + Arrays.toString(numericArray));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);
    }
}
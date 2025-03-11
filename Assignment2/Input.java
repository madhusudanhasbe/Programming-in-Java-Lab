package Assignment2;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public double[] inputNumberArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        return numbers;
    }
}

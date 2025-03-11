package Assignment1_2;
import java.util.Scanner;

public class Input {
    public double[] inputNumbers(){
        double[] numbers = new double[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        numbers[0] = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        numbers[1] = sc.nextDouble();
        return numbers;
    }
}

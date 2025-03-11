package Assignment1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Input input = new Input();
        Calculator calc = new Calculator();
        Scanner s = new Scanner(System.in);
        double[] no;
        System.out.println("-----------------Operations-----------------");
        System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Square Root\n6: Power\n7: Mean\n8: Variance");
        System.out.print("Enter your option: ");
        int option = s.nextInt();
        switch (option){
            case 1: {
                no = input.inputNumbers();
                System.out.println("Addition is: "+ calc.add(no[0], no[1]));
                break;
            }
            case 2: {
                no = input.inputNumbers();
                System.out.println("Subtraction is: "+ calc.sub(no[0], no[1]));
                break;
            }
            case 3: {
                no = input.inputNumbers();
                System.out.println("Multiplication is: "+ calc.mul(no[0], no[1]));
                break;
            }
            case 4: {
                no = input.inputNumbers();
                System.out.println("Division is: " + calc.div(no[0], no[1]));
                break;
            }
            case 5: {
                System.out.println("Enter the number you want square root of: ");
                double sqrt = s.nextDouble();
                System.out.println("Square root is: "+ calc.sqrt(sqrt));
                break;
            }
            case 6: {
                no = input.inputNumbers();
                System.out.println("Power is: "+ calc.power(no[0], no[1]));
                break;
            }
            case 7: {
                calc.mean();
                break;
            }
            case 8: {
                calc.variance();
                break;
            }
            default:
                System.out.println("Invalid input. Ending the program.");
                break;
        }
    }
}
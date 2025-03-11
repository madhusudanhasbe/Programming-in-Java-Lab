package Assignment6_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose stack type:");
        System.out.println("1. Fixed Stack");
        System.out.println("2. Growable Stack");
        System.out.print("Enter your choice: ");
        int stkChoice = sc.nextInt();

        Interface_STK stack;
        if (stkChoice == 1) {
            int[] stackArray = new int[5];
            stack = new Fixed_STK(stackArray, -1);
        } else {
            stack = new Growable_STK();
        }

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    stack.displayStack();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

package Assignment1_1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("Choose an input method:");
        System.out.println("1. Command line args");
        System.out.println("2. Scanner");
        System.out.println("3. BufferedReader");
        System.out.println("4. DataInputStream");
        System.out.println("5. Console");
        choice = sc.nextInt();

        int result = 0;
        switch (choice) {
            case 1:
                result = input.inputUsingCommand(args);
                break;
            case 2:
                result = input.inputUsingScanner();
                break;
            case 3:
                result = input.inputUsingBuffered();
                break;
            case 4:
                result = input.inputUsingDataInput();
                break;
            case 5:
                result = input.inputUsingConsole();
                break;
            default:
                System.out.println("Invalid choice. Retry again.");
                return;
        }
        System.out.println("The factorial is "+ result);
    }
}
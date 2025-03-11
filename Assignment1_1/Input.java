package Assignment1_1;

import java.io.*;
import java.util.*;

public class Input {
    int inputUsingCommand(String[] args){
        int num = 0;
        System.out.println("Enter the number you want to calculate factorial of: ");
        if (args.length > 0) {
            num = Integer.parseInt(args[0]);
        }
        return factorial(num);
    }

    int inputUsingScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to calculate factorial of: ");
        int num = sc.nextInt();
        return factorial(num);
    }

    int inputUsingBuffered() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number you want to calculate factorial of: ");
        int num = Integer.parseInt(br.readLine());
        return factorial(num);
    }

    int inputUsingDataInput() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the number you want to calculate factorial of: ");
        int num = Integer.parseInt(dis.readLine());
        return factorial(num);
    }

    int inputUsingConsole(){
        Console console = System.console();
        System.out.println("Enter the number you want to calculate factorial of: ");
        int num = Integer.parseInt(console.readLine());
        return factorial(num);
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >=1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}

package Assignment6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter student roll number:");
        int rollNo = sc.nextInt();

        System.out.println("Enter marks of subject 1 out of 100:");
        float mark1 = sc.nextFloat();

        System.out.println("Enter marks of subject 2 out of 100:");
        float mark2 = sc.nextFloat();

        Result result = new Result(rollNo, name, mark1, mark2);
        result.displayExamResults();
    }
}

package Assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentFunctions sf = new StudentFunctions();

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Search student");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sf.addStudent();
                    break;
                case 2:
                    sf.displayStudents();
                    break;
                case 3:
                    sf.searchStudent();
                    break;
                case 4:
                    sf.updateStudent();
                    break;
                case 5:
                    sf.deleteStudent();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentFunctions {

    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter PRN: ");
        int prn = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter DOB: ");
        String dob = sc.next();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        students.add(new Student(prn, name, dob, marks));
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("PRN: " + student.getPrn() + ", Name: " + student.getName() + ", DOB: " + student.getDob() + ", Marks: " + student.getMarks());
        }
    }

    public void searchStudent() {
        System.out.print("Enter PRN to search: ");
        int searchPrn = sc.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getPrn() == searchPrn) {
                System.out.println("PRN: " + student.getPrn() + ", Name: " + student.getName() + ", DOB: " + student.getDob() + ", Marks: " + student.getMarks());
                found = true;
                break;
            }
        } 
        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public void updateStudent() {
        System.out.print("Enter PRN to update: ");
        int updatePrn = sc.nextInt();
        for (Student student : students) {
            if (student.getPrn() == updatePrn) {
                System.out.print("Enter new name: ");
                String newName = sc.next();
                System.out.print("Enter new DOB: ");
                String newDob = sc.next();
                System.out.print("Enter new marks: ");
                double newMarks = sc.nextDouble();
                student.setName(newName);
                student.setDob(newDob);
                student.setMarks(newMarks);
                break;
            } else {
                System.out.println("Student not found!");
            }
        }
    }

    public void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        int deletePrn = sc.nextInt();
        students.removeIf(student -> student.getPrn() == deletePrn);
    }
}

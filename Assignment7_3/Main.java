package Assignment7_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoMatchException {
        checkIfIndia cii = new checkIfIndia();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your string: ");
            String Str = sc.next();
            cii.checker(Str);
        } catch (NoMatchException e) {
            System.out.println(e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}

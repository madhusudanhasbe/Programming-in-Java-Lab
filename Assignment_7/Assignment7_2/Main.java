package Assignment7_2;

public class Main {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        try {
            int number = Integer.parseInt(args[0]);
            int factorial = fact.factorial(number);
            System.out.println("Factorial value is: " + factorial);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + args[0] + " is not a valid integer.");
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
        }
    }
}

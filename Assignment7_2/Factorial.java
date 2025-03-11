package Assignment7_2;

public class Factorial {
    public int factorial(int number) throws FactorialException {
        if (number < 0 || number > 15) {
            throw new FactorialException("FactorialException: " + number + " is not in the range 0 and 15.");
        }
        int fact = 1;
        for (int i = number; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}

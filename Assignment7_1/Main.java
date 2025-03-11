package Assignment7_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Functions fnc = new Functions();
        try {
            System.out.print("Enter Numerator of 1st Rational Number: \n");
            int numerator1 = Integer.parseInt(args[0]);
            System.out.print("Enter Denominator of 1st Rational Number: \n");
            int denominator1 = Integer.parseInt(args[1]);
            RationalNumber ratno1 = new RationalNumber(numerator1, denominator1);

            System.out.print("Enter Numerator of 2nd Rational Number: \n");
            int numerator2 = Integer.parseInt(args[2]);
            System.out.print("Enter Denominator of 2nd Rational Number: \n");
            int denominator2 = Integer.parseInt(args[3]);
            RationalNumber ratno2 = new RationalNumber(numerator2, denominator2);

            if (denominator1 == 0 | denominator2 == 0) {
                throw new DenominatorZeroException("Denominator cannot be zero\n");
            } else {
                RationalNumber sum = fnc.add(ratno1, ratno2);
                System.out.println("\nAddition: " + sum.getNumerator() + "/" + sum.getDenominator());

                RationalNumber sub = fnc.subtract(ratno1, ratno2);
                System.out.println("Subtraction: " + sub.getNumerator() + "/" + sub.getDenominator());

                RationalNumber multiply = fnc.multiply(ratno1, ratno2);
                System.out.println("Multiplication: " + multiply.getNumerator() + "/" + multiply.getDenominator());

                RationalNumber divide = fnc.divide(ratno1, ratno2);
                System.out.println("Division: " + divide.getNumerator() + "/" + divide.getDenominator());

                String compare = fnc.compare(ratno1, ratno2);
                System.out.println(ratno1.getNumerator() + "/" + ratno1.getDenominator() + " " + compare + " " + ratno2.getNumerator() + "/" + ratno2.getDenominator());

                float floating = fnc.convertToFloat(ratno1);
                System.out.println("The floating point value of " + ratno1.getNumerator() + "/" + ratno1.getDenominator() + " is " + floating);

                RationalNumber absValue = fnc.absolute(ratno1);
                System.out.println("The absolute value of " + ratno1.getNumerator() + "/" + ratno1.getDenominator() + " is " + absValue.getNumerator() + "/" + absValue.getDenominator());
            }
        } catch (DenominatorZeroException | NumberFormatException e) {
            System.out.println(e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
package Assignment7_1;

public class Functions {
    public RationalNumber add(RationalNumber r1, RationalNumber r2) {
        int r1_numerator = r1.getNumerator();
        int r2_numerator = r2.getNumerator();

        int r1_denominator = r1.getDenominator();
        int r2_denominator = r2.getDenominator();

        int r1_numerator_new = r1_numerator * r2_denominator;
        int r2_numerator_new = r2_numerator * r1_denominator;
        int common_denominator = r1_denominator * r2_denominator;

        if (r2_denominator == r1_denominator) {
            r1_numerator_new = r1_numerator;
            r2_numerator_new = r2_numerator;
            common_denominator = r2_denominator;
        }

        int result_numerator = r1_numerator_new + r2_numerator_new;

        if (result_numerator < 0 && common_denominator < 0) {
            result_numerator = Math.abs(result_numerator);
            common_denominator = Math.abs(common_denominator);
        }

        return new RationalNumber(result_numerator, common_denominator);
    }

    public RationalNumber subtract(RationalNumber r1, RationalNumber r2) {
        int r1_numerator = r1.getNumerator();
        int r2_numerator = r2.getNumerator();

        int r1_denominator = r1.getDenominator();
        int r2_denominator = r2.getDenominator();

        int r1_numerator_new = r1_numerator * r2_denominator;
        int r2_numerator_new = r2_numerator * r1_denominator;
        int common_denominator = r1_denominator * r2_denominator;

        if (r2_denominator == r1_denominator) {
            r1_numerator_new = r1_numerator;
            r2_numerator_new = r2_numerator;
            common_denominator = r2_denominator;
        }

        int result_numerator = r1_numerator_new - r2_numerator_new;

        if (result_numerator < 0 && common_denominator < 0) {
            result_numerator = Math.abs(result_numerator);
            common_denominator = Math.abs(common_denominator);
        }

        return new RationalNumber(result_numerator, common_denominator);
    }

    public RationalNumber multiply(RationalNumber r1, RationalNumber r2) {
        int r1_numerator = r1.getNumerator();
        int r2_numerator = r2.getNumerator();

        int r1_denominator = r1.getDenominator();
        int r2_denominator = r2.getDenominator();


        int result_numerator = (r1_numerator * r2_numerator);
        int result_denominator = (r1_denominator * r2_denominator);

        if (result_numerator < 0 && result_denominator < 0) {
            result_numerator = Math.abs(result_numerator);
            result_denominator = Math.abs(result_denominator);
        }

        return new RationalNumber(result_numerator, result_denominator);
    }

    public RationalNumber divide(RationalNumber r1, RationalNumber r2) {
        int r1_numerator = r1.getNumerator();
        int r2_numerator = r2.getNumerator();

        int r1_denominator = r1.getDenominator();
        int r2_denominator = r2.getDenominator();


        int result_numerator = (r1_numerator * r2_denominator);
        int result_denominator = (r1_denominator * r2_numerator);

        if (result_numerator < 0 && result_denominator < 0) {
            result_numerator = Math.abs(result_numerator);
            result_denominator = Math.abs(result_denominator);
        }

        return new RationalNumber(result_numerator, result_denominator);
    }

    public String compare(RationalNumber r1, RationalNumber r2) {
        int r1_numerator = r1.getNumerator();
        int r2_numerator = r2.getNumerator();

        int r1_denominator = r1.getDenominator();
        int r2_denominator = r2.getDenominator();

        int r1_numerator_new = r1_numerator * r2_denominator;
        int r2_numerator_new = r2_numerator * r1_denominator;

        String result;


        if (r2_denominator == r1_denominator) {
            r1_numerator_new = r1_numerator;
            r2_numerator_new = r2_numerator;
        }

        if (r1_numerator_new == r2_numerator_new) {
            result = "=";
        } else if (r1_numerator_new > r2_numerator_new) {
            result = ">";
        } else {
            result = "<";
        }

        return result;
    }

    public float convertToFloat(RationalNumber r1) {
        return (float) r1.getNumerator() / r1.getDenominator();
    }

    public RationalNumber absolute(RationalNumber r1) {
        return new RationalNumber(Math.abs(r1.getNumerator()), Math.abs(r1.getDenominator()));
    }
}
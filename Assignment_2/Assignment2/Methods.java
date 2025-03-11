package Assignment2;

import java.util.*;

public class Methods {

    public void ArraySorter() {
        Input input = new Input();
        double[] numbers = input.inputNumberArray();
        double[] even = new double[numbers.length];
        double[] odd = new double[numbers.length];
        int evenIndex = 0;
        int oddIndex = 0;
        for (double number : numbers) {
            if (number % 2 == 0) {
                even[evenIndex++] = number;
            } else {
                odd[oddIndex++] = number;
            }
        }
        System.out.println("Even numbers: " + Arrays.toString(even));
        System.out.println("Odd numbers: " + Arrays.toString(odd));
    }

    public int findClosestPair(double[] numbers) {
        int minDistanceIndex = -1;
        double minDistance = Double.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            double distance = Math.abs(numbers[i] - numbers[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                minDistanceIndex = i;
            }
        }
        return minDistanceIndex;
    }

    public void ArrayConverter() {
        Input input = new Input();
        double[] array = input.inputNumberArray();

        List<Double> list = new ArrayList<>();
        for (double num : array) {
            list.add(num);
        }
        System.out.println("ArrayList: " + list);

        double[] newArray = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        System.out.println("Array: " + Arrays.toString(newArray));
    }
}

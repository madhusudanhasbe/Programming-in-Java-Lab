package Assignment2;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Methods methods = new Methods();
        methods.ArraySorter();
        double[] numbers = input.inputNumberArray();
        int index = methods.findClosestPair(numbers);
        System.out.println("The index of the first number of the closest pair is: " + index);
        methods.ArrayConverter();
    }
}

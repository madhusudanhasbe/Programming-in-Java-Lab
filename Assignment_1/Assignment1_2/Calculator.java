package Assignment1_2;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public double add(double n1, double n2) {
        return n1 + n2;
    }
    public double sub(double n1, double n2){
        return n1-n2;
    }
    public double mul(double n1, double n2){
        return n1*n2;
    }
    public double div(double n1, double n2){
        if (n2 == 0){
            System.out.println("Denominator cannot be zero.");
            return Double.POSITIVE_INFINITY;
        }
        else {
            return n1/n2;
        }
    }
    public double sqrt(double n1){
        return Math.sqrt(n1);
    }
    public double power(double n1, double n2){
        return Math.pow(n1, n2);
    }
    public void mean(){
        Scanner sc = new Scanner(System.in);
        String str;
        int ctr = 0;
        double result = 0;
        do {
            System.out.print("Enter Number "+ (ctr+1) +": ");
            str = sc.next();
            if(str.equals("end"))
                break;
            else {
                double no = Double.parseDouble(str);
                result = result + no;
                ctr = ctr+1;
            }
        }while(true);
        System.out.println("Mean is: "+result/ctr);
    }
    public void variance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = sc.nextInt();
        double [] arr = new double[arr_size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextDouble();
        }
        double mean = Arrays.stream(arr).sum() / arr.length;
        double variance = 0;
        for (double number : arr) {
            variance += Math.pow(number - mean, 2);
        }
        variance /= arr.length - 1;
        System.out.println("Variance is: "+ variance);
    }
}
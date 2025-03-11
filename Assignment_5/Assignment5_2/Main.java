package Assignment5_2;

public class Main {

    public static void main(String[] args) {
        System.out.println("======Normal Employee======");
        NormalEmployee n = new NormalEmployee();
        n.getEmployeeDetails();
        n.salaryCalculation();
        System.out.println();
        System.out.println("======Bonus Employee=======");
        BonusEmployee b = new BonusEmployee();
        b.getEmployeeDetails();
        b.salaryCalculation();
    }
}

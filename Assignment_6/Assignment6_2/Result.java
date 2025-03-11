package Assignment6_2;

public class Result extends Student implements Exam {
    public Result(int roll_no, String name, float mark1, float mark2) {
        super(roll_no, name, mark1, mark2);
    }

    public float percent_cal() {
        return (mark1 + mark2) / 2;
    }

    public void displayExamResults() {
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Marks in Subject 1: " + mark1);
        System.out.println("Marks in Subject 2: " + mark2);
        System.out.println("Percentage: " + percent_cal() + "%");
    }
}

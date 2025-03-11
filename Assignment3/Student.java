package Assignment3;

public class Student {

    private int prn;
    private String name;
    private String dob;
    private double marks;

    public Student(int prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public int getPrn() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public double getMarks() {
        return marks;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}


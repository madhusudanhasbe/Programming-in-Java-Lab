package Assignment5_2;

public class BonusEmployee extends Employee {

    @Override
    public void salaryCalculation() {
        double bw = ((getGrosswage() / getTotalWorkingDays()) * getPaidDays()) * 0.45;
        setBasicWage(bw);
        double hra = (bw * 0.40);
        setHra(hra);
        double ca = ((double) 1600 / getTotalWorkingDays()) * getPaidDays();
        setConveyanceAllowances(ca);
        double ma = ((double) 1250 / getTotalWorkingDays()) * getPaidDays();
        setMedicalAllowances(ma);
        double otherAllo = ((getGrosswage() / getTotalWorkingDays()) * getPaidDays()) - (bw + hra + ca + ma);
        setTotalEarning(bw + hra + ca + ma + otherAllo);
        System.out.println("Total Earnings: " + getTotalEarning());
        double epf;
        if (bw >= 15000) {
            epf = ((double) (15000 * 12) / 100);
        } else {
            epf = ((bw * 15) / 100);
        }
        setEpf(epf);
        double esi;
        if (getGrosswage() <= 21000) {
            esi = (getTotalEarning() * 0.75) / 100;
        } else {
            esi = 0;
        }
        setEsi(esi);
        setPt(0);
        setLoanRecovery(0);
        setTotalDeductions(getEpf() + getEsi() + getPt() + getLoanRecovery());
        System.out.println("Total Deductions: " + getTotalDeductions());
        setNetSalary((getTotalEarning() + (getTotalEarning() * getBonus())) - getTotalDeductions());
        System.out.println("Net Salary: " + getNetSalary());
    }
}

package kettle.chapter_8;

import kettle.chapter_8.Employee;

//стр. 171
public class FullTimeEmployee extends Employee {

    private double weeklySalary;  //оплата за неделю
    private double benefitDeduction; //вычет за льготы

    public void setWeeklySalary(double weeklySalaryIn) {
        weeklySalary = weeklySalaryIn;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }


    public void setBenefitDeduction(double benefitDedIn) {
        benefitDeduction = benefitDedIn;
    }

    public double getBenefitDeduction() {
        return benefitDeduction;
    }

    public double findPaymentAmount() {
        return weeklySalary - benefitDeduction;
    }
}

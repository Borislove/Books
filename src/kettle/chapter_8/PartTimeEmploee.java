package kettle.chapter_8;

import kettle.chapter_8.Employee;

public class PartTimeEmploee extends Employee {

    private double hourlyRate;

    public void setHourlyRate(double rateIn) {
        hourlyRate = rateIn;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double findPaymentAmount(int hours) {
        return hourlyRate * hours;
    }
}
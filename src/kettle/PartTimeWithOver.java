package kettle;

import kettle.chapter_8.PartTimeEmploee;

public class PartTimeWithOver extends PartTimeEmploee {

    @Override
    public double findPaymentAmount(int hours) {
        if (hours <= 40) {
            return getHourlyRate() * hours;
        } else {
            return getHourlyRate() * 40 + getHourlyRate() * 2 * (hours - 40);
        }
    }
}

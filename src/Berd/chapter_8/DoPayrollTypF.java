package Berd.chapter_8;

//���. 174

public class DoPayrollTypF {

    public static void main(String[] args) {

        FullTimeEmployee ftEmployee = new FullTimeEmployee();


        //�������
        ftEmployee.setName("Golovastick");
        ftEmployee.setJobTitle("Gamer");
        ftEmployee.setWeeklySalary(1000.00);
        ftEmployee.setBenefitDeduction(100.00);

        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
        System.out.println();

        //����������
        PartTimeEmploee ptEmployee = new PartTimeEmploee();
        ptEmployee.setName("Stive");
        ptEmployee.setJobTitle("Milkman");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(10));

        //����������, �� ������ �������
        PartTimeWithOver ptoEmployee = new PartTimeWithOver();
        ptoEmployee.setName("Garry");
        ptoEmployee.setJobTitle("Balabol");
        ptoEmployee.setHourlyRate(7.53);
        ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(10));
    }
}

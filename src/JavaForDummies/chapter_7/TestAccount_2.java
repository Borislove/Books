package JavaForDummies.chapter_7;

public class TestAccount_2 {

    String name;
    String address;
    double balance;

    @Override
    public String toString() {
        return "TestAccount_2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class Use_TestAccount_2 {

    public static void main(String[] args) {

        TestAccount_2 acc = new TestAccount_2();

        acc.name = "Pups";
        acc.address = "pupso street";
        acc.balance = 2222.2;

        System.out.println(acc);
    }
}

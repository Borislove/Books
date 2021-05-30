package JavaForDummies.chapter_7;

public class TestAccount {

    private String name;
    private String address;
    private double balance;

    private TestAccount(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public void print(TestAccount testAccount) {
        System.out.println(testAccount);
    }

    @Override
    public String toString() {
        return "TestAccount{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        //System.out.println(new TestAccount("Vasya", "Pupkin street", 22.0d));

        TestAccount oneAccount = new TestAccount("Vaska", "Pupkin street", 33.0);
        oneAccount.print(oneAccount);
    }
}

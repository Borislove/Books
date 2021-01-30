package headfirstjava.chapter_15;

public class BankAccount {
    private int balance =100;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }
}

class RyanAndMonicaJob implements Runnable{
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);

        one.setName("Райан");
        two.setName("Моника");
        one.start();
        two.start();
    }

    public void run(){
        for (int i = 0; i <10 ; i++) {
            makeWithdrawal(10);
            if(account.getBalance()<0){
                System.out.println("Превышение лимит!");
            }
        }
    }

    private void makeWithdrawal(int amount){
        if(account.getBalance() >=amount){
            System.out.println(Thread.currentThread().getName()+"собирается снять деньги");
            try{
                System.out.println(Thread.currentThread().getName()+ "идет подремать");
                Thread.sleep(500);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+ "заканчивает транзакцию");
        }else {
            System.out.println("Извините, для клиента "+Thread.currentThread().getName()+ " недостаточно денег");
        }
    }
}

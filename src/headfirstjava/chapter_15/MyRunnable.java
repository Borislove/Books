package headfirstjava.chapter_15;

public class MyRunnable implements Runnable {
    public void run(){
        go();
    }

    public void go(){
        doMore();
    }

    public void doMore(){
        System.out.println("Вершина стека");
    }
}

class ThreadTester{
    public static void main(String[] args) {

        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();
        System.out.println("Возвращаемся в метод main");
    }
}

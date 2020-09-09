package philosophyofjava.chapter4;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        //другие команды недопустимы
        for (; true; ) {  //infinity loop
            inner:
            //другие команды недопустимы
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++; //В противном случаее значение i не увеличивается
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++)
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
            }
        }
    }
}

package Java_for_Kids.chapter_8;

public class TestStackTrace {
    TestStackTrace() {
        divideByZero();
    }

    int divideByZero() {
        return 25 / 0;
    }

   public static void main(String[] args) {
        new TestStackTrace();
    }
}


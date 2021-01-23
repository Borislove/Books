package headfirstjava.chapter_10;

public class TestBox {

    Integer i = 11;
    int j;

    public void go(){
        j =i;
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
}

//NullPointerException  , i -default
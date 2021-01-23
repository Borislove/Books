package headfirstjava.chapter_10;

public class Duck {

    private int size;

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
//        System.out.println("Размер утки равен" +size);  // private
    }

    public static class Test {

        public static void main(String[] args) {

            int x = 123;
            Integer iWrap = new Integer(x);

            int unWrapped = iWrap.intValue();
            System.out.println(unWrapped);
        }
    }
}

package philosophyofjava.chapter6;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("Конструктор ChocolateChip");
    }

    public void chomp() {
        // !bite(); //метод bite недоступен
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}

package philosophyofjava.chapter5;

//Использование finzlize() для выявления объекта, не осуществившего необходимой фанализации.


class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Ошибка:  checkeOut");
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //Правильная очистка:
        novel.checkIn();
        //Теряем ссылку, забыли про очистку:
        new Book(true);
        //Принудительная уборка мусора и финализация:
        System.gc();
    }
}

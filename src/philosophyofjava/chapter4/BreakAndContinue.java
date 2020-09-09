package philosophyofjava.chapter4;

//Применение ключевых слов break и continue
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break; //Выход из цикла
            if (i % 9 != 0) continue;//Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
        //Использование foreach:
        //for(int i : range(100))

        //"Бесконечный цикл":
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }

}

package philosophyofjava.chapter3;

//Экспоненциальная запись
// "е" обозначает "10 в степени".
public class Exponents {
    public static void main(String[] args) {
        //Прописная и строчная буквы "е" эквивалентны:
        float expFloat = 1.39e-43f;
        //expFloat = 1.39E - 43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; //Суффикс 'd' не обязателене
        double expDouble2 = 47e47; //Автоматически определяется double
        System.out.println("expDouble = " + expDouble);
    }
}

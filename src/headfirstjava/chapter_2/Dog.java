package headfirstjava.chapter_2;

//стр. 66
public class Dog {

    //переменные экземпляра
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Гав! Гав");
    }
}

//проверочный класс
class DogTestDrive{
    public static void main(String[] args) {
        Dog d = new Dog();  //Создаем объект класса Dog
        d.size = 40; //Используем оператор доступа.Устанавливаем значение поля size.
        d.bark(); //Вызываем метод bark()
    }
}

//   . - оператор доступа

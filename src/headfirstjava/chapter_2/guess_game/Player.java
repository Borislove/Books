package headfirstjava.chapter_2.guess_game;

//класс хранит число, всего 3 экземпляра, для каждого новое, шаблон, при вызове методе guess - генерируется случайное число
public class Player {
    int number = 0; //сдесь хранится вариант числа

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}

 class GameLauncher {
    public static void main(String[] args) {

        GuessGame game = new GuessGame();
        game.startGame();
    }
}

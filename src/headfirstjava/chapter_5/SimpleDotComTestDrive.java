package headfirstjava.chapter_5;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        //создаем экземпляр класса
        SimpleDotCom dot = new SimpleDotCom();

        //массив для местоположения
        int[] locations = {2, 3, 4};

        //вызываем сеттер
        dot.setLocationCells(locations);

        //делаем ход от имени пользователя
        String userGuess = "2";

        //вызваем метод объекта
        String result = dot.checkYourself(userGuess);


       /* String testResult = "Неудача";

        if(result.equals("Попал")){
            testResult = "Пройден";
        }

        System.out.println(testResult);*/
    }
}

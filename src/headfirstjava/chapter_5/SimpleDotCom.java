package headfirstjava.chapter_5;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[]locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        //преобразуем тип String в int
        int guess = Integer.parseInt(stringGuess);
        //переменная для хранение результата
        String result = "Мимо";

        for (int cell : locationCells) {
            //сравниваем ход пользователя с ячейкой
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        //создаем переменную, чтобы следить за кол-ом ходов пользователя
        int numOfGuesses=0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        //генерируем случайное число для первой ячейки и используем его для формировани массива ячеек
        int randomNum = (int)(Math.random()*5);
        int[]locations = {randomNum, randomNum+1, randomNum+2};
        //передаем местоположение
        theDotCom.setLocationCells(locations);
        //проверка на окончание игры
        boolean isAlive = true;

        while (isAlive == true){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            //инкрементируем кол-во попыток
            numOfGuesses++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось "+numOfGuesses +" попыток(и)");
            }
        }

    }
}

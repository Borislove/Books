package Java_for_Kids.chapter_4;

public class Players {

    public static void main(String[] args) {
        //размер массива заранее известен
        String players[] = new String[4];
        players[0] = "David";
        players[1] = "Daniel";
        players[2] = "Anna";
        players[3] = "Gregory";

        int totalPlayers = players.length;
        System.out.println("всего игроков: " + totalPlayers);

        String[] players_2 = {"David", "Daniel", "Anna", "Gregory"};
        String theWinner = players[1];
        System.out.println("Поздравляем, " + theWinner + "!");

        //поздравление для нескольких победителей
        int counter;
        System.out.println("цикл for");
        for (counter = 0; counter < totalPlayers; counter++) {
            String thePlayer = players[counter];
            System.out.println("Поздравляем, " + thePlayer + "!");
        }

        //пример цикла while
        counter = 0;
        System.out.println("цикл while");
        while (counter < totalPlayers) {
            String thePlayer = players[counter];
            System.out.println("Поздравляем, " + thePlayer + "!");
            counter++;
        }


        //пример цикла while с break
        counter = 0;
        System.out.println("цикл while и выпадение ");
        while (counter < totalPlayers) {
            if (counter == 3) {
                break; // Выпрыгиваем из цикла
            }
            String thePlayer = players[counter];
            System.out.println("Congratulations, " + thePlayer + "!");
            counter++;
        }

        //пример цикла while с обходом
        counter = 0;
        System.out.println("цикл while с пропуском ");
        while (counter < totalPlayers) {
            //counter++; // TODO: 30.05.2021 ArrayIndexOutOfBoundsException
            String thePlayer = players[counter];
            counter++;
            if (thePlayer.equals("David")) {
                continue;
            }
            System.out.println("Congratulations, " + thePlayer + "!");
        }
    }
}


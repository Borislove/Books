package headfirstjava.chapter_10;

public class Player {

    static int playerCount = 0;
    private String name;

    public Player(String name) {
        this.name = name;
        playerCount++;
    }

    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger");
        System.out.println(Player.playerCount);
    }
}

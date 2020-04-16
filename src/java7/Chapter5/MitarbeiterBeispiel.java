package java7.Chapter5;

public class MitarbeiterBeispiel {
    public static void main(String[] args) {

        Mitarbeiter[] personalListe = new Mitarbeiter[3];

        personalListe[0] = new Chef("Граучо","Маркс",8000);
        personalListe[1] = new Angestellter("Чико","Маркс",4000);
        personalListe[2] = new Lehrling("Харпо","Маркс",1000);

        // Выходные данные
        for (int i = 0; i < personalListe.length; i++)
            personalListe[i].datenAusgeben();

        // Зарплата
        for (int i = 0; i < personalListe.length; i++)
            personalListe[i].gehaltErhoehen(1000);

        // Выходные данные
        for (int i = 0; i < personalListe.length; i++)
            personalListe[i].datenAusgeben();

    }
}
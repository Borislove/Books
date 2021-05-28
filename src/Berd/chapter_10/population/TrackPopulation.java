package Berd.chapter_10.population;

//стр. 220
/*
public class TrackPopulation {

    public static void main(String[] args) {

        int smackoverARpop = 2232;

        birth(smackoverARpop);
        System.out.println(smackoverARpop);
    }

    static void birth(int cityPop) {
        cityPop++;
    }
}
*/

public class TrackPopulation {

    public static void main(String[] args) {

        int smackoverARpop = 2232;

        smackoverARpop = birth(smackoverARpop);
        System.out.println(smackoverARpop);
    }

    static int birth(int cityPop) {
        return cityPop + 1;
    }
}
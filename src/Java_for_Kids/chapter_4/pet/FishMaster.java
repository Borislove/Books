package Java_for_Kids.chapter_4.pet;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();
        // Попробуем заставить рыбу погрузиться ниже 100 метров
        myFish.dive(2);
        myFish.dive(97);
        myFish.dive(3);
        myFish.sleep();
    }
}


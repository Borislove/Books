package Java_for_Kids.chapter_10.pet;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish(20);
        myFish.dive(2);
        myFish.dive(); // новый перегруженный метод
        myFish.dive(97);
        myFish.dive(3);
       // myFish.sleep();
    }
}

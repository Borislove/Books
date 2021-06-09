package Java_for_Kids.chapter_4.pet_1;

public class Fish extends Pet {

    int currentDepth;

    Fish(int startingPosition) {
        currentDepth = startingPosition;
    }

    public static void main(String[] args) {

        Fish fish = new Fish(20);
    }
}

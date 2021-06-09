package Java_for_Kids.chapter_10.pet;

public class Pet {
    int age;
    public float weight;
    float height;
    public String color;

    public void sleep() {
        System.out.println("Спокойной ночи! До завтра");
    }

    public void eat() {
        System.out.println(
                "Я очень голоден, давайте перекусим чипсами!");
    }

    public String say(String aWord) {
        String petResponse = "Ну ладно!! " + aWord;
        return petResponse;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



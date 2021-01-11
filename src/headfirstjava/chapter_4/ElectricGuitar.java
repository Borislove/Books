package headfirstjava.chapter_4;

public class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        this.brand = aBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        this.numOfPickups = num;
    }

    boolean isRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        this.rockStarUsesIt = yesOrNo;
    }

    public static void main(String[] args) {

        ElectricGuitar eg = new ElectricGuitar();
        eg.setBrand("Brand #1");
        System.out.println(eg.getBrand());
    }
}

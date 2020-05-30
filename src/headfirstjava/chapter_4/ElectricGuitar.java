package headfirstjava.chapter_4;

public class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        this.brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        this.numOfPickups = num;
    }

    public boolean isRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean yesOrNo) {
        this.rockStarUsesIt = yesOrNo;
    }
}

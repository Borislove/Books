package headfirstjava.chapter_4;

public class Song {

    String artist;
    String tittle;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    void play() {
        playSound(tittle);
    }

    void playSound(String tittle) {
        this.tittle = tittle;
    }
}

class SongTestDrive {
    public static void main(String[] args) {

        Song t2 = new Song();
        t2.setArtist("Travis");
        t2.setTittle("Sing");

        Song s3 = new Song();
        s3.setArtist("Sex Pistols");
        s3.setTittle("My Way");

        t2.play();
        s3.play();
    }
}
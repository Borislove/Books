package headfirstjava.chapter_16;

public class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }
}


package headfirstjava.chapter_11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;


public class MusicTest1 {

    public void play()  {
        try {
            Sequencer sequence = MidiSystem.getSequencer();

            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }


    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
       mt.play();
    }
}



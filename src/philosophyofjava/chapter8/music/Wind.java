package philosophyofjava.chapter8.music;

//Объекты Wind также являются объектами Instrument,
//поскольку имеют тот же интерфейс:
public class Wind extends Instrument{
    //Переопределение метода интерфейса:
    public void play(Note n){
        System.out.println("Wind.play() "+n);
    }
}

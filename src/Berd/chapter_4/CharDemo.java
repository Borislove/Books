package Berd.chapter_4;

//стр.81 Программа которая изменяет регистр буквы...
public class CharDemo {
    public static void main(String[] args) {
        char myLittleChar = 'b';
        char myBigChar = Character.toUpperCase(myLittleChar);
        System.out.println(myBigChar);
    }
}

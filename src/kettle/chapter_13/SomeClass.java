package kettle.chapter_13;

public class SomeClass {
    private int myField = 10;

    public int myField_1 = 10;
}

class SomeOtherClass {
    public static void main(String[] args) {

        SomeClass someObject = new SomeClass();

        //этот код не скомпилируется, т.к поле private
        //System.out.println(someObject.myField);

        System.out.println(someObject.myField_1);
    }
}

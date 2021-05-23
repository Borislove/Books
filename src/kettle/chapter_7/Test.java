package kettle.chapter_7;

public class Test {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (!n.equals("")) {
            name = n;
        } else System.out.println("ошибка!Вы забыли задать имя!");
    }

    public static void main(String[] args) {
        //  new TestEmployee().setName("");
        new Test().setName("Name");
    }
}

package philosophyofjava.сhapter7;

//Совмещение композиции и наследования.

class Plate {
    Plate(int i) {
        System.out.println("Конструктор Plate");
    }
}

class DinnewPlate extends Plate {
    DinnewPlate(int i) {
        super(i);
        System.out.println("Конструктор DinnewPlate");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Конструктор Utensil");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Конструктор Spoon");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Конструктор Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Конструктор Knife");
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Конструктор Custom");
    }
}

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnewPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnewPlate(i + 5);
        System.out.println("Конструктор PlaceSetting");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}

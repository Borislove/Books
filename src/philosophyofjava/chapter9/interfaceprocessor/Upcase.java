package philosophyofjava.chapter9.interfaceprocessor;

public class Upcase extends StringProcessor {
    public String process(Object input) { //Ковариантный возвращаемый тип
        return ((String) input).toUpperCase();
    }
}

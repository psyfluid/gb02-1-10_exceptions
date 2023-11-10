package gb.hw03;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException() {
        super("Введена пустая строка");
    }
}

package gb.hw03;

public class InvalidDateException extends RuntimeException {
    public InvalidDateException() {
        super("Введена неверная дата");
    }
}

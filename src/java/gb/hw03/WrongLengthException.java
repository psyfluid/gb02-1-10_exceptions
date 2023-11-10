package gb.hw03;

public class WrongLengthException extends RuntimeException {
    public WrongLengthException() {
        super("Введено неверное количество данных");
    }
}

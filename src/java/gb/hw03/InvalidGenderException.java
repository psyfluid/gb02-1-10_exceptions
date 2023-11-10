package gb.hw03;

public class InvalidGenderException extends RuntimeException {
    public InvalidGenderException() {
        super("Введен неверный пол");
    }
}

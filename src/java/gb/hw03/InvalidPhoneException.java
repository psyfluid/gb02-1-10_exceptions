package gb.hw03;

public class InvalidPhoneException extends RuntimeException {
    public InvalidPhoneException() {
        super("Введен неверный номер телефона");
    }
}

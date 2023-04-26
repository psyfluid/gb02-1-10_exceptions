package gb.hw02.hw02_4;

public class EmptyStringException extends UnsupportedOperationException {
    public EmptyStringException() {
        super("Empty strings are not supported");
    }
}

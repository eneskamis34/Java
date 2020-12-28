public class myException extends Exception {

    String message;
    public myException(String message)
    {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return  message;
    }
}

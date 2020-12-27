public class FileLogger extends BaseLogger {
    String name = "File Log";
    public void log(String message)
    {
        System.out.println("Logged to File:" + message);
    }
}

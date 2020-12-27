public class CustomManager {

    private BaseLogger baseLogger;
    public CustomManager(BaseLogger baseLogger)
    {
        this.baseLogger = baseLogger;
    }

    public void add()
    {
        System.out.println("Müşteri Eklendi.");
        baseLogger.log("Log ekleme mesajı");

       /* DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Custom Log");*/

    }
}

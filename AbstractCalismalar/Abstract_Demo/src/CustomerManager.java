public class CustomerManager {

    DatabaseManager databaseManager;

    public void getCustomers()
    {

        databaseManager.getData(); // Artık bağımlı değil hangisi gelirse gelsin çalışacak.

        /*
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();
        böyle tanımlarsak bir classa bağımlı hale gelmiş oluruz.
         */
    }



}

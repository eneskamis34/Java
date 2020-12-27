public class Main {
    public static void main(String[] args) {
        /*
        CustomerManager customerManager = new CustomerManager();
        customerManager.getCustomers(); // Bu hatadır! Çünkü bağlantılı olarak doğrudan abstract clası refere ediyor ve abstract class new edilemez.
        */
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();

        customerManager.databaseManager = new SqlDatabaseManager();
        customerManager.getCustomers();

    }
}

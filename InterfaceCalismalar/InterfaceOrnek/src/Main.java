public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

        //Interface implement edilir.
        //Birden fazla implementasyon yapılabilir.
        //gövdesi asla dolu olamaz.
        //Referans yer tutucu görevi görür.
    }
}

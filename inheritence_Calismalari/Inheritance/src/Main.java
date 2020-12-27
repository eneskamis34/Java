public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Emplooye emplooye = new Emplooye();
        String adi = emplooye.name;
        int yasi = customer.age;
        // Person Sınıfının özellikleri Employee ve Customer sınıfının içerisinde de bulunduğu için
        //Tek bir sınıfa toplayarak alt sınıflar "extends" ile o özellikleri kullanabilir konuma gelmektedir.
    }
}

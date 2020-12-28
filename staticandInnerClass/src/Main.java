public class Main {
    public static void main(String[] args) {
        //Bir metot static ise o classın adı ile doğrudan çağırılır.
        //ClassAdi.metot();
        //Static metodu "new" ile classı yaratmaya gerek olmadan çağırırız.

        Product product = new Product(1,"Laptop",5000);
        ProductManager productManager =  new ProductManager();
        productManager.add(product);

        //Inner Class yapısı ile çekiyoruz.
        //Pek tavsiye edilmiyor çünkü SOLID prensipleri ile çelişiyor.
        //bu sefer bir sınıfın birden fazla görevi olmuş oluyor.
        DatabaseHelper.CRUD.add();
        DatabaseHelper.Connection.connection();
    }
}
